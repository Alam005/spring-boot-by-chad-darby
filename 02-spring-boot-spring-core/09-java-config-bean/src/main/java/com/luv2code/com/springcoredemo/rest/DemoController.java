package com.luv2code.com.springcoredemo.rest;

import com.luv2code.com.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //Define a private field for dependency
    private Coach myCoach;


@Autowired
public DemoController(@Qualifier("aquatic") Coach theCoach ){
    System.out.println("In constructor: "+ getClass().getSimpleName());
    myCoach = theCoach;

}

//http://localhost:8080/dailyworkout
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
