package org.example;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class Delete {
    @Step("Удалить новость")
    public static void deleteNews() {
        $x("/html/body/div/div/div/div[3]/div[1]/div[3]/button[2]").click();
    }
}
