package Modeloa;
import java.util.Arrays;
import java.util.Objects;

public class Aretoa {
	private String izena;
	private String id;
	
	
	public Aretoa(String izena, String id) {
		super();
		this.izena = izena;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Aretoa [izena=" + izena + ", id=" + id + "]";
	}


	public String getIzena() {
		return izena;
	}


	public void setIzena(String izena) {
		this.izena = izena;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, izena);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aretoa other = (Aretoa) obj;
		return Objects.equals(id, other.id) && Objects.equals(izena, other.izena);
	}

	

}
	