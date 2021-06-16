package com.company;

public class Main {

    public static void main(String[] args) {
        User user = new NewUser();
        user.CheckAge(6);

        NewUser newUser = new NewUser();
        newUser.CheckID("Driver's License");
    }
}
