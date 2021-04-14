/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;

/**
 *
 * @author samarth
 */
public class ErrorDetails {
    
    private boolean errorOcceured ;
    private String errorMessage;
    
    public ErrorDetails(boolean flag, String message)
    {
        this.errorOcceured = flag;
        this.errorMessage = message;
    }

    public boolean isErrorOcceured() {
        return errorOcceured;
    }

    public void setErrorOcceured(boolean errorOcceured) {
        this.errorOcceured = errorOcceured;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

 
}


// my impo data
  /*
            String hqlUpdate = "update Student c set c.firstName = :fName , c.lastName = :lName where c.Id =: sID";
// or String hqlUpdate = "update Customer set name = :newName where name = :oldName";
int updatedEntities = getSession().createQuery( hqlUpdate )
        .setParameter( "fName", student.getFirstName() )
        .setParameter( "lName", student.getLastName() )
        .setParameter("sID", student.getId())
        .executeUpdate();
         commit();
         */
      /*   CriteriaBuilder cb = getSession().getCriteriaBuilder();
         CriteriaUpdate<Student> criteriaUpdate = cb.createCriteriaUpdate(Student.class);
Root<Student> root = criteriaUpdate.from(Student.class);
criteriaUpdate.set("firstName", student.getFirstName());
criteriaUpdate.where(cb.equal(root.get("Id"), student.getId()));

getSession().createQuery(criteriaUpdate).executeUpdate();
commit();
*/