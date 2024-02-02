import java.util.Objects;

public class Erosketa {
private int id;
private double prezioa;
private String erabiltzaile_izena;
private boolean online;
private String idErabiltzaile;

public Erosketa(int id, double prezioa, String erabiltzaile_izena, boolean online, String idErabiltzaile) {
	super();
	this.id = id;
	this.prezioa = prezioa;
	this.erabiltzaile_izena = erabiltzaile_izena;
	this.online = online;
	this.idErabiltzaile = idErabiltzaile;
}

@Override
public int hashCode() {
	return Objects.hash(erabiltzaile_izena, id, idErabiltzaile, online, prezioa);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Erosketa other = (Erosketa) obj;
	return Objects.equals(erabiltzaile_izena, other.erabiltzaile_izena) && id == other.id
			&& Objects.equals(idErabiltzaile, other.idErabiltzaile) && online == other.online
			&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa);
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getPrezioa() {
	return prezioa;
}

public void setPrezioa(double prezioa) {
	this.prezioa = prezioa;
}

public String getErabiltzaile_izena() {
	return erabiltzaile_izena;
}

public void setErabiltzaile_izena(String erabiltzaile_izena) {
	this.erabiltzaile_izena = erabiltzaile_izena;
}

public boolean isOnline() {
	return online;
}

public void setOnline(boolean online) {
	this.online = online;
}

public String getIdErabiltzaile() {
	return idErabiltzaile;
}

public void setIdErabiltzaile(String idErabiltzaile) {
	this.idErabiltzaile = idErabiltzaile;
}

@Override
public String toString() {
	return "Erosketa [id=" + id + ", prezioa=" + prezioa + ", erabiltzaile_izena=" + erabiltzaile_izena + ", online="
			+ online + ", idErabiltzaile=" + idErabiltzaile + "]";
}




}
