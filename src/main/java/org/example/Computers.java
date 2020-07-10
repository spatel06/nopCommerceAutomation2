package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Computers extends Utils{

    private By computer = By.xpath("//a[@href='/computers']");
    private By clickOnDesktops = By.cssSelector("h2 [title='Show products in category Desktops']");
    private By clickOnFirstProduct = By.cssSelector("a[title='Show details for Build your own computer']");
    private By addYourReview = By.cssSelector("div[class='product-review-links'] a:nth-child(3)");
    private By reviewTitle = By.id("AddProductReview_Title");
    private By reviewText = By.id("AddProductReview_ReviewText");
    private By rating = By.id("addproductrating_3");
    private By submitReview = By.cssSelector("div[class='buttons'] input");
    private By emailFriend = By.cssSelector("div[class='email-a-friend'] input");
    private By friendEmail = By.id("FriendEmail");
  //  String emailTimeStamp = "Test" + timeStamp() + "@gmail.com";
    private By yourEmailAddress = By.id("YourEmailAddress");
    private By personalMessage = By.id("PersonalMessage");
    private By sendEmail = By.cssSelector("div[class='buttons'] input");

    public void clickOnComputers() {
        waitForElementToBeVisible(computer,20);
        clickOnElement(computer);
        clickOnElement(clickOnDesktops);
        clickOnElement(clickOnFirstProduct);
    }

    public void addReview(){
        clickOnElement(addYourReview);
        enterText(reviewTitle,"gift");
        enterText(reviewText,"This is gift for you ");
        clickOnElement(rating);
        clickOnElement(submitReview);

    }

    public void emailAFriend(){
        clickOnElement(emailFriend);
        enterText(friendEmail,"sonal@gmail.com");
        clearText(yourEmailAddress);
        enterText(yourEmailAddress,"abcd@gmail.com");
        enterText(personalMessage,"hi..Hope you well");
        clickOnElement(sendEmail);
    }


}
