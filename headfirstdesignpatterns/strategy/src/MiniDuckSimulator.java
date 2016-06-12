import co.sabi11.base.AbstractDuck;
import co.sabi11.interfaces.FlyNoWay;
import co.sabi11.interfaces.FlyRocketPowered;
import co.sabi11.interfaces.FlyWithWings;
import co.sabi11.subclass.MallardDuck;
import co.sabi11.subclass.ModelDuck;

/**
 * 
 */

/**
 * @author Sabi
 *
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create a MallardDuck object with test its behaviours.
		AbstractDuck mallard = new MallardDuck();	
		mallard.performQuack();
		mallard.performFly();
		
		/* Create a ModelDuck object with test its behaviours, using runtime settings,
		 * however, the default fly mode is "FlyNoWay", that will be reset with new "FlyRocketBehaviour". 
		 */
		
		System.out.println("--------------------------------------------------------");
		AbstractDuck model = new ModelDuck();
		model.performFly();
		model.setFlyBehaviour(new FlyRocketPowered());
		//model.setFlyBehaviour(new FlyWithWings());
		//model.setFlyBehaviour(new FlyNoWay());
		model.performFly();

	}

}
