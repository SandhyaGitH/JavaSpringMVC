/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daos;

import static com.mycompany.daos.DAO.close;
import com.mycompany.models.University;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.HibernateException;



/**
 *
 * @author samarth
 */
public class UniversityDao extends DAO{
    
     public List<University> getUniversities() {
        //Transaction tx = null;
        //List<String> Universities = new ArrayList<String>();
       List<University> results=null;
        try {
            //tx = 
            beginTransaction();
           
          Query query = getSession().getNamedQuery("University.findAll");
          results = query.getResultList();
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
        return results;
     }
}
