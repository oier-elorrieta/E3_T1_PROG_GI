package Modeloa;

import java.util.Arrays;

public class Karteldegia {

	Filma[] fimzerrenda;

	public Karteldegia(Filma[] fimzerrenda) {
		super();
		this.fimzerrenda = fimzerrenda;
	}

	@Override
	public String toString() {
		return "Karteldegia [fimzerrenda=" + Arrays.toString(fimzerrenda) + "]";
	}

	public Filma[] getFimzerrenda() {
		return fimzerrenda;
	}

	public void setFimzerrenda(Filma[] fimzerrenda) {
		this.fimzerrenda = fimzerrenda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(fimzerrenda);
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
		Karteldegia other = (Karteldegia) obj;
		return Arrays.equals(fimzerrenda, other.fimzerrenda);
	}
	
	
}
