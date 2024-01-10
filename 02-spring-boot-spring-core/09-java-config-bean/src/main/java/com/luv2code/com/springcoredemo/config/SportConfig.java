package com.luv2code.com.springcoredemo.config;

import com.luv2code.com.springcoredemo.common.Coach;
import com.luv2code.com.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic") //aquatic is the bean id
    public Coach swimCoach(){ //if not provided by default swimCoach is the bean id
        return new SwimCoach();
    }
}
