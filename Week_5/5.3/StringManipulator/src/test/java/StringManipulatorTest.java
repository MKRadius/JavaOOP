import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.example.*;

class StringManipulatorTest {
    @Test
    void canConcatenate() {
        assertEquals("abcxyz", StringManipulator.concatenate("abc", "xyz"));
    }

    @Test
    void canFindLength() {
        assertEquals(3, StringManipulator.findLength("abc"));
    }

    @Test
    void canConvertToUpperCase() {
        assertEquals("ABC", StringManipulator.convertToUpperCase("abc"));
    }

    @Test
    void canConvertToLowerCase() {
        assertEquals("abc", StringManipulator.convertToLowerCase("ABC"));
    }

    @Test
    void canContainSubString() {
        assertTrue(StringManipulator.containsSubString("abc", "b"));
        assertFalse(StringManipulator.containsSubString("abc", "d"));
    }
}