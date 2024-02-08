package Testak;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Modeloa.*;


public class filmaTest {
	
	private Modeloa.Filma film;
	
	@Before
	public void setUp() {
	     film = new Filma("Avatar", 1, "zientzia-fikzioa", 90);
	}
	
	@Test
    public void testToString() {
		
		assertEquals(film.toString(),film.toString());
		
	}
	
	
    @Test
    public void testGettersAndSetters() {

        film.setIzena("Matrix");
        assertEquals("Matrix", film.getIzena());
        film.setId(2);
        assertEquals(2, film.getId());
        film.setGeneroa("zientzia-fikzioa-fantasiazko");
        assertEquals("zientzia-fikzioa-fantasiazko", film.getGeneroa());
        film.setIraupena(120);
        assertEquals(120, film.getIraupena());
    }

    @Test
    public void testEquals() {
        Modeloa.Filma film1 = new Filma("Avatar", 1, "zientzia-fikzioa", 90);
        Modeloa.Filma film2 = new Filma("Avatar", 1, "zientzia-fikzioa", 90);

        assertTrue(film1.equals(film2));

        film2.setIzena("Matrix");

        assertFalse(film1.equals(film2));
    }

    @Test
    public void testHashCode() {
       
        Modeloa.Filma film1 = new Filma("Avatar", 1, "zientzia-fikzioa", 90);
        Modeloa.Filma film2 = new Filma("Avatar", 1, "zientzia-fikzioa", 90);

        assertEquals(film1.hashCode(), film2.hashCode());

        film2.setIzena("Matrix");

        assertFalse(film1.hashCode() == film2.hashCode());
    }
}
