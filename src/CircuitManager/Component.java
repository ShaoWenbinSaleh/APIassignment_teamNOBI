package CircuitManager;


/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
abstract class Component {

//	protected String expression;
       protected abstract double getResultDouble();
        
       public boolean getResult() 
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