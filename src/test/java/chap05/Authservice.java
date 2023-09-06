package chap05;

public class Authservice {

    public void authenticate(final String id, final String pw) {
        if (id == null) throw new IllegalArgumentException("id");
        if (pw == null) throw new IllegalArgumentException("password");
    }
}
