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
public class MyMergeSortIT extends TestCase {
    
    public MyMergeSortIT(String testName) {
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
     * Test of sort method, of class MyMergeSort.
     */
    public void testSort() {
        System.out.println("sort");
        int[] inputArr = null;
        MyMergeSort instance = new MyMergeSort();
        instance.sort(inputArr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarNumeros method, of class MyMergeSort.
     */
    public void testGenerarNumeros() {
        System.out.println("generarNumeros");
        int cant = 0;
        int max = 0;
        MyMergeSort instance = new MyMergeSort();
        int[] expResult = null;
        int[] result = instance.generarNumeros(cant, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
