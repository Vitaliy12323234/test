package org.example;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class Delete {
    @Step("Удалить новость")
    public static void deleteNews() {
        $x("//*[@id='root']/header/div/a/div/img").click();
    }
}
