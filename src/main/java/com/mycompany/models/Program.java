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
@Table(name = "Program")
public class Program implements Serializable{
    
    @Id
     @Column(name="ProgramID")
    private int programID;

    @Column(name="UniversityID")
    private int universityID;
    
     @Column(name="UniversityID")
    private String programName;
    
      @Column(name="Description")
    private String description;
    
       @Column(name="NoOfCredits")
    private int noOfCredits;
    
        @Column(name="FeePerCredit")
    private int feePerCredit;
    
         @Column(name="ProgramLink")
    private String programLink;

    public int getProgramID() {
        return programID;
    }

    public void setProgramID(int programID) {
        this.programID = programID;
    }

    public int getUniversityID() {
        return universityID;
    }

    public void setUniversityID(int universityID) {
        this.universityID = universityID;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoOfCredits() {
        return noOfCredits;
    }

    public void setNoOfCredits(int noOfCredits) {
        this.noOfCredits = noOfCredits;
    }

    public int getFeePerCredit() {
        return feePerCredit;
    }

    public void setFeePerCredit(int feePerCredit) {
        this.feePerCredit = feePerCredit;
    }

    public String getProgramLink() {
        return programLink;
    }

    public void setProgramLink(String programLink) {
        this.programLink = programLink;
    }
    
    
}
