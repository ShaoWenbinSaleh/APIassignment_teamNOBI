/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import CircuitManager.CircuitManager;
import CircuitManager.Component;
import CircuitManager.CustomTwoPinsComponent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author 20184770
 */
public class CircuitManagerTest {
    
    public CircuitManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
//    @Rule
//    public ExpectedException thrown = ExpectedException.none(); 
    /**
     * Test of finalize method, of class CircuitManager.
     */
//    @Test
//    public void testFinalize() throws Exception {
//        System.out.println("finalize");
//        CircuitManager instance = new CircuitManager();
//        instance.finalize();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of createCircuit method, of class CircuitManager.
//     */
//    @Test
//    public void testCreateCircuit() {
//        System.out.println("createCircuit");
//        String a = "";
//        CircuitManager instance = new CircuitManager();
//        instance.createCircuit(a);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCircuitResult method, of class CircuitManager.
//     */
//    @Test
//    public void testGetCircuitResult() {
//        System.out.println("getCircuitResult");
//        CircuitManager instance = new CircuitManager();
//        String expResult = "";
//        String result = instance.getCircuitResult();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setCircuitVariable method, of class CircuitManager.
//     */
//    @Test
//    public void testSetCircuitVariable() {
//        System.out.println("setCircuitVariable");
//        String a = "";
//        boolean b = false;
//        CircuitManager instance = new CircuitManager();
//        instance.setCircuitVariable(a, b);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setCircuitVariables method, of class CircuitManager.
//     */
//    @Test
//    public void testSetCircuitVariables() {
//        System.out.println("setCircuitVariables");
//        String a = "";
//        CircuitManager instance = new CircuitManager();
//        instance.setCircuitVariables(a);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of newAND method, of class CircuitManager.
//     */
//    @Test
//    public void testNewAND_String_String() {
//        System.out.println("newAND");
//        String a = "";
//        String b = "";
//        CircuitManager instance = new CircuitManager();
//        CircuitComponent expResult = null;
//        CircuitComponent result = instance.newAND(a, b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of newOR method, of class CircuitManager.
//     */
//    @Test
//    public void testNewOR_String_String() {
//        System.out.println("newOR");
//        String a = "";
//        String b = "";
//        CircuitManager instance = new CircuitManager();
//        CircuitComponent expResult = null;
//        CircuitComponent result = instance.newOR(a, b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of newNOT method, of class CircuitManager.
//     */
//    @Test
//    public void testNewNOT_String() {
//        System.out.println("newNOT");
//        String a = "";
//        CircuitManager instance = new CircuitManager();
//        CircuitComponent expResult = null;
//        CircuitComponent result = instance.newNOT(a);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of newAND method, of class CircuitManager.
//     */
//    @Test
//    public void testNewAND_Component_Component() {
//        System.out.println("newAND");
//        Component a = null;
//        Component b = null;
//        CircuitManager instance = new CircuitManager();
//        CircuitComponent expResult = null;
//        CircuitComponent result = instance.newAND(a, b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of newOR method, of class CircuitManager.
//     */
//    @Test
//    public void testNewOR_Component_Component() {
//        System.out.println("newOR");
//        Component a = null;
//        Component b = null;
//        CircuitManager instance = new CircuitManager();
//        CircuitComponent expResult = null;
//        CircuitComponent result = instance.newOR(a, b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of newNOT method, of class CircuitManager.
//     */
//    @Test
//    public void testNewNOT_Component() {
//        System.out.println("newNOT");
//        Component a = null;
//        CircuitManager instance = new CircuitManager();
//        CircuitComponent expResult = null;
//        CircuitComponent result = instance.newNOT(a);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setInput method, of class CircuitManager.
//     */
//    @Test
//    public void testSetInput() {
//        System.out.println("setInput");
//        String str = "";
//        boolean b = false;
//        CircuitManager instance = new CircuitManager();
//        instance.setInput(str, b);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class CircuitManager.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        CircuitManager.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    @Test
    public void testx1andx2()
    {
        CircuitManager system = new CircuitManager();
        
        Component a = system.newAND("A", "B");
                
        system.setInput("A", true);
        system.setInput("B", true);
        boolean res = a.getResult();
        
        assertEquals(true, res);
   }
    
