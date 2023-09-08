package chap08.auth;

public class LoginResult {
    public static LoginResult badAuthKey() {
        return null;
    }

    public static LoginResult authenticated(final Customer c) {
        return null;
    }

    public static LoginResult fail(final int resp) {
        return null;
    }
}
