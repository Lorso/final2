package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LJMainPage extends AbstractPage {

    // Кнопка войти
    @FindBy(css =  ".s-header-item__link--login")
    private WebElement logIn;

    // Кнопка ТОП
    @FindBy(css =  ".s-nav-body .s-header-item__link--ratings")
    private WebElement top;




    public LJMainPage(WebDriver driver) {
        super(driver);
    }

    // открытие формы для ввода логина и пароля
    public void navigateToLogInForm(){
        this.logIn.click();
    }
    // переход в раздел ТОП
    public void navigateToTop(){
        this.top.click();
    }


}
