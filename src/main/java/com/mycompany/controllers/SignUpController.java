/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controllers;

import com.google.gson.Gson;
import com.mycompany.daos.UniversityDao;
import com.mycompany.daos.UserDao;
import com.mycompany.models.University;
import com.mycompany.models.User;
import com.mycompany.services.ProgramService;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.mycompany.services.UniversityService;
import java.util.List;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author samarth
 */
@Controller
public class SignUpController {

    @Autowired
    private UserDao userDao;
    
     @Autowired
     private UniversityService universityService;
     @Autowired
     private ProgramService programService;
    
    private Validator validator;
    
      public SignUpController()
    {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }
    
    @RequestMapping(value = "/SignUp.htm", method = RequestMethod.POST)
    public ModelAndView SignUp(@ModelAttribute("user") User user ,UniversityDao uniDao , HttpServletRequest request ) {
        ModelAndView mv = null;
        if (user.getRole().equals("Student")) {
            
            userDao.SignUpUser(user);
            
         
            mv = new ModelAndView("stuProfileCompletion");
            
            request.setAttribute("Unis", universityService.findAll());
           
            mv.addObject("UserID", user.getUserID());
            

        } else if (user.getRole().equals("Donor")) {
            userDao.SignUpUser(user);

            mv = new ModelAndView("drProfileCompletion");
            mv.addObject("UserID", user.getUserID());
        } else if (user.getRole().equals("UniversityRepresentative")) {
            userDao.SignUpUser(user);

            mv = new ModelAndView("uRProfileCompletion");
            mv.addObject("UserID", user.getUserID());
        } else if (user.getRole().equals("Admin")) {
            userDao.SignUpUser(user);

            mv = new ModelAndView("adminHome");
            mv.addObject("UserID", user.getUserID());
        
        }
        
        return mv;
    }

    @RequestMapping(value = "/login.htm", method = RequestMethod.POST)
    public ModelAndView AuthenticateUser(@ModelAttribute("user") User user,  HttpServletRequest request) {
        ModelAndView mv = null;
        // data validation
        int EntityUniqID =0;
        if (user.getRole().equals("Student")) {

           EntityUniqID= userDao.LoginUser(user);
           if(EntityUniqID!=0)
           {
               // call getentity details
              mv = new ModelAndView("studentHome");
              mv.addObject("UserID", user.getUserID());  
              HttpSession hts = request.getSession();
              hts.setAttribute("name", "username");
              hts.setAttribute("user", user);
           }
           

        } else if (user.getRole().equals("Donor")) {
            EntityUniqID= userDao.LoginUser(user);

            mv = new ModelAndView("donorHome");
            mv.addObject("UserID", user.getUserID());
        } else if (user.getRole().equals("UniversityRepresentative")) {
           EntityUniqID= userDao.LoginUser(user);

            mv = new ModelAndView("uniRepresentativeHome");
            mv.addObject("UserID", user.getUserID());
        } else if (user.getRole().equals("Admin")) {
            EntityUniqID=userDao.LoginUser(user);

            mv = new ModelAndView("adminHome");
            mv.addObject("UserID", user.getUserID());
        }
        return mv;
    }

    @ModelAttribute("Universities")
    public List getUniversityList(UniversityDao udao)
    {
        
        List<University> UniversityList = udao.getUniversities();
         return UniversityList;
        
    }
    
   
    
    
    public String getunis(ModelMap modelMap)
    {
        modelMap.put("Universities", universityService.findAll());
        return "stuProfileCompletion";
    }
    
    @ResponseBody
    @RequestMapping(value="loadProgramsByUniversity/{id}" , method =RequestMethod.GET)
    public String loadProgramsByUniversity(@PathVariable("id") int id)
    {
        Gson gson = new Gson();
        return gson.toJson(programService.findByUniversity(id));
    }
}
