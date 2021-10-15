package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
    private FortuneService fortuneService;
	
	/*
	 * for using @Qualifier in construcor injection
	 * @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
        
        fortuneService = theFortuneService;
    }
	 */

    //define a default constructor
    public TennisCoach() {
    	System.out.println(">> TennisCoach: inside default constructor");
    }

    //define init method
    @PostConstruct
    public void doMyStartUp() {
    	System.out.println(">> inside doMyStartUp");
    }
    
    //define my destroy method
    @PreDestroy
    public void doMyCleanUp() {
    	System.out.println(">> inside doMyCleanUp()");
    }
    
    
    /*
    //define a setter method or we can also give any custom method name like doSomeCrazy()
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
    	System.out.println(">> TennisCoach: inside setFortuneService() method");
        
    	fortuneService = theFortuneService;
    }
    */
    
    
    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    */
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
