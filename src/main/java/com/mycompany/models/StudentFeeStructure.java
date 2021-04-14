/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;

//import org.hibernate.annotations.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author samarth
 */
@Entity
@Table(name = "StudentFeeStructure")
public class StudentFeeStructure implements Serializable {
    
    @Id
    private int feePlanId ;
    
   // private academicRecord Ar;
    private int RecordID;
    private String type ;
    private String Rank;

    public int getFeePlanId() {
        return feePlanId;
    }

    public void setFeePlanId(int feePlanId) {
        this.feePlanId = feePlanId;
    }

    public int getRecordID() {
        return RecordID;
    }

    public void setRecordID(int RecordID) {
        this.RecordID = RecordID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String Rank) {
        this.Rank = Rank;
    }

    public long getAmount() {
        return Amount;
    }

    public void setAmount(long Amount) {
        this.Amount = Amount;
    }
     private long Amount;
    
    
    
}
