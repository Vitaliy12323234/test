package org.example;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class Open {
    @Step("Открытие сайта")
    public static void opens() {
        open("https://news.academy.dunice.net/posts");
        $x("//*[@id=':r0:']").setValue("https://api.news.academy.dunice.net");
        $x("/html/body/div/div/div/button").click();
    }
}
