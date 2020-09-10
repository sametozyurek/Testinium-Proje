package com.sametozyurek.page;
import com.sametozyurek.base.BasePage;
import org.openqa.selenium.WebDriver;
import static com.sametozyurek.constants.Constants.*;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void closePop(){
        click(closePopUp);
    }

    public void openSignIn(){
        click(openLogin);
    }

    public void login(String email, String password){
        sendKeys(loginEmail, email);
        sendKeys(loginPassword, password);
        click(loginSubmitButton);

    }

    public void closePopUpAccount(){
        click(closePopUpAccount);
    }

    public void searchBoxText(String context){
        sendKeys(searchBox, context);
    }

    public void searchBoxClick(){
        click(searchBoxButton);
    }

    public void selectProduct(){
        click(product);
    }


}