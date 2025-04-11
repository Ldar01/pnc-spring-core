package com.ldar01.democoach.utils;

import com.ldar01.democoach.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Rest";
    }
}
