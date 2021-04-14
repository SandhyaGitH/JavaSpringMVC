/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.mycompany.daos.StudentDao;
import com.mycompany.daos.UserDao;
import com.mycompany.models.Student;
import com.mycompany.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author samarth
 */
@Controller
public class StudentController {
    @PostMapping("/CompleteProfle.htm")
    public ModelAndView SignUp(@ModelAttribute("Student") Student student, StudentDao studentDao) {
        ModelAndView mv = null;
        student.setId(1525);
       // studentDao.AddStudent(student);
        return mv ;
    }
    
    @PostMapping("/ShowStudentProfile.htm")
    public ModelAndView ShowProfile(@ModelAttribute("Student") Student student, StudentDao studentDao) {
        ModelAndView mv = null;
        student.setId(1525);
       // studentDao.AddStudent(student);
        return mv ;
    }
    
}
