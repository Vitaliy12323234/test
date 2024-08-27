package org.example;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SignIn {
    @Step("Авторизация пользователя")
    public static void login() {
        $(byText("Logout")).click();
        $(byText("Sign In")).click();
        $x("//input[@placeholder='Почта']").setValue("login123@gmail.com");
        $x("//input[@placeholder='Пароль']").setValue("Password");
        $(byText("Отправить")).click();
    }
}
