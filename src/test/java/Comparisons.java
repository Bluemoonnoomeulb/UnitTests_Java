import org.junit.*;
import static org.junit.Assert.*;

public class Comparisons {

    private static Rational rational;

    @Test
    public void testEquals() {
        rational = new Rational(1, 5);
        assertTrue("The comparison result is incorrect", rational.equals(new Rational(1, 5)));
        assertTrue("The comparison result is incorrect", rational.equals(new Rational(5, 25)));
        rational = new Rational(0, 49);
        assertTrue("The comparison result is incorrect", rational.equals(new Rational(0, 1)));
        rational = new Rational(-7, 3);
        assertTrue("The comparison result is incorrect", rational.equals(new Rational(-7, 3)));
        assertTrue("The comparison result is incorrect", rational.equals(new Rational(-14, 6)));
    }

    @Test
    public void testLess() {
        rational = new Rational(1, 5);
        assertTrue("The comparison result is incorrect", rational.less(new Rational(1, 2)));
        rational = new Rational(0, 14);
        assertTrue("The comparison result is incorrect", rational.less(new Rational(1, 1678)));
        rational = new Rational(-45, 234);
        assertTrue("The comparison result is incorrect", rational.less(new Rational(3, 2)));
        rational = new Rational(-123, 6);
        assertTrue("The comparison result is incorrect", rational.less(new Rational(0, 2)));
        assertTrue("The comparison result is incorrect", rational.less(new Rational(-3, 2)));
    }

    @Test
    public void testLessOrEquals() {
        rational = new Rational(1, 5);
        assertTrue("The comparison result is incorrect", rational.lessOrEqual(new Rational(1, 5)));
        assertTrue("The comparison result is incorrect", rational.equals(new Rational(5, 25)));
    }
}
