package chap07.user;


import java.util.HashMap;
import java.util.Map;

public class MemoryUserRepository implements UserRepository {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void save(final User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User findById(final String id) {
        return users.get(id);
    }
}
