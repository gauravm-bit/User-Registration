package com.userregistration;

public class UserRegistration {


    private static final String PATTERN_NAME ="^[A-Z][a-z]{2,}$";
    private static final String PATTERN_EMAIL ="^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,}([.]?[a-z]{2,})?$";

    public static boolean checkFirstName(String firstName) {
         return firstName.matches(PATTERN_NAME);
    }

    public static boolean checkLastName(String lastName) {
        return lastName.matches(PATTERN_NAME);
    }

    public static boolean checkEmail(String email)  {
        return email.matches(PATTERN_EMAIL);
    }

}
