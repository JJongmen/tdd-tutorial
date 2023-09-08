package chap08.testable;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PaySyncTest {
    @Test
    void someTest() throws IOException {
        final PaySync paySync = new PaySync();
        paySync.setFilePath("src/test/resources/c0111.csv");

        paySync.sync();

        // 결과 검증
    }
}
