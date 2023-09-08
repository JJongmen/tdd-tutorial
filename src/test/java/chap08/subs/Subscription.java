package chap08.subs;

import java.time.LocalDate;

public class Subscription {
    private final LocalDate expiryDate;
    private String productId;
    private Grade grade;

    public Subscription(final LocalDate expiryDate, final Grade grade) {
        this.expiryDate = expiryDate;
        this.grade = grade;
    }

    public String getProductId() {
        return productId;
    }

    public boolean isFinished(final LocalDate now) {
        return false;
    }

    public Grade getGrade() {
        return grade;
    }
}
