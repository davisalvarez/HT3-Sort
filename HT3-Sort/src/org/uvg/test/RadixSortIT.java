/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 *
 * @author Marlon
 */
public class RadixSortIT extends TestCase {
    
    public RadixSortIT(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of sort method, of class RadixSort.
     */
    public void testSort() {
        System.out.println("sort");
        int[] a = null;
        RadixSort.sort(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarNumeros method, of class RadixSort.
     */
    public void testGenerarNumeros() {
        System.out.println("generarNumeros");
        int cant = 0;
        int max = 0;
        RadixSort instance = new RadixSort();
        int[] expResult = null;
        int[] result = instance.generarNumeros(cant, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
