// To eliminate the confusion between superclasses
// and subclasses that have methods with the same name.

package com.company;

public class Main {

    public static void main(String[] args) {
        // 实例化对象user
        User user = new User();
        // 调用PrintMessage方法
        user.PrintMessage();

        // 实例化对象newUser
        NewUser newUser = new NewUser();
        // 调用PrintMessage方法
        newUser.PrintMessage();
    }
}
