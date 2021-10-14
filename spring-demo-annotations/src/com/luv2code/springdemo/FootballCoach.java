package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Go out for a 5k run";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
