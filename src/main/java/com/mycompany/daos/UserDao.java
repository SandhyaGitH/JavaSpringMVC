/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daos;

import com.mycompany.models.ErrorDetails;
import com.mycompany.models.User;
import java.util.List;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author samarth
 */
/*
@NamedStoredProcedureQuery(
            name = "InsertUser",
            procedureName = "SP_InsertUser",
            parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN,type=String.class,name="Email"),
                @StoredProcedureParameter(mode = ParameterMode.IN,type=String.class,name="Password"),
                @StoredProcedureParameter(mode = ParameterMode.IN,type=String.class,name="Role"),
                @StoredProcedureParameter(mode = ParameterMode.OUT,type=String.class,name="UserId"),
                @StoredProcedureParameter(mode = ParameterMode.OUT,type=String.class,name="Error"),
            }
    ) */
public class UserDao extends DAO {

    public int LoginUser(User user) {
        int entityID = 0;
        try {
            //tx = 
            beginTransaction();

            StoredProcedureQuery q = getSession().createStoredProcedureQuery("SP_AuthenticateUser")
                    .registerStoredProcedureParameter("Email", String.class, ParameterMode.IN)
                    .registerStoredProcedureParameter("Password", String.class, ParameterMode.IN)
                   .registerStoredProcedureParameter("entityID", Integer.class, ParameterMode.OUT)
                    .registerStoredProcedureParameter("UserID", Integer.class, ParameterMode.OUT)
                    .registerStoredProcedureParameter("Error", String.class, ParameterMode.OUT);

            q.setParameter("Email", user.getEmail());
            q.setParameter("Password", user.getPassword());
           
            q.execute();
           // String UserId = (String) q.getOutputParameterValue("UserId");
            entityID = (int) q.getOutputParameterValue("entityID");
            user.setUserID((int) q.getOutputParameterValue("UserId"));
            String er = (String) q.getOutputParameterValue("Error");
            commit();
            
        } catch (HibernateException hx) {
            rollback();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally  {
            close();
        }
        return entityID;
    }

    public ErrorDetails SignUpUser(User user) {
        //Transaction tx = null;
        ErrorDetails error =  null; 
        try {
            //tx = 
            beginTransaction();

            StoredProcedureQuery q = getSession().createStoredProcedureQuery("SP_InsertUser")
                    .registerStoredProcedureParameter("Email", String.class, ParameterMode.IN)
                    .registerStoredProcedureParameter("Password", String.class, ParameterMode.IN)
                    .registerStoredProcedureParameter("Role", String.class, ParameterMode.IN)
                    .registerStoredProcedureParameter("UserId", String.class, ParameterMode.OUT)
                    .registerStoredProcedureParameter("Error", String.class, ParameterMode.OUT);

            q.setParameter("Email", user.getEmail());
            q.setParameter("Password", user.getPassword());
            q.setParameter("Role", user.getRole());
            q.execute();
           
            String er = (String) q.getOutputParameterValue("Error");
            if(er.equals(""))
            {
            String UserId = (String) q.getOutputParameterValue("UserId");   
            user.setUserID(Integer.parseInt(UserId));
            error = new ErrorDetails(false, "");
            }
            else
            {
                error = new ErrorDetails(true, er);
            }
            
            commit();
            
        } catch (HibernateException hx) {
            rollback();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally  {
            close();
        }
        return error;
    }

}
