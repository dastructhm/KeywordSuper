package com.company;

public class User {
    String UserID = "NA";

    public void CheckAge(int AgeOfUser){
        if(AgeOfUser < 12){
            System.out.println("You are banned again.");
        }

        if(AgeOfUser > 12){
            System.out.println("You are free.");
        }
    }
}
