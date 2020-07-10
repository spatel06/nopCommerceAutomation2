package org.example;

import org.openqa.selenium.By;
import java.text.DateFormat;
public class Register extends Utils {

    private By yourPersonalDetails = By.className("title");
    private By gender = By.id("gender-female");
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
    private By dayDropList = By.xpath("//div[@class='date-picker-wrapper']/select[1]");
    private By monthDropList = By.xpath("//div[@class='date-picker-wrapper']/select[2]");
    private By yearDropList = By.xpath("//div[@class='date-picker-wrapper']/select[3]");
    String emailTimeStamp = "Test" + timeStamp() + "@gmail.com";
    private By email = By.id("Email");
    private By companyName = By.id("Company");
    private By password = By.id("Password");
    private By confirmPassword = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");
    private By _logOut = By.cssSelector("div[class='header-links'] ul li:nth-child(2)");


    public void PersonalDetails() {
        System.out.println(getTextFromElement(yourPersonalDetails));
        clickOnElement(gender);
        enterText(firstName, "Neeta");
        enterText(lastName, "Patel");
        selectByVisibleText(dayDropList, "10");
        selectByVisibleText(monthDropList, "May");
        selectByVisibleText(yearDropList, "1910");
        enterText(email, emailTimeStamp);
        enterText(companyName, "global");
        enterText(password, "239$69");
        enterText(confirmPassword, "239$69");
        clickOnElement(registerButton);
        //clickOnElement(_logOut);

    }

    public void logOut() {
        clickOnElement(_logOut);

    }

}

