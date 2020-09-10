package com.sametozyurek.test;
import com.sametozyurek.base.TestBasePage;
import com.sametozyurek.page.LoginPage;
import com.thoughtworks.gauge.Step;

public class TestLoginPage extends TestBasePage {
    LoginPage loginPage;

    @Step({"Site girisi"})
    public void before() {
        loginPage = new LoginPage(getWebDriver());
        loginPage.closePop();
    }

    @Step({"giris pop acilir"})
    public void clickLogin(){
        loginPage.openSignIn();
    }

    @Step({"e mail <email> ve <password> girilerek giris yapilir"})
    public void login(String email, String password){
        loginPage.login(email, password);
    }

    @Step({"account pop up kapat"})
    public void closePopUpAccount(){
        loginPage.closePopUpAccount();
    }

    @Step({"arama kelimesi <context> girilir"})
    public void enterSearchText(String context) throws InterruptedException {
        loginPage.searchBoxText(context);
        Thread.sleep(2000);
    }

    @Step({"arama butonuna basilir"})
    public void clickSearchButton(){
        loginPage.searchBoxClick();
    }

    @Step({"urun secilir"})
    public void selectProduct(){
        loginPage.selectProduct();
    }


}