package chap07.autodebit;

public record AutoDebitReq(
        String userId,
        String cardNumber) {
}
