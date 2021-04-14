/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author samarth
 */
@Entity
@Table(name = "StudentFamilyBackGround")
public class StudentBG implements Serializable{
    //family BG details

    @Id
    private int id;

   
    @Column(name = "StudentID")
    private int studentID;
    
     @Column(name = "PrimaryGardianPhoneNumber")
    private String primaryGardianContactNumber;
    @Column(name = "PrimaryGardianOccupation")
    private String primaryGardianOccupation;
    @Column(name = "SecondaryGardianOccupation")
    private String secondaryGardianOccupation;
    @Column(name = "TotalSavings")
    private String totalSavings;
    @Column(name = "TotalAnnual")
    private String totalAvvualIncome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getPrimaryGardianOccupation() {
        return primaryGardianOccupation;
    }

    public void setPrimaryGardianOccupation(String primaryGardianOccupation) {
        this.primaryGardianOccupation = primaryGardianOccupation;
    }

    public String getSecondaryGardianOccupation() {
        return secondaryGardianOccupation;
    }

    public void setSecondaryGardianOccupation(String secondaryGardianOccupation) {
        this.secondaryGardianOccupation = secondaryGardianOccupation;
    }
    
    


    public String getPrimaryGardianContactNumber() {
        return primaryGardianContactNumber;
    }

    public void setPrimaryGardianContactNumber(String primaryGardianContactNumber) {
        this.primaryGardianContactNumber = primaryGardianContactNumber;
    }

    public String getPrimaryGardianContactOccupation() {
        return primaryGardianOccupation;
    }

    public void setPrimaryGardianContactOccupation(String primaryGardianContactOccupation) {
        this.primaryGardianOccupation = primaryGardianContactOccupation;
    }

    public String getSecondaryGardianContactOccupation() {
        return secondaryGardianOccupation;
    }

    public void setSecondaryGardianContactOccupation(String secondaryGardianContactOccupation) {
        this.secondaryGardianOccupation = secondaryGardianContactOccupation;
    }

    public String getTotalSavings() {
        return totalSavings;
    }

    public void setTotalSavings(String totalSavings) {
        this.totalSavings = totalSavings;
    }

    public String getTotalAvvualIncome() {
        return totalAvvualIncome;
    }

    public void setTotalAvvualIncome(String totalAvvualIncome) {
        this.totalAvvualIncome = totalAvvualIncome;
    }
   
}
