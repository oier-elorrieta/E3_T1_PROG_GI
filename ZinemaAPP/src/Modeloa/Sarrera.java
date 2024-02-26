package Modeloa;
import java.time.LocalDateTime;
import java.util.Objects;

public class Sarrera {
	
	
	private Saioa saioa;
	private String zinema;
	private int kantitatea;
	
	 
	public Sarrera(Saioa saioa, String zinema, int kantitatea) {
		
		this.saioa = saioa;
		this.zinema = zinema;
		this.kantitatea = kantitatea;
	}
	
	
	@Override
	public String toString() {
		return "Sarrera [saioa=" + saioa + ", zinema=" + zinema + ", kantitatea=" + kantitatea + "]";
	}
	public Saioa getSaioa() {
		return saioa;
	}
	public void setSaioa(Saioa saioa) {
		this.saioa = saioa;
	}
	public String getZinema() {
		return zinema;
	}
	public void setZinema(String zinema) {
		this.zinema = zinema;
	}
	public int getKantitatea() {
		return kantitatea;
	}
	public void setKantitatea(int kantitatea) {
		this.kantitatea = kantitatea;
	}
	@Override
	public int hashCode() {
		return Objects.hash(kantitatea, saioa, zinema);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sarrera other = (Sarrera) obj;
		return kantitatea == other.kantitatea && Objects.equals(saioa, other.saioa)
				&& Objects.equals(zinema, other.zinema);
	}

	
	
	
	
}
