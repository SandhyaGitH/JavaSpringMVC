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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author samarth
 */
@Entity
@Table(name = "StudentAcademicRecords")
public class AcademicRecord implements Serializable{

    @Column(name = "RecordID")
    @Id
    private String recordID;
    
    @OneToOne
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Column(name = "UniversityId")
    private String universityId;

    @Column(name = "ProgramID")
    private String programID;

    @Column(name = "Rank")
    private int rank;

    @Column(name = "GPA")
    private float gpa;

    @Column(name = "MaxGPA")
    private float maxGPA;
    @Column(name = "TermOrSemester")
    private String termOrSemester;

    @Column(name = "year")
    private String academicyear;

    

    @Column(name = "NoOfCreditsTaken")
    private int noOfCreditsTaken;
    @Column(name = "isCurrent")
    private boolean isCurrent;

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public String getProgramID() {
        return programID;
    }

    public void setProgramID(String programID) {
        this.programID = programID;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }



    public String getTermOrSemester() {
        return termOrSemester;
    }

    public void setTermOrSemester(String termOrSemester) {
        this.termOrSemester = termOrSemester;
    }

    public int getNoOfCreditsTaken() {
        return noOfCreditsTaken;
    }

    public void setNoOfCreditsTaken(int noOfCreditsTaken) {
        this.noOfCreditsTaken = noOfCreditsTaken;
    }

    public boolean isIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(boolean isCurrent) {
        this.isCurrent = isCurrent;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getMaxGPA() {
        return maxGPA;
    }

    public void setMaxGPA(float maxGPA) {
        this.maxGPA = maxGPA;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }
    
    
}
