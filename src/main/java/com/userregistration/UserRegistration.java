package com.userregistration;

public class UserRegistration {


    private static final String PATTERN_NAME ="^[A-Z][a-z]{2,}$";


    public static boolean checkFirstName(String firstName) {
         return firstName.matches(PATTERN_NAME);
    }

    public static boolean checkLastName(String lastName) {
        return lastName.matches(PATTERN_NAME);
    }


}
