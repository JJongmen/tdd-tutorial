package chap05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("@DisplayName 테스트")
public class DisplayNameTest {
    @DisplayName("값 같은지 비교")
    @Test
    void assertEqualsMethod() {
        final LocalDate dateTime1 = LocalDate.now();
        final LocalDate dateTime2 = LocalDate.now();
        assertEquals(dateTime1, dateTime2);
    }

    @Test
    void failMethod() {
        try {
            Authservice authService = new Authservice();
            authService.authenticate(null, null);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @DisplayName("익셉션 발생 여부 테스트")
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
