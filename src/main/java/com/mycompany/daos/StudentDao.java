/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.daos;

import static com.mycompany.daos.DAO.close;
import com.mycompany.models.Address;
import com.mycompany.models.Person;
import com.mycompany.models.Student;
import com.mycompany.models.StudentBG;
import com.mycompany.models.AcademicRecord;
import com.mycompany.models.StudentAchievements;
import com.sun.tools.doclint.HtmlTag;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
//import javax.persistence.criteria.CriteriaUpdate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author samarth
 */
public class StudentDao extends DAO {

    public void AddStudent(Student student, StudentBG family, List<StudentAchievements> achievements, List<AcademicRecord> academics) {

        try {
            beginTransaction();

            student.setFirstName("newFname");
            student.setLastName("newlastname");
            student.setIsActive(true);
            student.setIsVarified(true);

            CriteriaBuilder cb = getSession().getCriteriaBuilder();
            CriteriaUpdate<Student> criteriaUpdate = cb.createCriteriaUpdate(Student.class);
            Root<Student> root = criteriaUpdate.from(Student.class);
            criteriaUpdate.set("firstName", student.getFirstName());
            criteriaUpdate.set("lastName", student.getLastName());
            criteriaUpdate.set("Gender", student.getGender());
            criteriaUpdate.set("profilePic", student.getProfilePic());
            criteriaUpdate.set("citizenship", student.getCitizenship());
            criteriaUpdate.set("ethnicity", student.getEthnicity());
            criteriaUpdate.set("dob", student.getDob());
            criteriaUpdate.set("isActive", student.isIsActive());
            criteriaUpdate.set("isVarified", student.isIsVarified());
            criteriaUpdate.where(cb.equal(root.get("Id"), student.getId()));
            getSession().createQuery(criteriaUpdate).executeUpdate();

            getSession().save(family);

            for (AcademicRecord ac : academics) {
                getSession().save(ac);
            }

            for (StudentAchievements ach : achievements) {
                getSession().save(ach);
            }
            commit();

        } catch (HibernateException hx) {
            rollback();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            close();
        }
    }

    public Student ShowStudent(int StudentID) {
        Student st = null;
        try {
            beginTransaction();
            st = getSession().get(Student.class, StudentID);
           // getSession().createQuery("FROM Employee where ").uniqueResult();
            commit();

        } catch (HibernateException hx) {
            rollback();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            close();
        }
        return st;
    }

}

//student update , add bg, add acdemic , add ach
