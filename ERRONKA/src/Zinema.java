import java.util.Arrays;

public class Zinema {
	
	private int ordutegia;
	private Aretoa[] aretoa;
	private String izena; 
	private int id;
	private String kokapena;
	public Zinema(int ordutegia, Aretoa[] aretoa, String izena, int id, String kokapena) {
		super();
		this.ordutegia = ordutegia;
		this.aretoa = aretoa;
		this.izena = izena;
		this.id = id;
		this.kokapena = kokapena;
	}
	public int getOrdutegia() {
		return ordutegia;
	}
	public void setOrdutegia(int ordutegia) {
		this.ordutegia = ordutegia;
	}
	public Aretoa[] getAretoa() {
		return aretoa;
	}
	public void setAretoa(Aretoa[] aretoa) {
		this.aretoa = aretoa;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKokapena() {
		return kokapena;
	}
	public void setKokapena(String kokapena) {
		this.kokapena = kokapena;
	}
	@Override
	public String toString() {
		return "Zinema [ordutegia=" + ordutegia + ", aretoa=" + Arrays.toString(aretoa) + ", izena=" + izena + ", id="
				+ id + ", kokapena=" + kokapena + "]";
	}
	
	
}
	
	