package com.userregistration;

public class UserRegistration {


    private static final String PATTERN_NAME ="^[A-Z][a-z]{2,}$";
    private static final String PATTERN_EMAIL ="^[a-z]{1,}([.]?[-]?[+]?[a-z0-9]{1,})?[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,}([.]?[a-z]{2,})?$";
    private static final String PATTERN_NUMBER ="^[0-9]{2}[ ][0-9]{10}$";
    private static final String PATTERN_PASSWORD ="[a-zA-Z0-9]{8,}";
    private static final String PATTERN_PASSWORD2 ="[a-zA-Z0-9]*[A-Z][a-zA-Z0-9]*";

    public static boolean checkFirstName(String firstName) {
         return firstName.matches(PATTERN_NAME);
    }

    public static boolean checkLastName(String lastName) {
        return lastName.matches(PATTERN_NAME);
    }

    public static boolean checkEmail(String email)  {
        return email.matches(PATTERN_EMAIL);
    }

    public static boolean checkNumber(String number) {
        return number.matches(PATTERN_NUMBER);
    }

    public static boolean checkPassword(String password) {
        boolean flag = false;
        if (password.matches(PATTERN_PASSWORD) && password.matches(PATTERN_PASSWORD2)) {
            flag = true;
        }
        return flag;
    }



}
