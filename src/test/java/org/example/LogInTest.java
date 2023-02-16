package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LogInTest extends AbstractTest{
    //тест авторизации
    @Test
    void loginIn(){
        new LJMainPage(getWebDriver()).navigateToLogInForm();
        Assertions.assertTrue(true);
        new LoginPage(getWebDriver())
                .setLogin("Lorso69")
                .setPassword("MTinnovations2023")
                .loginIn();

        Assertions.assertTrue(getWebDriver().findElement(By.cssSelector(".s-nav-item__name")).getText().equals("LORSO69"));
    }


}
