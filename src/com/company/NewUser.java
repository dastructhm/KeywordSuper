package com.company;

public class NewUser extends User{
    public void CheckID(String IDOfUser){
        if(IDOfUser == "Driver's License"){
            System.out.println("You are old enough.");
        }

        if(super.IDOfUser == "NA"){
            System.out.println("You are too young.");
        }

        super.CheckAge(13);
    }
}
