package Testak;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;

import Modeloa.*;


public class ZinemaTest {
  private Modeloa.Aretoa aretoa;
  private Modeloa.Filma filma;
  private Modeloa.Saioa saioa;
  private Modeloa.Zinema zinema;
  private Modeloa.Saioa[] Saioa = new Saioa[1];
  private Modeloa.Aretoa[] Aretoa = new Aretoa[1];
 
  @Before
  public void setup() {
      filma = new Filma("Avatar", 1, "zientzia-fikzioa", 90);
      aretoa = new Aretoa("aretoa1", 1);
      saioa = new Saioa(1, aretoa, LocalDate.now(), LocalTime.of(10, 30), 13.5, filma);
      Saioa[0]=saioa;
      aretoa = new Aretoa("cachao",33);
      Aretoa[0]= aretoa;
      zinema = new Zinema("3", Saioa, "Zinema1", 101, "Kokapena1");
  }
  
  @Test
  public void testToString() {
		
		assertEquals(zinema.toString(),zinema.toString());
		
	}
  
  @Test
  public void testSettersAndGetters() {
    
      zinema.setOrdutegia("2");
      assertEquals("2", zinema.getOrdutegia());
      Saioa newSaioa = new Saioa(2, aretoa, LocalDate.now(), LocalTime.of(15, 30), 15.0, filma);
      zinema.setSaioak(Saioa);
      assertEquals(Saioa, zinema.getSaioak());
      zinema.setIzena("Zinema2");
      assertEquals("Zinema2", zinema.getIzena());
      zinema.setId(102);
      assertEquals(102, zinema.getId());
      zinema.setKokapena("Kokapena2");
      assertEquals("Kokapena2", zinema.getKokapena());
  }
  @Test
  public void testEquals() {
      Zinema zinema1 = zinema;
      Zinema zinema2 = new Zinema("12", Saioa, "Zinema12", 1012, "Kokapena1");
      assertTrue(zinema1.equals(zinema));
  }
  @Test
  public void testNotEquals() {
      Zinema zinema1 = new Zinema("1", Saioa, "Zinema1", 101, "Kokapena1");
      Zinema zinema2 = new Zinema("2", Saioa, "Zinema1", 101, "Kokapena1");
      assertTrue(zinema1.equals(zinema1));
      assertFalse(zinema1.equals(zinema2));
  }
}
