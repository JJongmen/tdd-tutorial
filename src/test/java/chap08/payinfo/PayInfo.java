package chap08.payinfo;

public class PayInfo {
    private final String datetime;
    private final String trNum;
    private final int amounts;

    public PayInfo(final String datetime, final String trNum, final int amounts) {
        this.datetime = datetime;
        this.trNum = trNum;
        this.amounts = amounts;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getTrNum() {
        return trNum;
    }

    public int getAmounts() {
        return amounts;
    }
}
