package com.company;

// NewUser继承User
public class NewUser extends User{
    // 子类的TypeOfID域
    String TypeOfID = "Driver's License";

    // 子类的PrintMessage方法
    public void PrintMessage(){
        super.PrintMessage();
        System.out.println(super.TypeOfID);
        System.out.println(TypeOfID);
    }
}
