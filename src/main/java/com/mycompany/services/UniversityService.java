/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import com.mycompany.models.University;

/**
 *
 * @author samarth
 */
public interface UniversityService {
    
    public Iterable<University> findAll();
    
    public Iterable<University> findAll(int CountryId);
            
}
