/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sanjidah Gundkalli
 */
public class banktest {
    bank b;
    
    public banktest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b=new bank();
    }
    
    @After
    public void tearDown() {
    }

         @Test
         
    public void bank() {
        assertEquals(0, b.addAcc(100,100));
         assertEquals(40, b.addAcc(40,300));
          assertEquals(50, b.addAcc(50,375));
    }
    
@Test
    
      public void deposit() {
        assertEquals(5100, b.deposit(100,102,102,5000));
        assertEquals(7000, b.deposit(6000,101,101,1000));
        assertEquals(9700, b.deposit(700,122,122,9000));
    
}
      
 @Test
    public void withdraw() {
        assertEquals(400, b.withdraw(600,202,202,1000));
        assertEquals(500, b.withdraw(500,206,206,1000));
        assertEquals(800, b.withdraw(200,205,205,1000));
    }
    
    @Test
    public void totbal() {
        assertEquals(4000, b.totbal(4000));
    }
    
    
    @Test
    public void transfer() {
        assertEquals(9000, b.transfer(1055,10000,1000,1056));
        assertEquals(8990, b.transfer(1057,10078,1088,5687));
        assertEquals(48400, b.transfer(5523,56000,7600,5654));
    }