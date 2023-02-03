package com.handlingformsubmission.AROHackathon.controller;

import com.handlingformsubmission.AROHackathon.entity.Student;
import com.handlingformsubmission.AROHackathon.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class StudentController {
    @Autowired
    private StudentService studentServices;


    //ADDING STUDENT INTO DATABASE
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student students){
        studentServices.addStudent(students);
        return "redirect:/";
    }

    @GetMapping("/registerForm")
    public ModelAndView registerForm(){
        ModelAndView mav =new ModelAndView("registerform");
        Student student = new Student();
        mav.addObject("register",student);
        return mav;
    }
    //    DISPLAY STUDENT INTO TABLE
    @GetMapping("/")
    public String getAll(Model model){
        model.addAttribute("studentList",studentServices.getAll());

        return "index";
    }



}
