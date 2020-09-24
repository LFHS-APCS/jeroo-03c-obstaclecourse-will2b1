/**
 *  See Readme.md for instructions.
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        Map.getInstance().loadMap("maps/obstacle1.jev");
        new JerooGUI();
        runJerooCode();

    }

    /**
     * You can change which tests you are running here.
     */
    public static void runJerooCode() {
       Jeroo kim = new Jeroo(23,12, NORTH);
       kim.runCourse();
    }

}
