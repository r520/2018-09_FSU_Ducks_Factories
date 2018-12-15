/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 * Student: Radhika Kasu
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly;

/**
 * Instantiating Fly behavior of the duck
 */
public class FlyBehaviorFactory {

    /**
     * @param type the GIF file name to display when flying or flying which just prints out 'cannot fly'.
     * @return Instance
     */
    public static FlyingBehavior flybehavior(String type) {
        FlyingBehavior fb = null;

        if (type != null) {
            fb = new SimpleFly(type);
        } else {
            fb = new CannotFly();
        }
        return fb;
    }
}
