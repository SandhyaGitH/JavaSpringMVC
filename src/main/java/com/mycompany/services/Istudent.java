/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import com.mycompany.models.Student;
import java.util.HashMap;

/**
 *
 * @author samarth
 */
public interface Istudent {
    public Iterable<Student> findAll();
    
    public Student showProfile(int studentID);
    
        public boolean activeStudent(int studentID);
        
        public boolean verifyStudent(int studentID);
        
        public boolean updateStudent(int studentID);
        
         public Student addStudent(Student student);
         
         public Iterable<Student> findAll(int id, String searchType);
         
         public Iterable<Student> findAllBySearchCritera( HashMap map);
}
