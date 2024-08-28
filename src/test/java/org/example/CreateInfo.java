package org.example;

import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Selenide.$x;

public class CreateInfo {
    @Step("Добавить значение в профиль")
    public static void create() {
        $x("//input[@placeholder='Имя']").setValue("Вет");
        $x("//input[@placeholder='Фамилия']").setValue("Рут");
        File file = $x("/html/body/div/div/div/div[1]/div/div/form/div[5]/div/input")
                .uploadFile(new File("/home/dunice/Downloads/e.png"));
        $x("$x(/html/body/div/div/div/div[1]/div/div/form/button").click();
    }
}