package com.ldar01.democoach.utils;

import com.ldar01.democoach.Coach;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do 5 goals";
    }
}
