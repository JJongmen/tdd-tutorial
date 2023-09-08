package chap08.testable;

import chap08.subs.Grade;
import chap08.subs.Product;
import chap08.subs.Subscription;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointRuleTest
{
    @Test
    void 만료전_GOLD등급은_130포인트() {
        final PointRule rule = new PointRule();
        final Subscription s = new Subscription(
                LocalDate.of(2019, 5, 5),
                Grade.GOLD
        );
        final Product p = new Product();
        p.setDefaultPoint(20);

        final int point = rule.calculate(s, p, LocalDate.of(2019, 5, 1));

        assertEquals(130, point);
    }
}
