import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import com.example.*;

public class PalindromeCheckerTest {
    private static PalindromeChecker pc;

    @BeforeAll
    public static void setupBeforeClass() throws Exception {
        pc = new PalindromeChecker();  
    }

    @Test
    public void testEmptyString() {
        assertTrue(pc.isPalindrome(""));
    }

    @Test
    public void testSingleCharacterPalindrome() {
        assertTrue(pc.isPalindrome("a"));
    }

    @Test
    public void testPalindrome() {
        assertTrue(pc.isPalindrome("radar"));
        assertTrue(pc.isPalindrome("madam"));
        assertTrue(pc.isPalindrome("A man, a plan, a canal, Panama"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(pc.isPalindrome("hello"));
        assertFalse(pc.isPalindrome("openai"));
        assertFalse(pc.isPalindrome("palindrome"));
    }
}
