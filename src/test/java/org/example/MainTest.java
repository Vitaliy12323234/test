package org.example;

import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class MainTest {
    @BeforeEach
    void setUp() {
        openAndLogin();
    }
    @AfterEach
    void tearDown() {
        closeWebDriver();
    }
    @Step("Открытие сайта и авторизация")
    static void openAndLogin() {
        Open.opens();
        SignIn.login();
    }
    @Nested
    class ValidNewsTests {
        @Test
        void testNews() {
            News.addValidNews();
        }
        @Test
        void testCreate() {
            CreateInfo.create();
        }
        @Test
        void testRedact() {
            Redact.redactMews();
        }
        @Test
        void testDelete() {
            Delete.deleteNews();
        }
    }
    @Nested
    class noTests {
        @Test
        void testAdd() {
            NoNews.noaddNews();
        }
    }
}
