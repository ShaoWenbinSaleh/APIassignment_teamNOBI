package CircuitManager;


/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
abstract public class Component {

//	protected String expression;
       public abstract double getResultDouble();
        
       public final boolean getResult() 
       {
           double res = getResultDouble();
           if (res == 0) 
           {
               return false;
           }
           else if (res == 1)
           {
               return true;
           }
           else
           {
               throw  new UnsupportedOperationException("Not supported yet.");
           }
       }

}//end Component