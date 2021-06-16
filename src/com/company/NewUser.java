package com.company;

public class NewUser extends User{

    String TypeOfID = "Driver's License";

    public void PrintMessage(){
        super.PrintMessage();
        System.out.println(super.TypeOfID);
        System.out.println(TypeOfID);
    }


}
