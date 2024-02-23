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
    public void testGettersAndSetters() {
    	erabiltzaile.setErabiltzaile("patxifrankotiradorea");
    	assertEquals("patxifrankotiradorea",erabiltzaile.getErabiltzaile());
    	erabiltzaile.setIzena("Arya");
        assertEquals("Arya", erabiltzaile.getIzena());
        erabiltzaile.setPasahitza("v@larm0rgul1s");
        assertEquals("v@larm0rgul1s", erabiltzaile.getPasahitza());
        erabiltzaile.setAbizena("Stark");
        assertEquals("Stark", erabiltzaile.getAbizena());
        erabiltzaile.setJaiotzedata(LocalDate.of(1998, 4, 25));
        assertEquals(LocalDate.of(1998, 4, 25), erabiltzaile.getJaiotzedata());
        erabiltzaile.setNan("87654321B");
        assertEquals("87654321B", erabiltzaile.getNan());
        erabiltzaile.setgeneroa("Female");
        assertEquals("Female",erabiltzaile.getgeneroa());
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
