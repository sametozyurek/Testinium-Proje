package com.sametozyurek.constants;

import org.openqa.selenium.By;

public class Constants {

    public static String WEBPAGE = "https://www.trendyol.com/";

    public static final By openLogin = By.className("login-register-button-container");
    public static final By loginEmail = By.id("email");
    public static final By loginPassword = By.id("password");
    public static final By loginSubmitButton = By.id("loginSubmit");

    public static final By closePopUp = By.className("fancybox-close");
    public static final By closePopUpAccount = By.className("modal-close");

    public static final By searchBox = By.className("search-box");
    public static final By searchBoxButton = By.className("search-icon");

    public static final By product = By.className("p-card-chldrn-cntnr");
    public static final By addProductBasket = By.className("add-to-bs-tx");
    public static final By goBasket = By.id("myBasketListItem");
    public static final By increaseProductNumber = By.xpath("/html/body/div[3]/div[2]/div[2]/section/section[1]/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/button[2]");
    public static final By emptyBasket = By.className("i-trash");
    public static final By emptyBasketButton = By.className("btn-remove");
}