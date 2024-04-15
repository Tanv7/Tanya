import Tanya.Point;
import org.junit.Test;

public class PointTest {
    @Test
    public void testDistance(){
        Point a= new point (0,0);
        Point b= new point (5,0);
        Assertions.assertEquals( 5,a.distanceTo(b));
        Assertions.assertEquals( 5,b.distanceTo(b));
        Assertions.assertEquals( 0,b.distanceTo(b));
        Assertions.assertEquals( 0,a.distanceTo(b));
        Point c= new Point (2.5,0);
        Assertions.assertEquals( a.distanceTo(b), a.distanceTo(c)+c.diatanceTo(b));




    }
}
