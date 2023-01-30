package com.demo.Service.Ratings.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@RestController
public class RatingController {


    @GetMapping("/welcome")
    public String Wlcm_msg(){

        return "Welcome to Rating-Service  :";

    }


}
