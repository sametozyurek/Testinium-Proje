package com.sametozyurek.test;

import com.sametozyurek.base.TestBasePage;
import com.sametozyurek.page.ProductPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;

public class TestProductPage extends TestBasePage {

    ProductPage productPage;

    @BeforeStep
    public void before(){
        productPage = new ProductPage(getWebDriver());
    }

    @Step({"urun sepete eklenir"})
    public void addProductBasket() throws InterruptedException {
        productPage.addProductBasket();
        Thread.sleep(2000);
    }

    @Step({"sepete gidilir"})
    public void goBasket() throws InterruptedException {
        productPage.goBasket();
        Thread.sleep(2000);
    }

    @Step({"urun fiyati karsilastir urun adeti guncellenir"})
    public void comparePrice() throws InterruptedException {
        productPage.comparePrice();
        Thread.sleep(2000);
    }

    @Step({"urun adeti karsilastirilir sepet bosaltilir"})
    public void compareNumber() throws InterruptedException {
        productPage.compareNumber();
        Thread.sleep(2000);
    }
}
