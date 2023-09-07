package chap06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    @Test
    void noDataFile_Then_Exception() {
        givenNoFile("badpath.txt");

        File dataFile = new File("badpath.txt");
        assertThrows(IllegalArgumentException.class,
                () -> MathUtils.sum(dataFile));
    }

    private void givenNoFile(final String path) {
        File file = new File(path);
        if (file.exists()) {
            boolean deleted = file.delete();
            if (!deleted) {
                throw new RuntimeException("fail givenNoFile: " + path);
            }
        }
    }

    @Test
    void dataFileSumTest() {
        File dataFile = new File("src/test/resources/datafile.txt");
        long sum = MathUtils.sum(dataFile);
        assertEquals(10L, sum);
    }
}
