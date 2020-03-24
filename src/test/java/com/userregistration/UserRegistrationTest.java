package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenValid_thenTrue() {
        Assert.assertTrue(UserRegistration.checkFirstName("Gaurav"));
    }

    @Test
    public void givenFirstName_whenInValid_thenFalse() {
        Assert.assertFalse(UserRegistration.checkFirstName("gaurav"));
    }

    @Test
    public void givenLastName_whenValid_thenTrue() {
        Assert.assertTrue(UserRegistration.checkLastName("Marathe"));
    }

    @Test
    public void givenLastName_whenInValid_thenFalse() {
        Assert.assertFalse(UserRegistration.checkLastName("marathe"));
    }



}
