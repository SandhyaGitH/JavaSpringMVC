/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daos;

import static com.mycompany.daos.DAO.close;
import static com.mycompany.daos.DAO.getSession;
import com.mycompany.models.Program;
import com.mycompany.models.University;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author samarth
 */
public class ProgramDao extends DAO{
    
     public List<Program> findByUniversity(int UniversityID) {
        //Transaction tx = null;
        //List<String> Universities = new ArrayList<String>();
       List<Program> results=null;
        try {
            //tx = 
            beginTransaction();
           
            Criteria crit = getSession().createCriteria(Program.class);
            crit.add(Restrictions.eq("universityID",UniversityID));
            results= crit.list();
            
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

