/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircuitManager;

/**
 *
 * @author 20184770
 */
public abstract class CustomTwoPinsComponent extends TwoPinsComponent {

    public CustomTwoPinsComponent(Component c1, Component c2) {
        super(c1, c2);
    }
    
    public abstract boolean evaluateResult(boolean first, boolean second);
    
    public boolean getResult()
    {
	return evaluateResult(firstComponent.getResult(), secondComponent.getResult());
    }
}