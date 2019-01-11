package CircuitManager;


/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
abstract class TwoPinsComponent extends CircuitComponent {

	protected Component firstComponent;
	protected Component secondComponent;

	public TwoPinsComponent(){

	}
        
        public TwoPinsComponent(Component c1, Component c2){
            firstComponent = c1;
            secondComponent = c2;
	}
        
	public void finalize() throws Throwable {
		super.finalize();
	}
}//end TwoPinsComponent