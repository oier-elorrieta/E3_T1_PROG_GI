package Testak;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Modeloa. *;


public class AretoaTest {


private Modeloa.Aretoa areto;
	
	@Before
	public void setUp() {
		areto = new Aretoa("AretoGorria",41); 
	}
	
	@Test
    public void testToString() {
		
		assertEquals(areto.toString(),"Aretoa [izena=" + "AretoGorria" + ", id=" + 41 + "]");
		
	}
	
    @Test
    public void testGettersAndSettersIzena() {
    	areto.setIzena("AretoInfantil");
    	assertEquals("AretoInfantil",areto.getIzena());
    }
    @Test
    public void testGettersAndSettersId() {
       	areto.setId(33);
    	assertEquals(33,areto.getId());
    }
    
    @Test
    public void testEquals() {
    	Modeloa.Aretoa aretoBerdina = areto;
    	assertTrue(areto.equals(aretoBerdina));
    }
    
    @Test
    public void testNotEquals() {
    	Modeloa.Aretoa aretoDesberdina = new Aretoa("AretoFake",3);
    	assertFalse(areto.equals(aretoDesberdina));
    }

}
