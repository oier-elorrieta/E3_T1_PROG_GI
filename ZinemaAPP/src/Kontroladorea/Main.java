package Kontroladorea;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Modeloa.*;

public class Main {

	public static void main(String[] args) {
		
		Api api = new Api();
		
		
		ArrayList<Zinema> zinemak = new ArrayList<>();
		
		
		Karteldegia karteldegia = new Karteldegia(api.filmak());
		
		api.Zinemak();
		try {
			while (api.getRs().next()) {
				
				ResultSet rs = api.getRs(); 
				zinemak.add(new Zinema(rs.getString("Ordutegia"),rs.getString("izena"),rs.getInt("id_zinema"),rs.getString("Kokapena")));		
				
			}

		} catch (SQLException e) {
			System.out.println("Errorea datu-basearekin konexioa egiten: " + e.getMessage());
		}	
		
		
		
		
		
		for(Zinema i: zinemak){
			
			i.setAretoak(api.aretoArray(i.getId()));
			
			System.out.println(i);
			api.saioa(i.getId());
			ArrayList<Saioa> saioak = new ArrayList<>();
			try {
			
				while (api.getRs().next()) {
					
					ResultSet rs = api.getRs(); 
					saioak.add(new Saioa(rs.getInt("id_saioa"),i.getAretoak().get(rs.getInt("id_areto")-1),rs.getDate("saioa_data").toLocalDate(),rs.getTime("hasiera_ordua").toLocalTime(),rs.getDouble("prezioa"),karteldegia.getFilmak().get(rs.getInt("id_filma")-1)));		
					
				}

			} catch (SQLException e) {
				System.out.println("Errorea datu-basearekin konexioa egiten: " + e.getMessage());
			}	
			
			i.setSaioak(saioak);
			
		}
		
		
		
	}

}