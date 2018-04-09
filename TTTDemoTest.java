
package tttdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tha
 */
public class TTTDemoTest {
    
    public TTTDemoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    /**
     * Test of calculate1 method, of class TTTDemo.
     */
    @Test
    public void testCalculate1() {
        System.out.println("calculate1");
        int n = 0;
        TTTDemo instance = new TTTDemo();
        int expResult = 7;
        int result = instance.calculate1(n);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calculate2 method, of class TTTDemo.
     */
    @Test
    public void testCalculate2() {
        System.out.println("calculate2");
        int n = 0;
        TTTDemo instance = new TTTDemo();
        int expResult = 89;
        int result = instance.calculate2(n);
        assertEquals(expResult, result);
       
    }
    
}
