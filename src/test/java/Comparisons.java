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
        assertTrue("The comparison result is incorrect", rational.equals(new Rational(-70, 30)));
    }

    @Test
    public void testLess() {
        rational = new Rational(1, 5);
        assertTrue("The comparison result is incorrect", rational.less(new Rational(1, 2)));
        assertTrue("The comparison result is incorrect", rational.less(new Rational(2, 5)));
        rational = new Rational(0, 14);
        assertTrue("The comparison result is incorrect", rational.less(new Rational(1, 1678)));
        rational = new Rational(-45, 234);
        assertTrue("The comparison result is incorrect", rational.less(new Rational(17, 234)));
        rational = new Rational(-123, 1);
        assertTrue("The comparison result is incorrect", rational.less(new Rational(0, 2)));
        assertTrue("The comparison result is incorrect", rational.less(new Rational(-123, 5)));
        assertTrue("The comparison result is incorrect", rational.less(new Rational(-67, 1)));
    }

    @Test
    public void testLessOrEquals() {
        rational = new Rational(1, 2);
        assertFalse("The comparison result is incorrect", rational.lessOrEqual(new Rational(1, 5)));
        assertFalse("The comparison result is incorrect", rational.lessOrEqual(new Rational(0, 2)));
        assertFalse("The comparison result is incorrect", rational.lessOrEqual(new Rational(-1, 2)));
        rational = new Rational(0, 3);
        assertFalse("The comparison result is incorrect", rational.lessOrEqual(new Rational(-7, 2)));
        rational = new Rational(-1, 5);
        assertFalse("The comparison result is incorrect", rational.lessOrEqual(new Rational(-1, 4)));
    }
}
