package Modeloa;
import java.time.LocalDate;
import java.util.Objects;

public class Erabiltzaile {
	private String erabiltzaile;
	private String izena;
	private String abizena;
	private String pasahitza;
	private LocalDate jaiotzedata;
	private String nan;
	private String generoa;
	private int id;
	
	
	public Erabiltzaile(String erabiltzaile, String izena, String pasahitza, String abizena, LocalDate jaiotzedata, String nan, String generoa,
			int id) {
		this.erabiltzaile = erabiltzaile;
		this.izena = izena;
		this.pasahitza = pasahitza;
		this.abizena = abizena;
		this.jaiotzedata = jaiotzedata;
		this.nan = nan;
		this.generoa = generoa;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Erabiltzaile [erabiltzaile=" + erabiltzaile + ", izena=" + izena + ", abizena=" + abizena
				+ ", pasahitza=" + pasahitza + ", jaiotzedata=" + jaiotzedata + ", nan=" + nan + ", generoa=" + generoa
				+ ", id=" + id + "]";
	}

	public String getErabiltzaile() {
		return erabiltzaile;
	}

	public void setErabiltzaile(String erabiltzaile) {
		this.erabiltzaile = erabiltzaile;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
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

	public String getgeneroa() {
		return generoa;
	}

	public void setgeneroa(String generoa) {
		this.generoa = generoa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(abizena, erabiltzaile, id, izena, jaiotzedata, nan, pasahitza, generoa);
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
		return Objects.equals(abizena, other.abizena) && Objects.equals(erabiltzaile, other.erabiltzaile)
				&& id == other.id && Objects.equals(izena, other.izena)
				&& Objects.equals(jaiotzedata, other.jaiotzedata) && Objects.equals(nan, other.nan)
				&& Objects.equals(pasahitza, other.pasahitza) && Objects.equals(generoa, other.generoa);
	}

	
	
}
	
	