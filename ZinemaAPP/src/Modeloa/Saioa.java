package Modeloa;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Saioa {

	private int id;
	private Aretoa aretoa;
	private LocalDate data;
	private LocalTime h_ordua;
	private double prezioa;
	private Filma filma;
	
	public Saioa(int id, Aretoa aretoa, LocalDate data, LocalTime h_ordua, double prezioa, Filma filma) {
		
		this.id = id;
		this.aretoa = aretoa;
		this.data = data;
		this.h_ordua = h_ordua;
		this.prezioa = prezioa;
		this.filma = filma;
	}

	@Override
	public String toString() {
		return "Saioa [id=" + id + ", aretoa=" + aretoa + ", data=" + data + ", h_ordua=" + h_ordua + ", prezioa="
				+ prezioa + ", filma=" + filma + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aretoa getAretoa() {
		return aretoa;
	}

	public void setAretoa(Aretoa aretoa) {
		this.aretoa = aretoa;
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

	public Filma getFilma() {
		return filma;

	}

	public void setFilma(Filma filma) {
		this.filma = filma;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aretoa, data, filma, h_ordua, id, prezioa);
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
		return Objects.equals(aretoa, other.aretoa) && Objects.equals(data, other.data)
				&& Objects.equals(filma, other.filma) && Objects.equals(h_ordua, other.h_ordua) && id == other.id
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa);
	}
	
	
	
}