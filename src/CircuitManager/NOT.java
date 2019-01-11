package CircuitManager;


/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
class NOT extends OnePinComponent {

//	public NOT(){
//
//	}
        
        public NOT(Component c){
            super(c);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public boolean getResult(){
		return !(component.getResult());
	}

    @Override
    protected double getResultDouble() {
        return 1- component.getResultDouble();
    }
}//end NOT