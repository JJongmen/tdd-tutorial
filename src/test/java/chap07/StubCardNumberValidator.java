package chap07;

public class StubCardNumberValidator extends CardNumberValidator {
    private String invalidNo;

    public void setInvalidNo(final String invalidNo) {
        this.invalidNo = invalidNo;
    }

    @Override
    public CardValidity validate(final String cardNumber) {
        if (invalidNo != null && invalidNo.equals(cardNumber)) {
            return CardValidity.INVALID;
        }
        return CardValidity.VALID;
    }
}
