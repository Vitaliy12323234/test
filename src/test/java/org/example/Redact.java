package org.example;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class Redact {
    @Step("Редактировать новость")
    public static void redactMews() {
        $x("//*[@id='root']/header/div/a/div/img").click();
        $x("/html/body/div/div/div/div[3]/div[1]/div[3]/button[1]").click();
        $x("/html/body/div[2]/div[3]/form/div[1]/div/input").setValue(" так надо");
        $x("/html/body/div[2]/div[3]/form/button").click();
    }
}
