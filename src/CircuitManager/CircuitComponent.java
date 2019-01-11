package CircuitManager;

import java.util.HashMap;


/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
class CircuitComponent extends Component {

	private Component childComponent;
//        private HashMap <String, Boolean> variablesHashMap;
        
	public CircuitComponent(){

	}
       

//        public CircuitComponent(String str)
//        {
//            //with brackets
////            if (str.indexOf('(') > -1) 
////            {
////                
////
////
////            }
//            
//            //without brackets
////            int index = str.lastIndexOf("/& | /|");
////            if (index != -1) 
////            {
////                char twoPinOperator = str.charAt(index);
////                String str1 = str.substring(0, index-1);
////                String str2 = str.substring(index+1);
////            }
//        }
        
        
	public void finalize() throws Throwable {
		super.finalize();
	}
	public boolean getResult(){
		return childComponent.getResult();
	}
}//end CircuitComponent
