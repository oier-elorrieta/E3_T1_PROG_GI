package Modeloa;
import java.util.Arrays;
import java.util.Objects;

public class Zinema {
	
	private String ordutegia;
	private Saioa[] saioak;
	private String izena; 
	private int id;
	private String kokapena; 
	private Aretoa[] aretoak;
	
	
	public Zinema(String ordutegia, Saioa[] saioak, String izena, int id, String kokapena, Aretoa[] aretoak) {
	
		this.ordutegia = ordutegia;
		this.saioak = saioak;
		this.izena = izena;
		this.id = id;
		this.kokapena = kokapena;
		this.aretoak = aretoak;
	}


	@Override
	public String toString() {
		return "Zinema [ordutegia=" + ordutegia + ", saioak=" + Arrays.toString(saioak) + ", izena=" + izena + ", id="
				+ id + ", kokapena=" + kokapena + ", aretoak=" + Arrays.toString(aretoak) + "]";
	}


	public String getOrdutegia() {
		return ordutegia;
	}


	public void setOrdutegia(String ordutegia) {
		this.ordutegia = ordutegia;
	}


	public Saioa[] getSaioak() {
		return saioak;
	}


	public void setSaioak(Saioa[] saioak) {
		this.saioak = saioak;
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


	public Aretoa[] getAretoak() {
		return aretoak;
	}


	public void setAretoak(Aretoa[] aretoak) {
		this.aretoak = aretoak;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(aretoak);
		result = prime * result + Arrays.hashCode(saioak);
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
		return Arrays.equals(aretoak, other.aretoak) && id == other.id && Objects.equals(izena, other.izena)
				&& Objects.equals(kokapena, other.kokapena) && Objects.equals(ordutegia, other.ordutegia)
				&& Arrays.equals(saioak, other.saioak);
	}
	
	
	
	
	
}
	
	
