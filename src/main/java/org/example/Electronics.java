package org.example;

import org.openqa.selenium.By;

public class Electronics extends Utils{

    private By clickOnElectronics = By.xpath("//ul[@class='top-menu notmobile']/li[2]");
    private By clickOnCamera = By.cssSelector("div [alt='Picture for category Camera & photo'] ");
    private By compareFirstProduct = By.cssSelector("div[class='buttons'] input:nth-child(2)");
    private By compareLastProduct = By.cssSelector("div.product-grid > div > div:nth-child(3) > div > div.details > div.add-info > div.buttons > input.button-2.add-to-compare-list-button");
    private By productComparison = By.cssSelector("div[class='bar-notification success'] a");
    private By clearList = By.cssSelector("div [class='clear-list'] ");
    private By addToCartProduct = By.cssSelector("div [class='button-2 product-box-add-to-cart-button'] ");            //("div.product-grid > div > div:nth-child(1) > div > div.details > div.add-info > div.buttons > input.button-2.product-box-add-to-cart-button");
    private By selectProduct = By.cssSelector("div[class='add-to-cart-panel'] input:nth-child(3)");
    private By shoppingCart = By.cssSelector("div [id='topcartlink'] span:nth-child(2)");
    private By termsOfService = By.cssSelector("div [id='termsofservice']");
    private By checkout = By.cssSelector("div [id='checkout']");



    public void electronics(){
        clickOnElement(clickOnElectronics);
        clickOnElement(clickOnCamera);
        clickOnElement(compareFirstProduct);



    }
    public void compareProduct(){
        clickOnElement(compareLastProduct);
        clickOnElement(productComparison);
        clickOnElement(clearList);

    }
    public void addToCart(){
        clickOnElement(clickOnElectronics);
        clickOnElement(clickOnCamera);
        clickOnElement(addToCartProduct);
        clickOnElement(selectProduct);
        clickOnElement(shoppingCart);
        clickOnElement(termsOfService);
        clickOnElement(checkout);

    }


    }

