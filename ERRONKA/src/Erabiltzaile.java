import java.util.Objects;

public class Erabiltzaile{
	private String id;
	private String erabiltzailea;
	private String abizenak;
	private String pasahitza;
	private String nan;
	private String jaiotzedata;
	private String sexua;
	
	public Erabiltzaile(String id, String erabiltzailea, String abizenak, String pasahitza, String nan,
			String jaiotzedata, String sexua) {
		super();
		this.id = id;
		this.erabiltzailea = erabiltzailea;
		this.abizenak = abizenak;
		this.pasahitza = pasahitza;
		this.nan = nan;
		this.jaiotzedata = jaiotzedata;
		this.sexua = sexua;
	}

	@Override
	public int hashCode() {
		return Objects.hash(abizenak, erabiltzailea, id, jaiotzedata, nan, pasahitza, sexua);
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
		return Objects.equals(abizenak, other.abizenak) && Objects.equals(erabiltzailea, other.erabiltzailea)
				&& Objects.equals(id, other.id) && Objects.equals(jaiotzedata, other.jaiotzedata)
				&& Objects.equals(nan, other.nan) && Objects.equals(pasahitza, other.pasahitza)
				&& Objects.equals(sexua, other.sexua);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getErabiltzailea() {
		return erabiltzailea;
	}

	public void setErabiltzailea(String erabiltzailea) {
		this.erabiltzailea = erabiltzailea;
	}

	public String getAbizenak() {
		return abizenak;
	}

	public void setAbizenak(String abizenak) {
		this.abizenak = abizenak;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public String getJaiotzedata() {
		return jaiotzedata;
	}

	public void setJaiotzedata(String jaiotzedata) {
		this.jaiotzedata = jaiotzedata;
	}

	public String getSexua() {
		return sexua;
	}

	public void setSexua(String sexua) {
		this.sexua = sexua;
	}

	@Override
	public String toString() {
		return "Erabiltzaile [id=" + id + ", erabiltzailea=" + erabiltzailea + ", abizenak=" + abizenak + ", pasahitza="
				+ pasahitza + ", nan=" + nan + ", jaiotzedata=" + jaiotzedata + ", sexua=" + sexua + "]";
	}
	
	
	
	
	}