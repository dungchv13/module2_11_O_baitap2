import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @org.junit.jupiter.api.Test
    void isPalindrome() throws InterruptedException {
        String str = "able was I ere I saw Elba";
        boolean expected = true;

        boolean result = Palindrome.isPalindrome(str);
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void isPalindrome1() throws InterruptedException {
        String str = "weqeqweqcvff";
        boolean expected = false;

        boolean result = Palindrome.isPalindrome(str);
        assertEquals(expected,result);
    }
}