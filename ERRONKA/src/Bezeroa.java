
public class Bezeroa {
	private String izena;
	private String abizenak;
	private String sexua;
	private String pasahitza;
	
	public Bezeroa(String izena, String abizenak, String sexua, String pasahitza) {
		this.izena = izena;
		this.abizenak = abizenak;
		this.sexua = sexua;
		this.pasahitza = pasahitza;
	}
	
	public String getIzena() {
		return izena;
	}
	
	
	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	
	public String getAbizenak() {
		return abizenak;
	}
	
	
	public void setAbizenak(String abizenak) {
		this.abizenak = abizenak;
	}
	
	
	public String getSexua() {
		return sexua;
	}
	
	
	public void setSexua(String sexua) {
		this.sexua = sexua;
	}
	
	
	public String getPasahitza() {
		return pasahitza;
	}
	
	
	@Override
	public String toString() {
		return "Bezeroa [izena=" + izena + ", abizenak=" + abizenak + ", sexua=" + sexua + ", pasahitza=" + pasahitza
				+ "]";
	}
	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}
	
}