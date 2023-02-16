package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainPageTest extends AbstractTest {
    //тест основной страницы
    @Test
    void clickToTop(){
        new LJMainPage(getWebDriver()).navigateToTop();
        Assertions.assertEquals("https://www.livejournal.com/ratings/",getWebDriver().getCurrentUrl());
    }

}
