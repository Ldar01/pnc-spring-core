package com.ldar01.democoach.utils;

import com.ldar01.democoach.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FootballCoach implements Coach {

    public FootballCoach() {
        System.out.println("FootballCoach: inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Do 5 goals";
    }

    @PostConstruct
    public void init() {
        System.out.println("Estoy en el post construct de: " + getClass().getName());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Estoy en el pre destroy de: " + getClass().getName());
    }
}
