package com.sametozyurek.page;

import com.sametozyurek.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.sametozyurek.constants.Constants.*;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addProductBasket(){
        click(addProductBasket);
    }

    public void goBasket(){
        click(goBasket);
    }

    public void comparePrice(){
        click(increaseProductNumber);
    }

    public void compareNumber(){
        click(emptyBasket);
        click(emptyBasketButton);
    }
}
