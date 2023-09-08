package chap08.subs;

import java.time.LocalDate;

public class Subscription {
    private String productId;
    private Grade grade;

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
