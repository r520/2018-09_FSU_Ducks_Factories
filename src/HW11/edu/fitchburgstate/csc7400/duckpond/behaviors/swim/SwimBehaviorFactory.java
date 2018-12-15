
/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 * Student: Radhika Kasu
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim;

/**
 * Instantiating Swim behavior of the duck
 */

public class SwimBehaviorFactory {

/**
 * @param sb the GIF file name to display when swimming.
 * @return Instance
 *
 */
    public static SwimBehavior swimbehavior(String sb) {

        return new SimpleSwim(sb);

    }
}


