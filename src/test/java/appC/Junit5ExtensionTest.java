package appC;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class Junit5ExtensionTest {

    @Mock
    private GameNumGen genMock;

    @Test
    void mockStubTest() {
        given(genMock.generate(GameLevel.EASY)).willReturn("123");

        final String num = genMock.generate(GameLevel.EASY);
        assertEquals("123", num);
    }

    @Test
    void mockThrowTest() {
        given(genMock.generate(null)).willThrow(IllegalArgumentException.class);

        assertThrows(
                IllegalArgumentException.class,
                () -> genMock.generate(null));
    }
}
