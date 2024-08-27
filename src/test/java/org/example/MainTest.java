package org.example;

import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class MainTest {

    private static SoftAssertions softAssertions;

    @BeforeAll
    static void setUp() throws InterruptedException {
        softAssertions = new SoftAssertions();
        openAndLogin();
    }

    @Test
    void testAddNews() {
        addNewsWithEmptyFields();
        softAssertions.assertAll();
    }
     @Test
    void testAddValidNews() {
        addValidNews();
        softAssertions.assertAll();
    }

    @AfterAll
    static void tearDown() throws InterruptedException {
        closeWebDriver();
    }

    @Step("Открытие сайта и авторизация")
    static void openAndLogin() {
        Open.openSite();
        SignIn.login();
    }

    @Step("Добавление новости с пустыми полями")
    static void addNewsWithEmptyFields() {
        NoNews.addNewsWithEmptyFields();
        softAssertions.assertThat($x("//input[@placeholder='Название']").getValue());
    }

    @Step("Добавление валидной новости")
    static void addValidNews() {
        News.addValidNews();
        softAssertions.assertThat($x("//input[@placeholder='Название']").getValue());
        closeWebDriver();
    }
}