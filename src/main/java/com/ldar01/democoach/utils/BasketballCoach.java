package com.ldar01.democoach.utils;

import com.ldar01.democoach.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasketballCoach implements Coach {

    public BasketballCoach() {
        System.out.println("BasketballCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Do 10 free throws";
    }
}
