package com.company;

// NewUser继承User
public class NewUser extends User{
    // 子类的TypeOfID域
    String TypeOfID = "Driver's License";

    // 子类的PrintMessage方法
    public void PrintMessage(){
        // 引用父类的方法
        super.PrintMessage();
        // 引用父类的域
        System.out.println(super.TypeOfID);
        // 引用子类的方法
        System.out.println(TypeOfID);
    }
}
