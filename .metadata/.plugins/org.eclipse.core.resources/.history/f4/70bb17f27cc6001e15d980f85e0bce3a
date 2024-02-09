package Testak;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Modeloa.*;



public class KarteldegiaTest {

	Modeloa.Filma[] filmak = {
            new Filma("Avatar", 1, "zientzia-fikzioa", 90),
            new Filma("Matrix", 2, "zientzia-fikzioa", 120)
        };
	 
	Modeloa.Karteldegia karteldegia;
	
	@Before
	public void setUp() {
		
		 karteldegia = new Karteldegia(filmak);

	}
	
	@Test
    public void testToString() {
		
		assertEquals(karteldegia.toString(),karteldegia.toString());
		
	}
	
	
    @Test
    public void testGettersAndSetters() {

        assertEquals(filmak, karteldegia.getFilmak());

        Filma[] newFilmak = {
            new Filma("Inception", 3, "zientzia-fikzioa", 150),
            new Filma("Interstellar", 4, "zientzia-fikzioa", 180)
        };
        
        karteldegia.setFilmak(newFilmak);

        assertEquals(newFilmak, karteldegia.getFilmak());
    }

    @Test
    public void testEquals() {
      
        Karteldegia karteldegia1 = new Karteldegia(filmak);

        Modeloa.Filma[] filmak2 = {
        	new Filma("Inception", 3, "zientzia-fikzioa", 150),
            new Filma("Interstellar", 4, "zientzia-fikzioa", 180)
        };
        Modeloa.Karteldegia karteldegia2 = new Karteldegia(filmak2);

        assertTrue(karteldegia1.equals(karteldegia));
 
        filmak2[1] = new Filma("Inception", 3, "zientzia-fikzioa", 150);

        assertFalse(karteldegia1.equals(karteldegia2));
    }

    @Test
    public void testHashCode() {
       
        Filma[] filmak1 = {
            new Filma("Avatar", 1, "zientzia-fikzioa", 90),
            new Filma("Matrix", 2, "zientzia-fikzioa", 120)
        };
        Karteldegia karteldegia1 = new Karteldegia(filmak1);

        Filma[] filmak2 = {
            new Filma("Avatar", 1, "zientzia-fikzioa", 90),
            new Filma("Matrix", 2, "zientzia-fikzioa", 120)
        };
        Karteldegia karteldegia2 = new Karteldegia(filmak2);

        assertEquals(karteldegia1.hashCode(), karteldegia2.hashCode());
    }
}
