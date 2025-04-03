package com.ldar01.democoach.controller;

import com.ldar01.democoach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    private Coach myCoach;

    private String teamName = "Lions";

    @Autowired
    public CoachController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getCoach() {
        return myCoach.getDailyWorkout();
    }
}
