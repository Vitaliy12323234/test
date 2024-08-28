package org.example;

import io.qameta.allure.Step;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static com.codeborne.selenide.Selenide.*;

public class MainTest {

    private static SoftAssertions softAssertions;

    @BeforeAll
    static void setUp() throws InterruptedException {
        softAssertions = new SoftAssertions();
        openAndLogin();
    }
@Nested

    @Test
    void testAddValidNews() {
        addValidNews();
        softAssertions.assertAll(); // Проверяем все ошибки, найденные в тесте
    }
    @Test
    void create(){
        CreateInfo.create();
    }
    @Test
    void redact(){
        Redact.redactMews();
    }
    @Test
    void delete(){
        Delete.deleteNews();
    }
    /*@Test
    void testAddNews() {
        addNewsWithEmptyFields();
        softAssertions.assertAll(); // Проверяем все ошибки, найденные в тесте
    }*/

    @AfterAll
    static void tearDown() {
        closeWebDriver(); // Закрываем браузер после выполнения всех тестов
    }

    @Step("Открытие сайта и авторизация")
    static void openAndLogin() {
        Open.openSite();
        SignIn.login();
    }

    @Step("Добавление валидной новости")
    static void addValidNews() {
        News.addValidNews();
    }

    /*@Step("Добавление новости с пустыми полями")
    static void addNewsWithEmptyFields() {
        NoNews.addNewsWithEmptyFields();

    }*/
}
