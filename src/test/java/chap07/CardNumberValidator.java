package chap07;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.net.http.HttpRequest.*;

public class CardNumberValidator {
    public CardValidity validate(final String cardNumber) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = newBuilder()
                .uri(URI.create("http://some-external-pg.com/card"))
                .header("Content-Type", "text/plain")
                .POST(BodyPublishers.ofString(cardNumber))
                .build();
        try {
            final HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            return switch (response.body()) {
                case "ok" -> CardValidity.VALID;
                case "bad" -> CardValidity.INVALID;
                case "expired" -> CardValidity.EXPIRED;
                case "theft" -> CardValidity.THEFT;
                default -> CardValidity.UNKNOWN;
            };
        } catch (IOException | InterruptedException e) {
            return CardValidity.ERROR;
        }
    }
}
