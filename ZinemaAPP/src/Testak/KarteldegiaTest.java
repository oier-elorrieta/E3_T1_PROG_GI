package Testak;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Modeloa.*;



public class KarteldegiaTest {
	 private ArrayList<Filma> karteldegiaAr= new ArrayList<>();
	 private Modeloa.Karteldegia karteldegia;
	
	@Before
	public void setUp() { 
		 karteldegiaAr.add(new Filma("Avatar", 1, "zientzia-fikzioa", 90));
		 karteldegiaAr.add(new Filma("Matrix", 2, "zientzia-fikzioa", 120));
		 
		 karteldegia = new Karteldegia(karteldegiaAr);
	}
	
	@Test
    public void testToString() {
		assertEquals(karteldegia.toString(),karteldegia.toString());	
	}
	
	
    @Test
    public void testGettersAndSetters() {

    	Filma filma = new Filma("Los hermanos Lucashevicius", 3, "Drama", 99);
    	ArrayList<Filma> karteldegiaAr2= new ArrayList<>();       
    	
    	karteldegia.setFilmak(karteldegiaAr2);
    	assertEquals(karteldegiaAr2,karteldegia.getFilmak());
    }

    @Test
    public void testEquals() {
    	ArrayList<Filma> karteldegiaAr2 = new ArrayList<>(); 
        Filma filma = new Filma("La vida de Woot", 3, "komedia", 150);
        karteldegiaAr2.add(filma);
        
        ArrayList<Filma> karteldegiaAr = new ArrayList<>();
        Filma filma2 = new Filma("Regreso a la gloria",1,"Dokumentala",133);
        karteldegiaAr.add(filma2);
        
        
        Karteldegia karteldegia = new Karteldegia(karteldegiaAr);
        
        
        Karteldegia karteldegia2 = new Karteldegia(karteldegiaAr2);

        assertTrue(karteldegia.equals(karteldegia));
        assertFalse(karteldegia.equals(karteldegia2));
    }
    
    @Test
    public void testHashCode() {
       
    }

}
