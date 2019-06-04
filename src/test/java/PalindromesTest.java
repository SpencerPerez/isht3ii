import org.junit.*;

import static org.junit.Assert.*;
public class PalindromesTest {
    public PalindromesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void normalInput_normalOutput() {
        System.out.println("TEST #1 - normalInput_normalOutput");

        // given
        String input = "anona";
        boolean expectedResult = true;

        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals("Test #1 FAILED!!!", actualResult, expectedResult);
    }

    @Test(expected = Exception.class)
    public void nullInput_falseOutput(){
        System.out.println("TEST #2 - nullInput_throwsException");

        // given
        String input = null;
        boolean expectedResult = false;

        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals("Test #2 FAILED!!!", actualResult, expectedResult);
    }

    @Test
    public void emptyInput_trueOutput(){
        System.out.println("TEST #3 - emptyInput_trueOutput");

        // given
        String input = "";
        boolean expectedResult = true;

        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals("Test #3 FAILED!!!", actualResult, expectedResult);
    }

    @Test
    public void tooShortInput_falseOutput(){
        System.out.println("TEST #4 - tooShortInput_falseOutput");

        // given
        String input = "as";
        boolean expectedResult = false;

        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals("Test #4 FAILED!!!", actualResult, expectedResult);
    }

    @Test
    public void withSpacesInput_falseOutput(){
        System.out.println("TEST #5 - withSpacesInput_falseOutput");

        // given
        String input = "aba ";
        boolean expectedResult = false;

        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals("Test #5 FAILED!!!", actualResult, expectedResult);
    }

    @Test
    public void tooLongInput_falseOutput(){
        System.out.println("TEST #6 - tooLongInput_falseOutput");

        // given
        String input = "packmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugs" +
                "packmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugspackmyboxwithfivedozenliquorjugs";
        boolean expectedResult = false;

        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals("Test #6 FAILED!!!", actualResult, expectedResult);
    }

    @Test
    public void nonOnlyLettersNumbersInput_falseOutput(){
        System.out.println("TEST #7 - nonOnlyLettersNumbersInput_falseOutput");

        // given
        String input = "anona.";
        boolean expectedResult = false;

        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals("Test #7 FAILED!!!", actualResult, expectedResult);
    }

    @Test
    public void evenLengthInput_falseOutput(){
        System.out.println("TEST #8 - evenLengthInput_falseOutput");

        // given
        String input = "anonan";
        boolean expectedResult = false;

        // when
        boolean actualResult = Palindromes.evaluate(input);

        // then
        assertEquals("Test #8 FAILED!!!", actualResult, expectedResult);
    }
}