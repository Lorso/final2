package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class PostTest extends AbstractTest {

    // Тест нового поста
    @Test
    void newPost() throws InterruptedException {
        new LJMainPage(getWebDriver()).navigateToLogInForm();
        Assertions.assertTrue(true);
        new LoginPage(getWebDriver())
                .setLogin("Lorso69")
                .setPassword("MTinnovations2023")
                .loginIn();
        Thread.sleep(10000);

        new AccountPage(getWebDriver()).createNewPost(); //клик написать в блог

        Assertions.assertTrue(getWebDriver().findElement(By.cssSelector(".backgroundBlue-0-2-104 > .rootIn-0-2-98")).getText().equals("Настроить и опубликовать"));

    }




}
