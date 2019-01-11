package CircuitManager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author 20184770
 * @version 1.0
 * @created 10-Jan-2019 11:52:38 PM
 */
class CircuitManager {

    private CircuitComponent circuit;

    public CircuitManager() {
        VariablesList.getInstance().reset();
    }

    public void finalize() throws Throwable {

    }

    /**
     *
     * @param a
     */
    public void createCircuit(String a) {

    }

    public String getCircuitResult() {
        return "";
    }

    /**
     *
     * @param a
     * @param b
     */
    public void setCircuitVariable(String a, boolean b) {

    }

    /**
     *
     * @param a
     */
    public void setCircuitVariables(String a) {

    }
    
    public CircuitComponent newAND(Component a, Component b)
    {
        return ComponentFactory.createANDComponent(a, b);
    }
        
    public CircuitComponent newAND(String a, String b){
        return ComponentFactory.createANDComponent(new InputComponent(a), new InputComponent(b));
    }
    
    public CircuitComponent newAND(Component a, String b)
    {
        return ComponentFactory.createANDComponent(a, new InputComponent(b));
    }
 
    public CircuitComponent newAND(String a, Component b)
    {
        return ComponentFactory.createANDComponent(new InputComponent(a), b);
    }
    
    public CircuitComponent newOR(Component a, Component b){
        return ComponentFactory.createORComponent(a, b);
    }
    
    public CircuitComponent newOR(Component a, String b){
        return ComponentFactory.createORComponent(a, new InputComponent(b));
    }
    
    public CircuitComponent newOR(String a, Component b){
        return ComponentFactory.createORComponent(new InputComponent(a), b);
    }
    
    public CircuitComponent newOR(String a, String b){
        return ComponentFactory.createORComponent(new InputComponent(a), new InputComponent(b));
    }
    
    public CircuitComponent newNOT(String a){
        return ComponentFactory.createNOTComponent(new InputComponent(a));
    }
    
    public CircuitComponent newNOT(Component a){
        return ComponentFactory.createNOTComponent(a);
    }
    
    public void setInput(String str, boolean b)
    {
        VariablesList.getInstance().setVariable(str, b);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("enter the main");
        CircuitManager system = new CircuitManager();
        
        Component a = system.newAND("A", "B");
        
        Component b = system.newOR("C", "D");

        CustomTwoPinsComponent test = new CustomTwoPinsComponent(a, b) {
            @Override
            public double evaluateResultDouble(double first, double second) {
                if ( first >= second) {
                    return 1;
                }
                else {
                    return 0;
                }
            }

        };
        
        System.out.print("out");

        System.out.print("s:" + test.getResultDouble());
    }
}//end CircuitManager
