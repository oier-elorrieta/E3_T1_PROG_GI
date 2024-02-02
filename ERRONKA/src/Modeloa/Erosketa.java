package Modeloa;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class Erosketa {

	private Sarrera[] sarrera;
	private int prezioTotala;
	private Erabiltzaile erabiltzailea;
	private LocalDateTime dataordua;
	private double deskontua;
	
	
	public Erosketa(Sarrera[] sarrera, int prezioTotala, Erabiltzaile erabiltzailea, LocalDateTime dataordua,
			double deskontua) {
		super();
		this.sarrera = sarrera;
		this.prezioTotala = prezioTotala;
		this.erabiltzailea = erabiltzailea;
		this.dataordua = dataordua;
		this.deskontua = deskontua;
	}


	@Override
	public String toString() {
		return "Erosketa [sarrera=" + Arrays.toString(sarrera) + ", prezioTotala=" + prezioTotala + ", erabiltzailea="
				+ erabiltzailea + ", dataordua=" + dataordua + ", deskontua=" + deskontua + "]";
	}


	public Sarrera[] getSarrera() {
		return sarrera;
	}


	public void setSarrera(Sarrera[] sarrera) {
		this.sarrera = sarrera;
	}


	public int getPrezioTotala() {
		return prezioTotala;
	}


	public void setPrezioTotala(int prezioTotala) {
		this.prezioTotala = prezioTotala;
	}


	public Erabiltzaile getErabiltzailea() {
		return erabiltzailea;
	}


	public void setErabiltzailea(Erabiltzaile erabiltzailea) {
		this.erabiltzailea = erabiltzailea;
	}


	public LocalDateTime getDataordua() {
		return dataordua;
	}


	public void setDataordua(LocalDateTime dataordua) {
		this.dataordua = dataordua;
	}


	public double getDeskontua() {
		return deskontua;
	}


	public void setDeskontua(double deskontua) {
		this.deskontua = deskontua;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(sarrera);
		result = prime * result + Objects.hash(dataordua, deskontua, erabiltzailea, prezioTotala);
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
		Erosketa other = (Erosketa) obj;
		return Objects.equals(dataordua, other.dataordua)
				&& Double.doubleToLongBits(deskontua) == Double.doubleToLongBits(other.deskontua)
				&& Objects.equals(erabiltzailea, other.erabiltzailea) && prezioTotala == other.prezioTotala
				&& Arrays.equals(sarrera, other.sarrera);
	}
	
	

	
	
	
	
	
}