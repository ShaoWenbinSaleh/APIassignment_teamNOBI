package CircuitManager;


/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
class OR extends TwoPinsComponent {

	public OR(Component f, Component s){
            super(f, s);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    @Override
    protected double getResultDouble() {
        return  1 - ( 1 - firstComponent.getResultDouble())*( 1 - secondComponent.getResultDouble());
    }
}//end OR