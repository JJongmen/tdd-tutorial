package chap03;

import java.time.LocalDate;

public class PayData {
    private LocalDate billingDate;
    private int payAmount;

    private PayData() {
    }

    public PayData(final LocalDate billingDate, final int payAmount) {
        this.billingDate = billingDate;
        this.payAmount = payAmount;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public static Builder builder() {
        return new Builder();
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

        public PayData build() {
            return data;
        }
    }
}
