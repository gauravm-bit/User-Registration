package com.userregistration;

public class UserRegistration {


    private static final String PATTERN_FIRSTNAME ="^[A-Z][a-z]{2,}$";


    public static boolean checkFirstName(String firstName) {
         return firstName.matches(PATTERN_FIRSTNAME);
    }
}
