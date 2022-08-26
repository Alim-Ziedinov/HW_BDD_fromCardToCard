package ru.netology.test.data;

import lombok.Value;
import ru.netology.test.page.LoginPage;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    @Value
    public static class VerificationCode {
        String code;
    }

    @Value
    public static class CardInfo {
        String cardNumber;
    }

    public static AuthInfo getAuthInfo(){
        return new AuthInfo("vasya", "qwerty123");
    }

    public static CardInfo getFirstCardInfo() {
        return new CardInfo("5559000000000001");
    }

    public static CardInfo getSecondCardInfo() {
        return new CardInfo("5559000000000002");
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }
}
