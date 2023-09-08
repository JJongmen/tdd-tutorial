package chap07.autodebit;

public class RegisterResult {
    private boolean succcess;
    private CardValidity validity;

    public RegisterResult(final boolean succcess, final CardValidity validity) {
        this.succcess = succcess;
        this.validity = validity;
    }

    public boolean isSucccess() {
        return succcess;
    }

    public CardValidity getValidity() {
        return validity;
    }

    public static RegisterResult error(final CardValidity validity) {
        return new RegisterResult(false, validity);
    }

    public static RegisterResult success() {
        return new RegisterResult(true, CardValidity.VALID);
    }
}
