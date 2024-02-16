package Modeloa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Karteldegia {
	
	private ArrayList<Filma> filmak= new ArrayList<>();

	public Karteldegia(ArrayList<Filma> filmak) {
		super();
		this.filmak = filmak;
	}

	@Override
	public String toString() {
		return "Karteldegia [filmak=" + filmak + "]";
	}

	public ArrayList<Filma> getFilmak() {
		return filmak;
	}

	public void setFilmak(ArrayList<Filma> filmak) {
		this.filmak = filmak;
	}

	@Override
	public int hashCode() {
		return Objects.hash(filmak);
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
		return Objects.equals(filmak, other.filmak);
	}
	
	
	
}
