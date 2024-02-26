package Modeloa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Zinema {
	

	private ArrayList<Saioa> saioak;
	private ArrayList<Aretoa> aretoak;
	private String izena; 
	private int id;
	
	public Zinema(String ordutegia, String izena, int id, String kokapena) {
		this.izena = izena;
		this.id = id;	
	}
	
	public Zinema(){
		
	}

	public Zinema(String ordutegia, ArrayList<Saioa> saioak, ArrayList<Aretoa> aretoak, String izena, int id,
			String kokapena) {
		super();
		
		this.saioak = saioak;
		this.aretoak = aretoak;
		this.izena = izena;
		this.id = id;
		
	}

	@Override
	public String toString() {
		return izena;
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

	

	@Override
	public int hashCode() {
		return Objects.hash(aretoak, id, izena,saioak);
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
				&& Objects.equals(saioak, other.saioak);
	}
	
}
	
	
