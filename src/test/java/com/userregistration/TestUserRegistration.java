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

    @Test
    public void givenEmailId_WhenValid_ShouldReturnTrue() {
        boolean email = UserRegistration.validEmailId("karthikpatel54@gmail.com");
        Assert.assertTrue(email);
    }

    @Test
    public void givenEmailId_WhenInvalid_ShouldReturnFalse() {
        boolean email = UserRegistration.validEmailId("karthikpatel54gmail.com");
        Assert.assertFalse(email);
    }

    @Test
    public void givenPhoneNo_WhenValid_ShouldReturnTrue() {
        boolean phoneNo = UserRegistration.validPhoneNo("91 7738997521");
        Assert.assertTrue(phoneNo);
    }

    @Test
    public void givenPhoneNo_WhenInvalid_ShouldReturnFalse() {
        boolean phoneNo = UserRegistration.validPhoneNo("91 773897521");
        Assert.assertFalse(phoneNo);
    }

    @Test
    public void givenPassword_WithAtleastEightCharacters_ShouldReturnTrue() {
        boolean passwordWithAtleastEightCharacters = UserRegistration.validPassword("Abc123abc",UserRegistration.VALID_PASSWORD_WITH_MINIMUM_EIGHT_CHARACTERS_PATTERN);
        Assert.assertTrue(passwordWithAtleastEightCharacters);
    }

    @Test
    public void givenPassword_WhenLengthLessThanEightCharacters_ShouldReturnFalse() {
        boolean passwordWithAtleastEightCharacters = UserRegistration.validPassword("abc123A",UserRegistration.VALID_PASSWORD_WITH_MINIMUM_EIGHT_CHARACTERS_PATTERN);
        Assert.assertFalse(passwordWithAtleastEightCharacters);
    }

    @Test
    public void givenPassword_WhenContainsAtleastOneUppercase_ShouldReturnTrue() {
        boolean passwordWithAtleastOneUppercase =UserRegistration.validPassword("abcABCDd",UserRegistration.VALID_PASSWORD_WITH_ATLEAST_ONE_UPPERCASE);
        Assert.assertTrue(passwordWithAtleastOneUppercase);
    }

    @Test
    public void givenPassword_WhenDoesNotContainsAnyUppercase_ShouldReturnFalse() {
        boolean passwordWithAtleastOneUppercase =UserRegistration.validPassword("abcABC",UserRegistration.VALID_PASSWORD_WITH_ATLEAST_ONE_UPPERCASE);
        Assert.assertFalse(passwordWithAtleastOneUppercase);
    }
}
