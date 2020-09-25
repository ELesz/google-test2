package org.example;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @Test
    public void userCanSearch(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("http://google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $$(By.xpath("//div[@data-hveid='CAEQAQ']")).shouldHave(texts(
                " is a framework for test automation powered by Selenium WebDriver"));
    }
}
