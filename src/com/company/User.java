package com.company;

public class User {
    String TypeOfID = "N.A.";

    public void CheckAge(int AgeOfUser){
        if(AgeOfUser < 12){
            System.out.println("You are banned.");
        }

        if(AgeOfUser > 12){
            System.out.println("You are free to register.");
        }
    }
}
