package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestSuit extends BrowserSetup {

    HomePage homePage = new HomePage();
    Register register = new Register();
    Computers computers = new Computers();
    Electronics electronics = new Electronics();


    @Test
    public void openHomePage() {

        homePage.clickOnRegister();
      //  homePage.getTextOfRegister();
        String registerSuccessfully = driver.findElement(By.className("page-title")).getText();
        Assert.assertEquals(registerSuccessfully, "Register");
        System.out.println("User able to register successfully");
        register.PersonalDetails();


    }
    @Test
    public void logOut() {
        homePage.clickOnRegister();
        register.PersonalDetails();
        register.logOut();
        String welcomeMessage = driver.findElement(By.xpath("//div[@class='topic-block-title']/h2")).getText();
        Assert.assertEquals(welcomeMessage,"Welcome to our store");
        System.out.println("User able to log out successfully");

    }

    @Test
    public void searchField() {
        homePage.searchField();

    }

    @Test
    public void selectCurrency() {
        homePage.selectCurrency();

    }

    @Test
    public void giftCard() {
        homePage.giftCard();

    }

    @Test
    public void clickOnComputers() {
        homePage.clickOnRegister();
        register.PersonalDetails();
        computers.clickOnComputers();
        String desktops = driver.findElement(By.cssSelector("div[class='page-title'] h1")).getText();
        Assert.assertEquals(desktops,"Desktops");
        System.out.println("User successfully on Desktops page");

    }
    @Test
    public void addReview() {
        homePage.clickOnRegister();
        register.PersonalDetails();
        computers.clickOnComputers();
        computers.addReview();
        String review = driver.findElement(By.cssSelector("div[class='result']")).getText();
        Assert.assertEquals(review,"Product review is successfully added.");
        System.out.println("User successfully on review page");
    }
    @Test
    public void emailAFriend() {
        homePage.clickOnRegister();
        register.PersonalDetails();
        computers.clickOnComputers();
        computers.emailAFriend();
        String message = driver.findElement(By.cssSelector("div[class='result']")).getText();
        Assert.assertEquals(message,"Your message has been sent.");
        System.out.println("Message has been sent successfully");

    }
    @Test
    public void electronics(){
        electronics.electronics();

    }
    @Test
    public void compareProduct(){
        electronics.electronics();
        electronics.compareProduct();
        String message = driver.findElement(By.cssSelector("div[class='no-data']")).getText();
        Assert.assertEquals(message,"You have no items to compare.");
        System.out.println("successful message");

    }
    @Test
    public void addToCart(){
        electronics.addToCart();
        String message = driver.findElement(By.cssSelector("div [class='page-title'] h1")).getText();
        Assert.assertEquals(message,"Welcome, Please Sign In!");
        System.out.println("welcome message");
    }




    }
