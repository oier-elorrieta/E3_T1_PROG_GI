package Modeloa;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Saioa {

	private int id;
	private int aretoid;
	private int zinemaid;
	private LocalDate data;
	private LocalTime h_ordua;
	private double prezioa;
	
	
	public Saioa(int id, LocalDate data, LocalTime h_ordua, double prezioa,int aretoid,int zinemaid) {
		super();
		this.id = id;
		this.data = data;
		this.h_ordua = h_ordua;
		this.prezioa = prezioa;
		this.aretoid = aretoid;
		this.zinemaid = zinemaid;
	}


	

	@Override
	public String toString() {
		return "Saioa [id=" + id + ", aretoid=" + aretoid + ", zinemaid=" + zinemaid + ", data=" + data + ", h_ordua="
				+ h_ordua + ", prezioa=" + prezioa + "]";
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public LocalTime getH_ordua() {
		return h_ordua;
	}


	public void setH_ordua(LocalTime h_ordua) {
		this.h_ordua = h_ordua;
	}


	public double getPrezioa() {
		return prezioa;
	}


	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}
	
	
	


	public int getAretoid() {
		return aretoid;
	}


	public void setAretoid(int aretoid) {
		this.aretoid = aretoid;
	}
	
	


	public int getZinemaid() {
		return zinemaid;
	}




	public void setZinemaid(int zinemaid) {
		this.zinemaid = zinemaid;
	}




	@Override
	public int hashCode() {
		return Objects.hash(aretoid, data, h_ordua, id, prezioa, zinemaid);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Saioa other = (Saioa) obj;
		return aretoid == other.aretoid && Objects.equals(data, other.data) && Objects.equals(h_ordua, other.h_ordua)
				&& id == other.id && Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa)
				&& zinemaid == other.zinemaid;
	}


	


	
	
	
	
}
