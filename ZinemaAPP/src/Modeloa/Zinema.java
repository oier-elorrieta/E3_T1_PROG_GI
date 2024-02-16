package Modeloa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Zinema {
	
	private	String ordutegia;
	private ArrayList<Saioa> saioak;
	private ArrayList<Aretoa> aretoak;
	private String izena; 
	private int id;
	private String kokapena;
	

	
	public Zinema(String ordutegia, String izena, int id, String kokapena) {
		this.ordutegia = ordutegia;
		this.izena = izena;
		this.id = id;
		this.kokapena = kokapena;
		
	}
	
	public Zinema(){
		
	}

	public Zinema(String ordutegia, ArrayList<Saioa> saioak, ArrayList<Aretoa> aretoak, String izena, int id,
			String kokapena) {
		super();
		this.ordutegia = ordutegia;
		this.saioak = saioak;
		this.aretoak = aretoak;
		this.izena = izena;
		this.id = id;
		this.kokapena = kokapena;
	}

	@Override
	public String toString() {
		return "Zinema [ordutegia=" + ordutegia + ", saioak=" + saioak + ", aretoak=" + aretoak + ", izena=" + izena
				+ ", id=" + id + ", kokapena=" + kokapena + "]";
	}

	public String getOrdutegia() {
		return ordutegia;
	}

	public void setOrdutegia(String ordutegia) {
		this.ordutegia = ordutegia;
	}

	public ArrayList<Saioa> getSaioak() {
		return saioak;
	}

	public void setSaioak(ArrayList<Saioa> saioak) {
		this.saioak = saioak;
	}

	public ArrayList<Aretoa> getAretoak() {
		return aretoak;
	}

	public void setAretoak(ArrayList<Aretoa> aretoak) {
		this.aretoak = aretoak;
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
		return Objects.hash(aretoak, id, izena, kokapena, ordutegia, saioak);
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
		return Objects.equals(aretoak, other.aretoak) && id == other.id && Objects.equals(izena, other.izena)
				&& Objects.equals(kokapena, other.kokapena) && Objects.equals(ordutegia, other.ordutegia)
				&& Objects.equals(saioak, other.saioak);
	}
	
}
	
	
