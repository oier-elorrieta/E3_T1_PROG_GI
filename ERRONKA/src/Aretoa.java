import java.util.Arrays;
import java.util.Objects;

public class Aretoa {
	private String izena;
	private String aretoid;
	private Pelikula[] filmzerrenda;
	private int data;
	private int ordutegia;
	private boolean isbeteta;
	
	
	
	public Aretoa() {
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(filmzerrenda);
		result = prime * result + Objects.hash(aretoid, data, isbeteta, izena, ordutegia);
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
		return Objects.equals(aretoid, other.aretoid) && data == other.data
				&& Arrays.equals(filmzerrenda, other.filmzerrenda) && isbeteta == other.isbeteta
				&& Objects.equals(izena, other.izena) && ordutegia == other.ordutegia;
	}


	public Aretoa(String izena, String aretoid, Pelikula[] filmzerrenda, int data, int ordutegia, boolean isbeteta) {
		this.izena = izena;
		this.aretoid = aretoid;
		this.filmzerrenda = filmzerrenda;
		this.data = data;
		this.ordutegia = ordutegia;
		this.isbeteta = isbeteta;
	}

	
	public String getIzena() {
		return izena;
	}


	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAretoid() {
		return aretoid;
	}


	public void setAretoid(String aretoid) {
		this.aretoid = aretoid;
	}

	
	public Pelikula[] getFilmzerrenda() {
		return filmzerrenda;
	}


	public void setFilmzerrenda(Pelikula[] filmzerrenda) {
		this.filmzerrenda = filmzerrenda;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public int getOrdutegia() {
		return ordutegia;
	}


	public void setOrdutegia(int ordutegia) {
		this.ordutegia = ordutegia;
	}
	

	public boolean isIsbeteta() {
		return isbeteta;
	}


	public void setIsbeteta(boolean isbeteta) {
		this.isbeteta = isbeteta;
	}


	@Override
	public String toString() {
		return "Aretoa [izena=" + izena + ", aretoid=" + aretoid + ", filmzerrenda=" + Arrays.toString(filmzerrenda)
				+ ", data=" + data + ", ordutegia=" + ordutegia + ", isbeteta=" + isbeteta + "]";
	}

}	