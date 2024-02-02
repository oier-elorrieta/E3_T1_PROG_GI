package Modeloa;
import java.time.LocalDate;
import java.util.Objects;

public class Erabiltzaile {
	private String izena;
	private String pasahitza;
	private String abizena;
	private LocalDate jaiotzedata;
	private String nan;
	private String sexua;
	private int id;
	
	
	public Erabiltzaile(String izena, String pasahitza, String abizena, LocalDate jaiotzedata, String nan, String sexua,
			int id) {
	
		this.izena = izena;
		this.pasahitza = pasahitza;
		this.abizena = abizena;
		this.jaiotzedata = jaiotzedata;
		this.nan = nan;
		this.sexua = sexua;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Erabiltzaile [izena=" + izena + ", pasahitza=" + pasahitza + ", abizena=" + abizena + ", jaiotzedata="
				+ jaiotzedata + ", nan=" + nan + ", sexua=" + sexua + ", id=" + id + "]";
	}


	public String getIzena() {
		return izena;
	}


	public void setIzena(String izena) {
		this.izena = izena;
	}


	public String getPasahitza() {
		return pasahitza;
	}


	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}


	public String getAbizena() {
		return abizena;
	}


	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}


	public LocalDate getJaiotzedata() {
		return jaiotzedata;
	}


	public void setJaiotzedata(LocalDate jaiotzedata) {
		this.jaiotzedata = jaiotzedata;
	}


	public String getNan() {
		return nan;
	}


	public void setNan(String nan) {
		this.nan = nan;
	}


	public String getSexua() {
		return sexua;
	}


	public void setSexua(String sexua) {
		this.sexua = sexua;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(abizena, id, izena, jaiotzedata, nan, pasahitza, sexua);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Erabiltzaile other = (Erabiltzaile) obj;
		return Objects.equals(abizena, other.abizena) && id == other.id && Objects.equals(izena, other.izena)
				&& Objects.equals(jaiotzedata, other.jaiotzedata) && Objects.equals(nan, other.nan)
				&& Objects.equals(pasahitza, other.pasahitza) && Objects.equals(sexua, other.sexua);
	}
	
	
	
	
	
}
	
	