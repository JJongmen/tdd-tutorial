package chap05;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    void assertEqualsMethod() {
        final LocalDate dateTime1 = LocalDate.now();
        final LocalDate dateTime2 = LocalDate.now();
        assertEquals(dateTime1, dateTime2);
    }

    @Disabled
    @Test
    void failMethod() {
        try {
            Authservice authService = new Authservice();
            authService.authenticate(null, null);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    void assertThrowsTest() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Authservice authService = new Authservice();
            authService.authenticate(null, null);
        });
        assertTrue(thrown.getMessage().contains("id"));
    }

    @Test
    void assertAllTest() {
        assertAll(
                () -> assertEquals(3, 5 / 2),
                () -> assertEquals(4, 2 * 2),
                () -> assertEquals(6, 11 / 2)
        );
    }
}
