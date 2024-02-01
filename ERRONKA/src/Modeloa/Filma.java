package Modeloa;

import java.util.Objects;

public class Filma {
	private String izena;
	private int id;
	private String generoa;
	private int iraupena;
	
	
	
	public Filma(String izena, int id, String generoa, int iraupena) {
		super();
		this.izena = izena;
		this.id = id;
		this.generoa = generoa;
		this.iraupena = iraupena;
	}



	@Override
	public String toString() {
		return "Filma [izena=" + izena + ", id=" + id + ", generoa=" + generoa + ", iraupena=" + iraupena + "]";
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



	public String getGeneroa() {
		return generoa;
	}



	public void setGeneroa(String generoa) {
		this.generoa = generoa;
	}



	public int getIraupena() {
		return iraupena;
	}



	public void setIraupena(int iraupena) {
		this.iraupena = iraupena;
	}



	@Override
	public int hashCode() {
		return Objects.hash(generoa, id, iraupena, izena);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filma other = (Filma) obj;
		return Objects.equals(generoa, other.generoa) && id == other.id && iraupena == other.iraupena
				&& Objects.equals(izena, other.izena);
	}
	
	
	
	
	
	
	
}