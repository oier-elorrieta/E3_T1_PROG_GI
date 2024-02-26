package Testak;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import Modeloa.*;
 

public class erabiltzaileTest {
	
    private Modeloa.Erabiltzaile erabiltzaile;

    @Before
    public void setUp() {
        erabiltzaile = new Erabiltzaile("Cruasant","Jon", "p@ssw0rd", "Snow", LocalDate.of(1990, 7, 7), "12345678A", "Male", 1);
        
    }
    
    @Test
    public void testToString() {
    	
    	assertEquals(erabiltzaile.toString(),erabiltzaile.toString());
    	

    }
    

    @Test
    public void testGettersAndSettersErabiltzaile() {
    	erabiltzaile.setErabiltzaile("patxifrankotiradorea");
    	assertEquals("patxifrankotiradorea",erabiltzaile.getErabiltzaile());
    }
    @Test
    public void testGettersAndSettersIzena() {
    	erabiltzaile.setIzena("Arya");
        assertEquals("Arya", erabiltzaile.getIzena());
    }
    @Test
    public void testGettersAndSettersPasahitza() {
        erabiltzaile.setPasahitza("v@larm0rgul1s");
        assertEquals("v@larm0rgul1s", erabiltzaile.getPasahitza());
    }
    @Test
    public void testGettersAndSettersAbizena() {
        erabiltzaile.setAbizena("Stark");
        assertEquals("Stark", erabiltzaile.getAbizena());
    }
    @Test
    public void testGettersAndSettersData() {
        erabiltzaile.setJaiotzedata(LocalDate.of(1998, 4, 25));
        assertEquals(LocalDate.of(1998, 4, 25), erabiltzaile.getJaiotzedata());
    }  
    @Test
    public void testGettersAndSettersNan() {
        erabiltzaile.setNan("87654321B");
        assertEquals("87654321B", erabiltzaile.getNan());
    }
    @Test
    public void testGettersAndSettersGeneroa() {
        erabiltzaile.setgeneroa("Female");
        assertEquals("Female",erabiltzaile.getgeneroa());
    }
    @Test
    public void testGettersAndSettersId() {
        erabiltzaile.setId(2);
        assertEquals(2, erabiltzaile.getId());
    }
	
    @Test
    public void testEquals() {
    	Modeloa.Erabiltzaile sameErabiltzaile = erabiltzaile;
        Modeloa.Erabiltzaile differentErabiltzaile = new Erabiltzaile("patxifrankotiradorea","Arya", "v@larm0rgul1s", "Stark", LocalDate.of(1998, 4, 25),
                "87654321B", "Female", 2);
        assertTrue(erabiltzaile.equals(sameErabiltzaile));
        assertFalse(erabiltzaile.equals(differentErabiltzaile));
    }

    
}
