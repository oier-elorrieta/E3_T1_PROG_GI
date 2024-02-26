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
	sarrera = new Sarrera(saioa,"OTTIS cinema",33);
	}
	
	@Test
    public void testToString() {

		assertEquals(sarrera.toString(),sarrera.toString());
		
	}
	
	@Test
	public void testSetGetSaioa() {
		
		Saioa saioa2 = new Saioa(1, aretoa, LocalDate.now(), LocalTime.of(10, 30),13.5,filma); 
		sarrera.setSaioa(saioa2);
		assertEquals(saioa2, sarrera.getSaioa());
	
	}
	
	@Test
	public void testSetGetZinema() {
		sarrera.setZinema("Zubiarte");
		assertEquals("Zubiarte",sarrera.getZinema());
	}
	@Test
	public void testSetGetKantitatea() {
		sarrera.setKantitatea(3);
		assertEquals(3,sarrera.getKantitatea());
	}
		
	@Test
	public void testEquals() {
		Modeloa.Sarrera sarrera1 = sarrera;
	
		assertTrue(sarrera.equals(sarrera1));
	}
	@Test
	public void testNotEquals() {
		Modeloa.Sarrera sarrera1 = sarrera;
		Modeloa.Sarrera sarrera2 = new Sarrera( saioa2, "MegaPark",69);
		
		assertFalse(sarrera1.equals(sarrera2));
	}
	
	@Test
	public void testHashCode() {
		Modeloa.Sarrera sarrera2 = new Sarrera( saioa2, "MegaPark",69);
	
		assertEquals(sarrera.hashCode(), sarrera.hashCode());
	}
	
	}