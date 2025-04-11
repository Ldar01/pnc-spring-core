package com.ldar01.democoach.controller;

import com.ldar01.democoach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {

    private Coach myCoach;
    private Coach myOtherCoach;

    /*@Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }*/

    @Autowired
    public CoachController(@Qualifier("swimCoach") Coach myCoach,
                           @Qualifier("footballCoach") Coach theOtherCoach) {
        System.out.println("In CoachController constructor");
        this.myCoach = myCoach;
        this.myOtherCoach = theOtherCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getCoach() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public boolean isTheSame(){
        return myCoach == myOtherCoach;
    }
}
