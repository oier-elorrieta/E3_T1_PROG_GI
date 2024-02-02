package Modeloa;
import java.util.Arrays;
import java.util.Objects;

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



	@Override
	public String toString() {
		return "Zinema [ordutegia=" + ordutegia + ", aretoa=" + Arrays.toString(aretoa) + ", izena=" + izena + ", id="
				+ id + ", kokapena=" + kokapena + "]";
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(aretoa);
		result = prime * result + Objects.hash(id, izena, kokapena, ordutegia);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zinema other = (Zinema) obj;
		return Arrays.equals(aretoa, other.aretoa) && id == other.id && Objects.equals(izena, other.izena)
				&& Objects.equals(kokapena, other.kokapena) && ordutegia == other.ordutegia;
	}
	
	
	
	
	
}
	