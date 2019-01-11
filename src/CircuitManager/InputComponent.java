package CircuitManager;


/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
class InputComponent extends Component {

	private String varName;

	public InputComponent(){

	}
        
        public InputComponent(String str){
            varName = str;
//            super();
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    @Override
    protected double getResultDouble() {
        return VariablesList.getInstance().getVariableByName(varName);
    }
        

}//end InputComponent