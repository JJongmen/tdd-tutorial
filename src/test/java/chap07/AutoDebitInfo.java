package chap07;

import java.time.LocalDateTime;

public class AutoDebitInfo {
    private String userId;
    private String cardNumber;
    private LocalDateTime registTime;
    private LocalDateTime updateTime;

    public AutoDebitInfo(final String userId, final String cardNumber, final LocalDateTime registTime) {
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.registTime = registTime;
        updateTime = registTime;
    }

    public String getUserId() {
        return userId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public LocalDateTime getRegistTime() {
        return registTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void changeCardNumber(final String cardNumber) {
        this.cardNumber = cardNumber;
        this.updateTime = LocalDateTime.now();
    }
}
