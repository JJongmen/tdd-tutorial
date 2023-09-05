package chap02;

public class PasswordStrengthMeter {
    public PasswordStrength meter(final String s) {
        if (s == null || s.isEmpty()) {
            return PasswordStrength.INVALID;
        }
        final boolean lengthEnough = s.length() >= 8;
        final boolean containsNum = meetsContainingNumberCriteria(s);
        final boolean containsUpp = meetsContainingUppercaseCriteria(s);

        if (lengthEnough && !containsNum && !containsUpp) {
            return PasswordStrength.WEAK;
        }

        if (!containsNum) {
            return PasswordStrength.NORMAL;
        }
        if (!lengthEnough) {
            return PasswordStrength.NORMAL;
        }
        if (!containsUpp) {
            return PasswordStrength.NORMAL;
        }
        return PasswordStrength.STRONG;
    }

    private static boolean meetsContainingUppercaseCriteria(final String s) {
        for (final char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean meetsContainingNumberCriteria(final String s) {
        for (final char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                return true;
            }
        }
        return false;
    }
}
