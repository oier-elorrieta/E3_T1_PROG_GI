package Testak;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Modeloa. *;


public class AretoaTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
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
    public void testGettersAndSetters() {
    	areto.setIzena("AretoInfantil");
    	assertEquals("AretoInfantil",areto.getIzena());
    	areto.setId(33);
    	assertEquals(33,areto.getId());
    }
    
    @Test
    public void testEquals() {
    	Modeloa.Aretoa aretoBerdina = areto;
    	Modeloa.Aretoa aretoDesberdina = new Aretoa("AretoFake",3);
 
    	assertTrue(areto.equals(aretoBerdina));
    	assertFalse(areto.equals(aretoDesberdina));
    }

}
