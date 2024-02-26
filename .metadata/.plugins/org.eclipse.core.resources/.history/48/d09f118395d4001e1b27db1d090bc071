package Testak;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

import Modeloa.*;



public class SarreraTest {

	private Modeloa.Sarrera sarrera;
	private Modeloa.Aretoa aretoa;
	private Modeloa.Filma filma;
	private Modeloa.Saioa saioa;
	private Modeloa.Saioa saioa2;
	
	@Before
	public void setUp() {
	aretoa = new Aretoa("aretoa1", 1);
	filma  = new Filma("Avatar", 1, "zientzia-fikzioa", 90);
	saioa = new Saioa(1, aretoa, LocalDate.now(), LocalTime.of(10, 30),13.5,filma);
	sarrera = new Sarrera(1, LocalDateTime.of(2029, 6, 2, 15, 30), saioa, "MegaPark");
	}
	
	@Test
    public void testToString() {
		
		assertEquals(sarrera.toString(),sarrera.toString());
		
	}
	
	@Test
	public void testGettersAndSetters() {
		
		sarrera.setId(2);
		assertEquals(2, sarrera.getId());
		
		sarrera.setData_ordua(LocalDateTime.of(2014,4,5,15, 5 ));
		assertEquals(LocalDateTime.of(2014,4,5,15, 5),sarrera.getData_ordua());
	
		Saioa saioa2 = new Saioa(1, aretoa, LocalDate.now(), LocalTime.of(10, 30),13.5,filma); 
		sarrera.setSaioa(saioa2);
		assertEquals(saioa2, sarrera.getSaioa());
		
		sarrera.setZinema("MegaPark");
		assertEquals("MegaPark", sarrera.getZinema());
		
	}
		
	@Test
	public void testEquals() {
		Modeloa.Sarrera sarrera1 = sarrera;
		Modeloa.Sarrera sarrera2 = new Sarrera(2, LocalDateTime.of(2014,4,5,15, 5), saioa2, "MegaPark");
	
	assertTrue(sarrera.equals (sarrera1));
	assertFalse(sarrera.equals(sarrera2));
	}
	
	@Test
	public void testHashCode() {
		Modeloa.Sarrera sarrera2 = new Sarrera(2, LocalDateTime.of(2014,4,5,15, 5), saioa2, "MegaPark");
	
		assertEquals(sarrera.hashCode(), sarrera.hashCode());
	}
	
	}