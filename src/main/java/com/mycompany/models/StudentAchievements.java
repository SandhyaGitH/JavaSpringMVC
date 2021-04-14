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

/**
 *
 * @author samarth
 */
@Entity
public class StudentAchievements implements Serializable{
    
    @Id
    private int AchievementID ;
    
    @OneToOne
    private Student Student;
    
     @Column(name = "description")
    private String description;

    public Student getStudent() {
        return Student;
    }

    public void setStudent(Student Student) {
        this.Student = Student;
    }
    
      @Column(name = "link")
    private String documentlink;
       @Column(name = "picture")
    private String documentpicture;
        @Column(name = "IssuingDate")
    private String awardyear;
         @Column(name = "IssuedBy")
    private String issuedBy;

    public int getAchievementID() {
        return AchievementID;
    }

    public void setAchievementID(int AchievementID) {
        this.AchievementID = AchievementID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDocumentlink() {
        return documentlink;
    }

    public void setDocumentlink(String documentlink) {
        this.documentlink = documentlink;
    }

    public String getDocumentpicture() {
        return documentpicture;
    }

    public void setDocumentpicture(String documentpicture) {
        this.documentpicture = documentpicture;
    }

    public String getAwardyear() {
        return awardyear;
    }

    public void setAwardyear(String awardyear) {
        this.awardyear = awardyear;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }
     
    
}
