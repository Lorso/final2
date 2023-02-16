package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage {

    // кнопка Написать в блог
    @FindBy(css = ".s-header-item-post--long")
    private WebElement nPost;



    public AccountPage(WebDriver driver) {
        super(driver);
    }
    // клик по кнопке Написать в блог
    public void createNewPost() {
        this.nPost.click();
    }




}
