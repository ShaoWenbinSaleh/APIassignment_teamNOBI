package CircuitManager;

import java.util.HashMap;

/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
class VariablesList {

	private static VariablesList instance;
	private HashMap <String, Boolean> variablesHashMap;

	public VariablesList(){
            variablesHashMap = new HashMap<String, Boolean>();
	}

	public void finalize() throws Throwable {

	}
        
	public static synchronized VariablesList getInstance(){
            if (instance == null)
            {
                instance = new VariablesList();
                return instance;
            }
            return instance;
	}

	/**
	 * 
	 * @param s
	 */
	public boolean getVariableByName(String s){
            if(variablesHashMap.containsKey(s))
            {
                return variablesHashMap.get(s);
            }
            else
            {
                return GlobalVar.defaultValue;
                //default value
//                return false;
            }
	}

	/**
	 * 
	 * @param s
	 * @param b
	 */
	public void setVariable(String s, boolean b){
            variablesHashMap.put(s, b);
	}
        
        public void reset()
        {
            variablesHashMap.clear();
        }
        
}//end VariablesList