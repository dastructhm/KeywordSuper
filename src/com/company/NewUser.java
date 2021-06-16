package com.company;

public class NewUser extends User{
    public void CheckID(String TypeOfID){
        if(TypeOfID.equals("Driver's License")){
            System.out.println("You are old enough.");
        }

        // To refer immediate parent class instance variable.
        if(super.TypeOfID.equals("N.A.")){
            System.out.println("You are too young.");
        }

        // To invoke parent class method
        super.CheckAge(13);
    }
}
