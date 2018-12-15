/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 * Student: Radhika Kasu
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack;
/**
 * Instantiating Quack behavior of the duck
 */
public class QuackBehaviorFactory {

    /**
     *
     * @param type the GIF file name to display when Quacking or which just prints out 'cannot fly'.
     * @return Instance
     */
    public static QuackBehavior quackbehavior(String type) {
        QuackBehavior qb = null;

        if (type != null) {

            if (type == "quack") {
                qb = new DuckQuack();
            } else if (type == "squeak") {
                qb = new Squeak();
            }
        } else {
            qb = new CannotQuack();
        }
        return qb;
    }
    }