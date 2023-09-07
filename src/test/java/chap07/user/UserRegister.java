package chap07.user;

public class UserRegister {
    private final StubWeakPasswordChecker passwordChecker;

    public UserRegister(final StubWeakPasswordChecker passwordChecker) {
        this.passwordChecker = passwordChecker;
    }

    public void register(final String id, final String pw, final String email) {
        if (passwordChecker.checkPasswordWeak(pw)) {
            throw new WeakPasswordException();
        }
    }
}
