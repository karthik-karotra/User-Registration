package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName = UserRegistration.validInputName("Karthik");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean firstName = UserRegistration.validInputName("karthik");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean lastName = UserRegistration.validInputName("Karotra");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean lastName = UserRegistration.validInputName("ka");
        Assert.assertFalse(lastName);
    }
}
