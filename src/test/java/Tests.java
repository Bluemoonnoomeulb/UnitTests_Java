import org.junit.*;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }

    @Test
    public void testConstructorWithParams() {
        Rational r = new Rational(1, 2);
        assertEquals("Constructor with parametrs returns wrong value", "1/2", r.toString());

    }
}