package chap08.testable;

import chap08.subs.*;

import java.time.LocalDate;

public class UserPointCalculator {

    private SubscriptionDao subscriptionDao;
    private ProductDao productDao;

    public int calculatePoint(User u) {
        Subscription s = subscriptionDao.selectByUser(u.getId());
        if (s == null) throw new NoSubscriptionException();
        Product p = productDao.selectById(s.getProductId());
        LocalDate now = LocalDate.now();
        return new PointRule().calculate(s, p, now);
    }
}
