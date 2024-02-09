package Testak;
import Modeloa.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

public class SaioaTest {

	private Modeloa.Aretoa aretoa;
	private Modeloa.Filma filma;
	private Modeloa.Saioa saioa;
	
	@Before
	public void setUp() {
		filma  = new Filma("Avatar", 1, "zientzia-fikzioa", 90);
		aretoa = new Aretoa("aretoa1", 1);
		saioa = new Saioa(1, aretoa, LocalDate.now(), LocalTime.of(10, 30),13.5,filma);
	}
	
	@Test
    public void testToString() {
		
		assertEquals(saioa.toString(),saioa.toString());
		
	}
	
	@Test
	public void testGettersAndSetters() {
		saioa.setId(2);
		assertEquals(2, saioa.getId());
		
		Filma filma2 = new Filma("Cars", 2, "Drama", 120);
		saioa.setFilma(filma2);
		
		assertEquals(filma2, saioa.getFilma());
		
		Aretoa aretoa2 = new Aretoa("aretoa2", 2);
		saioa.setAretoa(aretoa2);	
		assertEquals(aretoa2, saioa.getAretoa());
		
		saioa.setData(LocalDate.of(2014,4,5));
		assertEquals(LocalDate.of(2014,4,5),saioa.getData());
		
		saioa.setH_ordua(LocalTime.of(20, 30));
		assertEquals(LocalTime.of(20, 30), saioa.getH_ordua());
		
		saioa.setPrezioa(9.8);
		assertEquals(9.8,saioa.getPrezioa(),0.01);
		
	}
	
	@Test
	public void testEquals(){
		Modeloa.Saioa saioa1 = saioa;
		Modeloa.Saioa saioa2 = new Saioa(2, aretoa, LocalDate.now(), LocalTime.of(10, 30),13.5,filma);
	
		assertTrue(saioa1.equals(saioa));
		assertFalse(saioa1.equals(saioa2));
	}
	
	@Test
	public void testHashCode() {
		Saioa saioa2 = new Saioa(1, aretoa, LocalDate.now(), LocalTime.of(10, 30),13.5,filma);
		
		assertEquals(saioa.hashCode(), saioa2.hashCode());
		
	}
}
