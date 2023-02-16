package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    // поле юзер
    @FindBy(id = "user")
    private WebElement nameUser;
    // поле пароль
    @FindBy(id = "lj_loginwidget_password")
    private WebElement passwordInput;
    //поле войти/провести аутх
    @FindBy(css = ".b-loginform-btn--auth")
    private WebElement submit;




    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //клик по кнопки войти
    public void loginIn(){
        this.submit.click();
    }


    //ввод логина
    public LoginPage setLogin(String login){
        this.nameUser.sendKeys(login);
        return this;
    }
    //ввод пароля
    public LoginPage setPassword(String password){

        this.passwordInput.sendKeys(password);
        return this;
    }

    public void loginIn(String login, String password){

        Actions loginIn = new Actions(getDriver());
        loginIn
                .sendKeys(this.nameUser,login)

                .sendKeys(password)
                .click(this.submit)
                .build()
                .perform();
    }

}
