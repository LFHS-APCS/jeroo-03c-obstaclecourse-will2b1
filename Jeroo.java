/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    /** 
     * 
     * A very peculiar obstacle course is laid out.
     * A Jeroo starts near the bottom of the island facing north.
     * First it travels north until it finds a flower.
     * Then, it picks all the flowers in front of it.
     * Then, continuing north, it races past all the clear
     *    spaces until it arrives at a set of nets.
     * The Jeroo continues it's northward journey and disables
     *    all the nets that are directly in front of it
     * Once past the nets the Jeroo hops to the next flower 
     *    and turns right if the space past the flower is a net, 
     *    or turns left if the space past the flower is water
     * The Jeroo finishes when it reaches the water at the east
     *    or west end of the island (without picking flowers).
     */
    public void runCourse() {

    }

    
    
    
    // Do NOT touch the code below here
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}
}

