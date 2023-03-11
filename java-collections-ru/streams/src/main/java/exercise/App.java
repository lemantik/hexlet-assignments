package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static final long getCountOfFreeEmails(List<String> emails) {
        long result = emails.stream()
                .filter(email -> isEmailFreeDomain(email.split("@")[1]))
                .count();
        return result;
    }

    private static boolean isEmailFreeDomain(String email) {
        return Arrays.asList("gmail.com", "yandex.ru", "hotmail.com").contains(email);
    }
}
// END
