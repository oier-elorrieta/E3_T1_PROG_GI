package Modeloa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Erosketa {

	private ArrayList<Sarrera> sarrerak;
	private int prezioTotala;
	private Erabiltzaile erabiltzailea;
	private LocalDateTime dataordua;
	private double deskontua;
	
	public Erosketa(ArrayList<Sarrera> sarrerak, int prezioTotala, Erabiltzaile erabiltzailea, LocalDateTime dataordua,
			double deskontua) {
		super();
		this.sarrerak = sarrerak;
		this.prezioTotala = prezioTotala;
		this.erabiltzailea = erabiltzailea;
		this.dataordua = dataordua;
		this.deskontua = deskontua;
	}
	@Override
	public String toString() {
		return "Erosketa [sarrerak=" + sarrerak + ", prezioTotala=" + prezioTotala + ", erabiltzailea=" + erabiltzailea
				+ ", dataordua=" + dataordua + ", deskontua=" + deskontua + "]";
	}
	public ArrayList<Sarrera> getSarrerak() {
		return sarrerak;
	}
	public void setSarrerak(ArrayList<Sarrera> sarrerak) {
		this.sarrerak = sarrerak;
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
		return Objects.hash(dataordua, deskontua, erabiltzailea, prezioTotala, sarrerak);
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
				&& Objects.equals(sarrerak, other.sarrerak);
	}
	
	
	
	}
	
	

	
	
	
	
	

