/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import com.mycompany.daos.ProgramDao;
import com.mycompany.models.Program;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author samarth
 */
@Service("programService")
public class ProgramServiceImp implements ProgramService{

      @Autowired
    private ProgramDao programDao;
      
    @Override
    public Iterable<Program> findByUniversity(int UniversityID) {
        return  programDao.findByUniversity(UniversityID);
    }

    @Override
    public Iterable<Program> findByUniversity(String UniversityName) {
         return null;
    }

    @Override
    public Iterable<Program> findAll() {
        return null;
    }
    
}
