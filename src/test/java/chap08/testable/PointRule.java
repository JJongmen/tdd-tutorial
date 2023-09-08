package chap08.testable;

import chap08.subs.*;

import java.time.LocalDate;

public class PointRule {

    public int calculate(final Subscription s, final Product p, final LocalDate now) {
        int point = 0;
        if (s.isFinished(now)) {
            point += p.getDefaultPoint();
        } else {
            point += p.getDefaultPoint() + 10;
        }
        if (s.getGrade() == Grade.GOLD) {
            point += 100;
        }
        return point;
    }
}
