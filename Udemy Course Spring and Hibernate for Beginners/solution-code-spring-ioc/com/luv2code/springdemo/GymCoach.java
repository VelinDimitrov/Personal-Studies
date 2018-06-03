package com.luv2code.springdemo;

public class GymCoach implements Coach {
    private Fortune fortune;
    private String team;
    public void setFortune(Fortune fortune) {
        this.fortune = fortune;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Best Coach in Da World Ma Friend.Let's Get our hands dirty!!!!";
    }

    @Override
    public String getFortune() {
        return "Gym Coach :"+fortune.getFortune();
    }
}
