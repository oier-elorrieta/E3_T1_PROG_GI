package Modeloa;
import java.time.LocalDateTime;
import java.util.Objects;

public class Sarrera {
	private  int id;
	private LocalDateTime data_ordua;
	private Saioa saioa;

	
	
	public Sarrera(int id, LocalDateTime data_ordua, Saioa saioa) {
		
		this.id = id;
		this.data_ordua = data_ordua;
		this.saioa = saioa;
		
	}

	@Override
	public String toString() {
		return "Sarrera [id=" + id + ", data_ordua=" + data_ordua + ", saioa=" + saioa + "]";
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDateTime getData_ordua() {
		return data_ordua;
	}


	public void setData_ordua(LocalDateTime data_ordua) {
		this.data_ordua = data_ordua;
	}


	public Saioa getSaioa() {
		return saioa;
	}


	public void setSaioa(Saioa saioa) {
		this.saioa = saioa;
	}


	@Override
	public int hashCode() {
		return Objects.hash(data_ordua, id, saioa);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sarrera other = (Sarrera) obj;
		return Objects.equals(data_ordua, other.data_ordua) && id == other.id && Objects.equals(saioa, other.saioa);
	}


	




	
	
	
	
	
	
}
