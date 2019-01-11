package CircuitManager;


/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
class AND extends TwoPinsComponent {

	public AND(Component first, Component second){
            super(first, second);
	}
        
	public void finalize() throws Throwable {
		super.finalize();
	}
	public boolean getResult(){
		return firstComponent.getResult() && secondComponent.getResult();
	}
}//end AND