package com.niveus.assignment_1.Assignment_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("run")
public class Assignment_1_Controller {

    @GetMapping("assignment1")
    public String getMessage(){
        return "This is a simple rest api for assignment 1 And making few changes in the code";
    }

}