    @Test
    public void testx1andx2orX3()
    {
        CircuitManager system = new CircuitManager();
        
        Component a = system.newAND("A", "B");
        Component b = system.newOR(a, "C");
        
        system.setInput("A", true);
        system.setInput("B", true);
        system.setInput("C", false);
        
        boolean res = b.getResult();
        
        assertEquals(true, res);
   }
    
    @Test
    public void testAlwaysTrue()
    {
        CircuitManager system = new CircuitManager();
        
        Component b = system.newNOT("A");
        Component a = system.newOR("A", b);
        
        boolean res = a.getResult();
        assertEquals(true, res);
//        CircuitManager system = new CircuitManager();
//        
//        Component a = system.newAND("A", "B");
//        
//        Component b = system.newOR("C", "D");
//        
//        Component test = system.newAND(a, b);
//        system.setInput("A", true);
//        system.setInput("B", false);
//        system.setInput("C", false);
//        system.setInput("D", true);

//        CustomTwoPinsComponent test = new CustomTwoPinsComponent(a, b) {
//            @Override
//            public double evaluateResultDouble(double first, double second) {
//                if ( first >= second) {
//                    return first * 100;
//                }
//                else {
//                    return second + 10000000;
//                }
//            }
//        };
       
//        System.out.print(test.getResult());
   }
    
    //step2
    @Test
    public void testX1andX2orNotX1()
    {
        CircuitManager system = new CircuitManager();
        
        Component a = system.newAND("X1", "X2");
        Component b = system.newNOT("X1");
        Component c = system.newOR(a, b);
        
        system.setInput("X1", true);
        system.setInput("X2", false);
        
        boolean res = c.getResult();
        assertEquals(false, res);
        
        system.Reset();
        
        system.setInput("X1", false);
        system.setInput("X2", true);
        res = c.getResult();
        assertEquals(true, res);
        
        system.Reset();
        
        system.setInput("X1", 0.0);
        system.setInput("X2", 1.0);
        double resDouble = c.getResultDouble();
        assertTrue(1.0 == resDouble);
//        assertEquals(1.0, resDouble);
        
        system.Reset();
        
        system.setInput("X1", 0.5);
        system.setInput("X2", 0.5);
        resDouble = c.getResultDouble();
        assertTrue(0.625 == resDouble);
//        assertEquals(0.625, resDouble);
        
        
//        system.Reset();
        
       
//        thrown.expect(IllegalArgumentException.class);
   }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testX1andX2orNotX1_exception()
    {
        CircuitManager system = new CircuitManager();
        
        Component a = system.newAND("X1", "X2");
        Component b = system.newNOT("X1");
        Component c = system.newOR(a, b);
        system.setInput("X1", 0.0);
        system.setInput("X2", 2.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testImproperUseOfTheCircuit()
    {
        CircuitManager system = new CircuitManager();
        
        Component a = system.newAND("X1", "X1");
        system.setInput("X1", 0.3);
        system.setInput("X1", 0.5);
    }
    
    @Test
    public void testGreaterThanElement()
    {
        CircuitManager system = new CircuitManager();
        Component a = system.newAND("X1", system.newNOT("X1"));
        Component b = system.newInputComponent("X1");
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
        
        system.Reset();
        system.setInput("X1", 0.5);
        assertTrue(0.0 == test.getResultDouble());
       
        system.Reset();
        system.setInput("X1", 1);
        assertTrue(0.0 == test.getResultDouble());
        
        system.Reset();
        system.setInput("X1", 0);
        assertTrue(1.0 == test.getResultDouble());
    }
}
