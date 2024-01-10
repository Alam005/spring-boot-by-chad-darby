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
    private Coach anotherCoach;

@Autowired
public DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach anotherCoach ){
    System.out.println("In constructor: "+ getClass().getSimpleName());
    myCoach = theCoach;
    this.anotherCoach=anotherCoach;
}

//http://localhost:8080/dailyworkout
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    //http://localhost:8080/check

    @GetMapping("/check")
    public String check() {
    return "Comparing beans: myCoach == anotherCoach, " +(myCoach==anotherCoach);
    }
}
