package CircuitManager;


/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
abstract class OnePinComponent extends CircuitComponent {

	protected Component component;

	public OnePinComponent(Component c){
            component = c;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end OnePinComponent