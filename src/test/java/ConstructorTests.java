import org.junit.*;
import static org.junit.Assert.*;

public class ConstructorTests {
    private static Rational constr_std;
    private static Rational constr_cwp;
    private static Rational constr_oth;

    @BeforeClass
    public static void createConstruct() {
        constr_std = new Rational();
        constr_cwp = new Rational();
        constr_oth = new Rational();
    }

    @AfterClass
    public static void dropConstruct() {
        constr_std = null;
        constr_cwp = null;
        constr_oth = null;
    }

    @Test
    public void testStandardConstructor() {
        assertEquals("Standard constructor returns wrong numerator", 0, constr_std.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, constr_std.getDenominator());
    }

    @Test
    public void testConstructorWithParams() {
        constr_cwp = new Rational(3, 7);
        assertEquals("Constructor with parameters returns wrong value", "3/7", constr_cwp.toString());
        constr_cwp = new Rational(-1, 5);
        assertEquals("Constructor with parameters returns wrong value", "-1/5", constr_cwp.toString());
        constr_cwp = new Rational(2, 4);
        assertEquals("Constructor with parameters returns wrong value", "1/2", constr_cwp.toString());
        constr_cwp = new Rational(-6, 36);
        assertEquals("Constructor with parameters returns wrong value", "-1/6", constr_cwp.toString());
    }

    @Test(expected = ArithmeticException.class)
    public void testNullDenominator() {
        Rational r = new Rational(41, 0);
    }

    @Test
    public void testMinus() {
        constr_oth = new Rational(-21, -3);
        assertEquals("Incorrect negative value returned", "7/1", constr_oth.toString());
        constr_oth = new Rational(77, -17);
        assertEquals("Incorrect negative value returned", "-77/17", constr_oth.toString());
    }

}
