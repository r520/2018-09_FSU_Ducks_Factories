package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyingBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehavior;

public class BehaviorStrategy {


    public String fb;
    public String qb;
    public String sb;

    /**
     * Returns the flying behavior
     */
    public FlyingBehavior getFlyBehavior() {
        return FlyBehaviorFactory.flybehavior(this.fb);
    }

    /**
     * Returns the quacking behavior
     */
    public QuackBehavior getQuackBehavior() {
        return QuackBehaviorFactory.quackbehavior(this.qb);
    }

    /**
     * Returns the swimming behavior
     */
    public SwimBehavior getSwimBehavior() {
        return SwimBehaviorFactory.swimbehavior(this.sb);
    }


    public static BehaviorStrategy getBehaviors(String flyBehavior, String swimBehavior, String quackBehavior) {
        BehaviorStrategy bs = new BehaviorStrategy();
        bs.fb = flyBehavior;
        bs.qb = quackBehavior;
        bs.sb = swimBehavior;
        return bs;

    }
}