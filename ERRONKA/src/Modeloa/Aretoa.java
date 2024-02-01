package Modeloa;
import java.util.Arrays;
import java.util.Objects;

public class Aretoa {
	private String izena;
	private String id;
	private Saioa[] saiozerrenda;
	
	
	public Aretoa(String izena, String id, Saioa[] saiozerrenda) {
		super();
		this.izena = izena;
		this.id = id;
		this.saiozerrenda = saiozerrenda;
	}


	@Override
	public String toString() {
		return "Aretoa [izena=" + izena + ", id=" + id + ", saiozerrenda=" + Arrays.toString(saiozerrenda) + "]";
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


	public Saioa[] getSaiozerrenda() {
		return saiozerrenda;
	}


	public void setSaiozerrenda(Saioa[] saiozerrenda) {
		this.saiozerrenda = saiozerrenda;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(saiozerrenda);
		result = prime * result + Objects.hash(id, izena);
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
		Aretoa other = (Aretoa) obj;
		return Objects.equals(id, other.id) && Objects.equals(izena, other.izena)
				&& Arrays.equals(saiozerrenda, other.saiozerrenda);
	}
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	