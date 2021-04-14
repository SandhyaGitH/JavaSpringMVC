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
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author samarth
 */

@NamedQuery(name="University.findAll", query="SELECT u  FROM University u ") 
@Entity
@Table(name = "University")
public class University implements Serializable {
    
     @Id
     @Column(name = "UniversityID")
    private int universityID;
     @Column(name = "Name")
    private String name;
     @Column(name = "type")
    private String type;
     @Column(name = "isAccreditUniversity")
    private boolean isAccreditUniversity;
     @Column(name = "isVerfied")
    private boolean isVerfied;
     @Column(name = "AddressLine1")
    private String addressLine1;
     @Column(name = "AddressLine2")
    private String addressLine2;
     @Column(name = "City")
    private String city;
     @Column(name = "State")
    private String state;
     @Column(name = "Country")
    private String country;
     @Column(name = "ZipCode")
    private String zipCode;
     @Column(name = "NationalRanking")
    private short nationalRanking ;
     @Column(name = "UniversityLink")
    private String universityLink;
     
     @Override
    public String toString() {
        return  universityID +" " + name;
    }

    public int getUniversityID() {
        return universityID;
    }

    public void setUniversityID(int universityID) {
        this.universityID = universityID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsAccreditUniversity() {
        return isAccreditUniversity;
    }

    public void setIsAccreditUniversity(boolean isAccreditUniversity) {
        this.isAccreditUniversity = isAccreditUniversity;
    }

    public boolean isIsVerfied() {
        return isVerfied;
    }

    public void setIsVerfied(boolean isVerfied) {
        this.isVerfied = isVerfied;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public short getNationalRanking() {
        return nationalRanking;
    }

    public void setNationalRanking(short nationalRanking) {
        this.nationalRanking = nationalRanking;
    }

    public String getUniversityLink() {
        return universityLink;
    }

    public void setUniversityLink(String universityLink) {
        this.universityLink = universityLink;
    }

    
    
}
