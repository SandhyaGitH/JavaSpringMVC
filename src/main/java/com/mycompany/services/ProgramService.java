/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import com.mycompany.models.Program;

/**
 *
 * @author samarth
 */
public interface ProgramService {
    
      public Iterable<Program> findByUniversity(int UniversityID);
      
       public Iterable<Program> findByUniversity(String UniversityName);
       
      public Iterable<Program> findAll();
}
