package com.ldar01.democoach.controller;

import com.ldar01.democoach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    private Coach myCoach;

    /*@Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }*/

    @Autowired
    public CoachController(@Qualifier("cricketCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getCoach() {
        return myCoach.getDailyWorkout();
    }
}
