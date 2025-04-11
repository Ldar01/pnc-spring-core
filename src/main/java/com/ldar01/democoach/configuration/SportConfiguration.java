package com.ldar01.democoach.configuration;

import com.ldar01.democoach.Coach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfiguration {
    @Bean
    public Coach swimCoach(){
        return
        new Coach() {
            @Override
            public String getDailyWorkout() {
                return "Swim 1000 meters as a warm up";
            }
        };
    }

}
