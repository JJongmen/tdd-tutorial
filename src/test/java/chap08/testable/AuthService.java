package chap08.testable;

import chap08.auth.AuthUtil;

public class AuthService {
    private String authKey = "somekey";

    public int authenticate(final String id, final String pw) {
        final boolean authorized = AuthUtil.authorize(authKey);
        if (authorized) {
            return AuthUtil.authenticate(id, pw);
        } else {
            return -1;
        }
    }
}