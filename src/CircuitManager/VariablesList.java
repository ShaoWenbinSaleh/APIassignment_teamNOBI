package CircuitManager;

import java.util.HashMap;

/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
class VariablesList {

	private static VariablesList instance;
	private HashMap <String, Double> variablesHashMap;

	public VariablesList(){
            variablesHashMap = new HashMap<String, Double>();
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
//	public boolean getVariableByName(String s){
//            if(variablesHashMap.containsKey(s))
//            {
//                return variablesHashMap.get(s);
//            }
//            else
//            {
//                return GlobalVar.defaultValue;
//                //default value
////                return false;
//            }
//	}
        
       public double getVariableByName(String s){
            if(variablesHashMap.containsKey(s))
            {
                return variablesHashMap.get(s);
            }
            else
            {
                return GlobalVar.defaultValueDouble;
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
            if(b) {
               setVariable(s, 1.0);
            }
            else{
               setVariable(s, 0.0);
            }
	}
        
        public void setVariable(String s, double d) 
        {
            //TODO: same variable
//            if(variablesHashMap.containsKey(s))
//            {
//                throw new IllegalArgumentException("The input value " + s + " has already been defined!");
//            }
            
            if (d < 0 && d > 1)
            {
                throw new IllegalArgumentException("The input value " + d + " should be between 0 and 1!");
            }
            
            variablesHashMap.put(s, d);
        }
        
        public void reset()
        {
            variablesHashMap.clear();
        }
        
}//end VariablesList