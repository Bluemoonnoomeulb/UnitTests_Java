import org.junit.*;
import static org.junit.Assert.*;

public class ElementaryOperations {

    private static Rational rtnl;

    @Test
    public void testAddition() {
        rtnl = new Rational(1, 2);
        assertEquals("Wrong addition result", "1/1", rtnl.plus(new Rational(1, 2)).toString());
        assertEquals("Wrong addition result", "1/2", rtnl.plus(new Rational(0, 3)).toString());
        assertEquals("Wrong addition result", "0/1", rtnl.plus(new Rational(-1, 2)).toString());
        rtnl = new Rational(0, 1);
        assertEquals("Wrong addition result", "-1/6", rtnl.plus(new Rational(-1, 6)).toString());
        rtnl = new Rational(-3, 8);
        assertEquals("Wrong addition result", "-13/24", rtnl.plus(new Rational(-1, 6)).toString());
    }

    @Test
    public void testProductOfNumbers() {
        rtnl = new Rational(1, 4);
        assertEquals("Wrong product result", "3/20", rtnl.multiply(new Rational(3, 5)).toString());
        assertEquals("Wrong product result", "-1/4", rtnl.multiply(new Rational(-1, 1)).toString());
        rtnl = new Rational(-7, 1);
        assertEquals("Wrong product result", "0/1", rtnl.multiply(new Rational(0, 5)).toString());
        assertEquals("Wrong product result", "3/4", rtnl.multiply(new Rational(-3, 28)).toString());
    }

    @Test(expected = ArithmeticException.class)
    public void testBoundOfRange() {
        rtnl = new Rational(1, 4);
        Rational res = rtnl.divide(new Rational(0, 5));
    }

}
