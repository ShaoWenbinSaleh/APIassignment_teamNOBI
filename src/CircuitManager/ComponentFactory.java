package CircuitManager;


/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
class ComponentFactory {

	public ComponentFactory(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param s
     * @param c
     * @return 
	 */
//	public Component createComponent(String s){
//		return null;
//	}
        
//        public TwoPinsComponent createComponent(char c, String s1, String s2){
//            if ( c== '&')
//            {
//                return new AND(new CircuitComponent(s1), new CircuitComponent(s2));
//            }
//            // |
//            else
//            {
//               return new OR(new CircuitComponent(s1), new CircuitComponent(s2));
//            }
//	}
        
        public static AND createANDComponent(Component s, Component c)
        {
            return new AND(s, c);
        }
        
        public static OR createORComponent(Component s, Component c)
        {
            return new OR(s, c);
        }
        
        public static NOT createNOTComponent(Component c)
        {
            return new NOT(c);
        }
        
}//end ComponentFactory