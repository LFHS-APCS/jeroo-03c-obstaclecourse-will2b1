import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain implements Directions
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.setup();
        test.test1_obstacle();
        test.test2_obstacle();
    }

    @Before
    public void setup() {
        
    }

    @Test
    public void test1_obstacle()
    {   
        Map.getInstance().initialize();
        Map.getInstance().loadMap("maps/obstacle1.jev");
        Jeroo j1 = new Jeroo(23, 12, NORTH, 0);
        j1.runCourse();
        assertEquals("should still be at (3, 0)", 3, j1.getY());
        assertEquals("should still be at (3, 0)", 0, j1.getX());
        
    }
    
        @Test
    public void test2_obstacle()
    {   
        Map.getInstance().initialize();
        Map.getInstance().loadMap("maps/obstacle2.jev");
        Jeroo j1 = new Jeroo(23, 12, NORTH, 0);
        j1.runCourse();
        assertEquals("should still be at (1, 23)", 1, j1.getY());
        assertEquals("should still be at (1, 23)", 23, j1.getX());
        
    }
    

}
