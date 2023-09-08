package chap07.user;

public class User {
    private final String id;
    private final String password;
    private final String email;

    public User(final String id, final String password, final String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
