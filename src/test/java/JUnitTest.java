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
 * @author paolo
 */
public class JUnitTest {
    
    public JUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     /*@Test
     public void test() {
         String s1 = "ciao";
         String s2 = "ciao";
         assertEquals(s1, s2);
     }*/
     
     @Test
     public void numeroValido(){
         String num = "1234";
         boolean validita = NewJFrame.numeroValido(num);
         assertEquals(validita, true);
     }
     
     @Test
     public void numeroNonValido(){
         String num = "2256";
         boolean validita = NewJFrame.numeroValido(num);
         assertEquals(validita, false);
     }
     
     @Test
     public void lunghezzaGiusta(){
         String num = NewJFrame.randomString();
         assertEquals(num.length(), 4);
     }
     
     @Test
     public void numeriGiustiPosizioniUguali(){
         String num = "1243";
         String num1 = "1234";
         
         int cifreGiustePosizioneGiusta = NewJFrame.numeriGiustiPosizioniUguali(num, num1);
         assertEquals(cifreGiustePosizioneGiusta, 2);
     }
     
     @Test
     public void numeriGiustiPosizioniSbagliate(){
         String num = "0258";
         String num1 = "4526";
         
         int cifreGiustePosizioneSbagliata = NewJFrame.numeriGiustiPosizioniSbagliate(num, num1);
         assertEquals(cifreGiustePosizioneSbagliata, 2);
     }
     
     @Test
     public void numeroIndovinato(){
         String num = "0123";
         String num1 = "0123";
         
         int cifreGiustePosizioneGiusta = NewJFrame.numeriGiustiPosizioniUguali(num, num1);
         assertEquals(cifreGiustePosizioneGiusta, 4);
     }
     
     
}
