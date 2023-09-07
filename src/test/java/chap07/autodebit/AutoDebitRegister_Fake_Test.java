package chap07.autodebit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoDebitRegister_Fake_Test {

    private AutoDebitRegister register;
    private MemoryAutoDebitInfoRepository repository;
    private StubCardNumberValidator validator;

    @BeforeEach
    void setUp() {
        validator = new StubCardNumberValidator();
        repository = new MemoryAutoDebitInfoRepository();
        register = new AutoDebitRegister(validator, repository);
    }

    @Test
    void alreadyRegistered_InfoUpdated() {
        repository.save(
                new AutoDebitInfo("user1", "111222333444", LocalDateTime.now()));

        final AutoDebitReq req = new AutoDebitReq("user1", "1234567890123456");
        final RegisterResult result = this.register.register(req);

        final AutoDebitInfo saved = repository.findOne("user1");
        assertEquals("1234567890123456", saved.getCardNumber());
    }

    @Test
    void notYetRegistered_newInfoRegistered() {
        final AutoDebitReq req = new AutoDebitReq("user1", "1234567890123456");
        final RegisterResult result = this.register.register(req);

        final AutoDebitInfo saved = repository.findOne("user1");
        assertEquals("1234567890123456", saved.getCardNumber());
    }
}
