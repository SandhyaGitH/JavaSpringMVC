/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author samarth
 */
@Entity
@Table(name = "Student")
public class Student extends Person implements Serializable {

   
    //personal details

    @Column(name = "Ethinicity")
    private String ethnicity;
    
    @NotNull
    @Column(name = "DOB")
    private String dob;
    
    @Size(min = 10, max = 14)   //@Min(2)
    @Column(name = "PhoneNumber")
    private String contactNumber;

    @Column(name = "Active")
    private boolean isActive;

    @Column(name = "isVarified")
    private boolean isVarified;
    
    @Max(1500)
    @Column(name ="MoreAboutStudent")
    private String moreAboutStudent ; 

  

   

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

  

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String ContactNumber) {
        this.contactNumber = ContactNumber;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isIsVarified() {
        return isVarified;
    }

    public void setIsVarified(boolean isVarified) {
        this.isVarified = isVarified;
    }
    
     /*
    @OneToOne
    private StudentBG studentFBG;

    @OneToMany
    private List<academicRecord> academicRecords;

    @OneToMany
    private List<studentAchievements> Achievements;
 
    public List<studentAchievements> getAchievements() {
        return Achievements;
    }

    public void setAchievements(List<studentAchievements> Achievements) {
        this.Achievements = Achievements;
    }
  public StudentBG getStudentFBG() {
        return studentFBG;
    }

    public void setStudentFBG(StudentBG studentFBG) {
        this.studentFBG = studentFBG;
    } 
    
     public List<academicRecord> getAcademicRecords() {
        return academicRecords;
    }

    public void setAcademicRecords(List<academicRecord> academicRecords) {
        this.academicRecords = academicRecords;
    }
    */

    public String getMoreAboutStudent() {
        return moreAboutStudent;
    }

    public void setMoreAboutStudent(String moreAboutStudent) {
        this.moreAboutStudent = moreAboutStudent;
    }
}
   
        