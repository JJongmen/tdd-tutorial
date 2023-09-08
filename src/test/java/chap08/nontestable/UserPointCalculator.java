package chap08.nontestable;

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
