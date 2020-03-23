package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void whenGivenFirstName_withThreeOrMoreCharacter_and_firstCharacterCapital_shouldReturnTrue() {
        Assert.assertTrue(UserRegistration.checkFirstName("Gaurav"));

    }
}
