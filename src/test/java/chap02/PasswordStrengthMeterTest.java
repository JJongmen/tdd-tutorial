package chap02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {
    @Test
    void meetsAllCriteria_Then_Strong() {
        final PasswordStrengthMeter meter = new PasswordStrengthMeter();

        PasswordStrength result = meter.meter("ab12!@AB");
        PasswordStrength result2 = meter.meter("abc1!Add");

        assertEquals(PasswordStrength.STRONG, result);
        assertEquals(PasswordStrength.STRONG, result2);
    }

    @Test
    void meetsOtherCriteria_except_for_Length_Then_Normal() {
        final PasswordStrengthMeter meter = new PasswordStrengthMeter();

        final PasswordStrength result = meter.meter("ab12!@A");
        final PasswordStrength result2 = meter.meter("Ab12!c");

        assertEquals(PasswordStrength.NORMAL, result);
        assertEquals(PasswordStrength.NORMAL, result2);
    }

    @Test
    void meetsOtherCriteria_except_for_number_Then_Normal() {
        final PasswordStrengthMeter meter = new PasswordStrengthMeter();

        final PasswordStrength result = meter.meter("ab!@Abqwer");

        assertEquals(PasswordStrength.NORMAL, result);
    }
}
