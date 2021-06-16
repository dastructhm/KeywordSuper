// To eliminate the confusion between superclasses
// and subclasses that have methods with the same name.

package com.company;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.PrintMessage();

        NewUser newUser = new NewUser();
        newUser.PrintMessage();
    }
}
