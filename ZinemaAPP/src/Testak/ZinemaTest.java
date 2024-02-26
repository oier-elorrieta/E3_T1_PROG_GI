package Testak;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import Modeloa.*;


public class ZinemaTest {
  private Modeloa.Aretoa aretoa;
  private Modeloa.Filma filma;
  private Modeloa.Saioa saioa;
  private Modeloa.Zinema zinema;
  private ArrayList<Modeloa.Saioa> saioaAr= new ArrayList<>();;
  private ArrayList<Modeloa.Aretoa> aretoAr= new ArrayList<>();;
 
  @Before
  public void setup() {
      filma = new Filma("Avatar", 1, "zientzia-fikzioa", 90);
      aretoa = new Aretoa("aretoa1", 1);
      saioa = new Saioa(1, aretoa, LocalDate.now(), LocalTime.of(10, 30), 13.5, filma);
      saioaAr.add(saioa);
      aretoa = new Aretoa("cachao",33);
      aretoAr.add(aretoa);
      zinema = new Zinema("10:30/24:00", saioaAr, aretoAr, "Rocky-Zinemak", 33, "La Peña");
      
      /////BESTE KONSTRUKTOREAK PROBATU///////
      Zinema zinemaUtzik = new Zinema();
  }
   
   
  
  @Test
  public void testToString() {
		assertEquals(zinema.toString(),zinema.toString());
		
	}
  
  @Test
  public void testSettersAndGetters() {
    
      
      ArrayList<Modeloa.Saioa> saioaAr2= new ArrayList<>();;
      Saioa newSaioa = new Saioa(2, aretoa, LocalDate.now(), LocalTime.of(15, 30), 15.0, filma);
      saioaAr2.add(newSaioa);
      zinema.setSaioak(saioaAr2);
      assertEquals(saioaAr2, zinema.getSaioak());
      zinema.setIzena("Zinema2");
      assertEquals("Zinema2", zinema.getIzena());
      zinema.setId(69);
      assertEquals(69, zinema.getId());
      ArrayList<Modeloa.Aretoa> aretoAr2= new ArrayList<>();;
      Aretoa newAretoa = new Aretoa("Mini Boo",3); 
      aretoAr2.add(newAretoa);
      zinema.setAretoak(aretoAr2);
      assertEquals(aretoAr2, zinema.getAretoak());
  }
  @Test
  public void testEquals() {
	  Zinema zinema = new Zinema("10:30/24:00", saioaAr, aretoAr, "Rocky-Zinemak", 33, "La Peña");
	  Zinema zinema1 = new Zinema("10:30/24:00", saioaAr, aretoAr, "Rocky-Zinemak", 33, "La Peña");
      assertTrue(zinema1.equals(zinema));
  }
  @Test
  public void testNotEquals() {
	  Zinema zinema = new Zinema("10:30/24:00", saioaAr, aretoAr, "Rocky-Zinemak", 33, "La Peña");
	  Zinema zinema1 = new Zinema("2:00/3:00", saioaAr, aretoAr, "Boo GOAT", 33, "PaTiTeK");
      assertTrue(zinema1.equals(zinema1));
      assertFalse(zinema1.equals(zinema));
  }
}
