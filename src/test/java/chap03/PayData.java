package chap03;

import java.time.LocalDate;

public class PayData {
    private LocalDate firstBillingDate;
    private LocalDate billingDate;
    private int payAmount;

    private PayData() {
    }

    public PayData(final LocalDate firstBillingDate, final LocalDate billingDate, final int payAmount) {
        this.firstBillingDate = firstBillingDate;
        this.billingDate = billingDate;
        this.payAmount = payAmount;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public LocalDate getFirstBillingDate() {
        return firstBillingDate;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public static class Builder {
        private PayData data = new PayData();

        public Builder billingDate(final LocalDate billingDate) {
            data.billingDate = billingDate;
            return this;
        }

        public Builder payAmount(final int payAmount) {
            data.payAmount = payAmount;
            return this;
        }

        public Builder firstBillingDate(final LocalDate firstBillingDate) {
            data.firstBillingDate = firstBillingDate;
            return this;
        }

        public PayData build() {
            return data;
        }
    }
}
