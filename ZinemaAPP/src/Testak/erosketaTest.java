package Testak;
import Modeloa.*;
import java.util.ArrayList;

import static  org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

import Modeloa.Filma;
import Modeloa.Sarrera;

public class erosketaTest {
	Modeloa.Aretoa aretoa;
	Modeloa.Erosketa erosketa ;
	Modeloa.Sarrera sarrera;
	Modeloa.Sarrera sarrera2;
	Modeloa.Saioa saioa;
	Modeloa.Filma filma;
	Modeloa.Erabiltzaile erabiltzaile;
	ArrayList<Sarrera> sarrerak;
	ArrayList<Sarrera> sarrerak2;
	Modeloa.Erabiltzaile erabiltzaile2;
	
	
	@Before
	public void setUp() {
		filma = new Filma("Avatar",33,"zientzia-fikzioa",90);
		
		aretoa = new Aretoa("AretoGorria", 41);
		
		saioa = new Saioa(1,aretoa,LocalDate.of(2022, 2, 6),LocalTime.of(14, 30),13.42,filma);
		
		sarrera = new Sarrera(saioa,"MiniBoo",3);
		
		sarrerak = new ArrayList<>(); 
		sarrerak.add(sarrera);
		
		erabiltzaile = new Erabiltzaile("Cruasant","Jon", "p@ssw0rd", "Snow", LocalDate.of(1990, 7, 7), "12345678A", "Male", 1);
		
		erosketa = new Erosketa(sarrerak,33,erabiltzaile,LocalDateTime.of(2022, 2, 5, 15, 0),3.5);

		/* Bi array sarrerak sortu gero "set"-a aplikatzeko */
		filma = new Filma("Avatar",33,"zientzia-fikzioa",90);
		
		aretoa = new Aretoa("AretoGorria",41);
		
		saioa = new Saioa(1,aretoa,LocalDate.of(2022, 2, 6),LocalTime.of(14, 30),13.42,filma);
		
		sarrera2 = new Sarrera(saioa,"Reset",2);
			
		sarrerak2 = new ArrayList<>(); 
		sarrerak2.add(sarrera);
		
		/* Era berean bi erabiltzaile eduki behar ditugu "set"-a aplikatzeko */
		Erabiltzaile erabiltzaile2 = new Erabiltzaile("patxifrankotiradorea","Arya", "v@larm0rgul1s", "Stark", LocalDate.of(1998, 4, 25), "87654321B", "Female", 2);

	}
	
	@Test
    public void testToString() {
		
		assertEquals(erabiltzaile.toString(),erabiltzaile.toString());
		
	}

	@Test
    public void testGettersAndSetters() {
				
		erosketa.setSarrerak(sarrerak2);
		assertEquals(sarrerak2,erosketa.getSarrerak());
		erosketa.setPrezioTotala(44);
		assertEquals(44,erosketa.getPrezioTotala());
		erosketa.setErabiltzailea(erabiltzaile2);
		assertEquals(erabiltzaile2,erosketa.getErabiltzailea());
		erosketa.setDataordua(LocalDateTime.of(2022, 5, 12, 11, 1));
		assertEquals(LocalDateTime.of(2022, 5, 12, 11, 1),erosketa.getDataordua());
		erosketa.setDeskontua(7.3);
		assertEquals(7.3,erosketa.getDeskontua(),0.01);
	}
	@Test
	public void testEquals() {
	    Erosketa sameErosketa = new Erosketa(sarrerak, 33, erabiltzaile, LocalDateTime.of(2022, 2, 5, 15, 0), 3.5);
	    assertTrue(erosketa.equals(sameErosketa));

	    Erosketa differentErosketa = new Erosketa(sarrerak2, 44, erabiltzaile2, LocalDateTime.of(2022, 5, 12, 11, 1), 7);
	    assertFalse(erosketa.equals(differentErosketa));
	}

	@Test
	public void testHashCode() {
	    Erosketa sameErosketa = new Erosketa(sarrerak, 33, erabiltzaile, LocalDateTime.of(2022, 2, 5, 15, 0), 3.5);
	    assertEquals(erosketa.hashCode(), sameErosketa.hashCode());

	  }

	
}
