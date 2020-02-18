package com.userregistration;

public class UserRegistration {

    static String VALID_NAME_PATTERN="^[A-Z]{1}[a-z]{2,}$";
    static String VALID_EMAIL_PATTERN="^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";
    static String VALID_PHONE_NO_PATTERN="^([0-9]{1,3}[ ][1-9]{1}[0-9]{9})$";
    static String VALID_PASSWORD_WITH_MINIMUM_EIGHT_CHARACTERS_PATTERN= "^[a-zA-Z0-9]{8,}$";
    static String VALID_PASSWORD_WITH_ATLEAST_ONE_UPPERCASE= "^(?=.*[A-Z])[a-zA-Z]{8,}$";
    static String VALID_PASSWORD_WITH_ATLEAST_ONE_NUMERIC_VALUE="^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";

    public static boolean validInputName(String name) {
        return name.matches(VALID_NAME_PATTERN);
    }

    public static boolean validEmailId(String email) {
        return email.matches(VALID_EMAIL_PATTERN);
    }

    public static boolean validPhoneNo(String phoneNo) {
        return phoneNo.matches(VALID_PHONE_NO_PATTERN);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to user registration desk");
    }

    public static boolean validPassword(String passwordWithAtleastEightCharacters,String pattern) {
        return passwordWithAtleastEightCharacters.matches(pattern);
    }
}
