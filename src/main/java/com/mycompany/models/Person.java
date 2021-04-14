/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author samarth
 */

// 
@MappedSuperclass
public class Person {
    @Id @GeneratedValue 
    private int Id; //primary key stud/donor
    
    @NotEmpty
    private String firstName;
    private String lastName;
    @NotEmpty
    private String Gender;
    private String profilePic;
   // public String ethnicity;
    @NotEmpty
    private String citizenship;
    
     @OneToOne
    private User user;

   
     
    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
    
/*
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
   */

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

   
    
   
    
    
}
