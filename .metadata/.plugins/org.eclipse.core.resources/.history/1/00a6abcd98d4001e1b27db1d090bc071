package Testak;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import Modeloa.*;



public class ApiTest {
	
    private Connection konexioa = null;
    Api api;
    
	
	@Before
	public void before() {
		api =new Api();
		
		
	}
	
	@Test
	public void zinemakTest() throws SQLException{
		
		ArrayList<Filma> karteldegiaAr= api.filmak();;
	    Karteldegia karteldegia = new Karteldegia(karteldegiaAr);
		api.Zinemak();
		assertEquals(api.getRs(),api.getRs());
		api.saioa(1);
		assertEquals(api.getRs(),api.getRs());
		assertEquals(karteldegiaAr,karteldegia.getFilmak());
		
		
	    
	}
}                                                          
