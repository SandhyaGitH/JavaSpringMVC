/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import com.mycompany.daos.UniversityDao;
import com.mycompany.models.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author samarth
 */
@Service("universityService")
public class UniversityServiceImp implements UniversityService{

    @Autowired
    private UniversityDao uniDao;
    
    @Override
    public Iterable<University> findAll() {
        
        return uniDao.getUniversities();
    }

    @Override
    public Iterable<University> findAll(int CountryId) {
        return  null;
    }
    
}
