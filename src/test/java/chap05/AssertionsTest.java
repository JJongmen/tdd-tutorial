package chap05;

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
}
