package chap07.user;

public class UserRegister {
    private final StubWeakPasswordChecker passwordChecker;
    private final UserRepository userRepository;
    private final EmailNotifier emailNotifier;

    public UserRegister(final StubWeakPasswordChecker passwordChecker,
                        final UserRepository userRepository, final SpyEmailNotifier emailNotifier) {
        this.passwordChecker = passwordChecker;
        this.userRepository = userRepository;
        this.emailNotifier = emailNotifier;
    }

    public void register(final String id, final String pw, final String email) {
        if (passwordChecker.checkPasswordWeak(pw)) {
            throw new WeakPasswordException();
        }
        final User user = userRepository.findById(id);
        if (user != null) {
            throw new DupIdException();
        }
        userRepository.save(new User(id, pw, email));

        emailNotifier.sendRegisterEmail(email);
    }
}
