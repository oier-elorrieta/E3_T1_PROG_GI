package Modeloa;

import java.sql.*;

public class Api {
	
	
	/*Hemen aurrerago kontsultak egiteko behar ditudan aldagaiak egongo dira,beherago f
	untzioak sortuko ditut kontsultak egiteko eta horrela datu basearekin erlazioa dau
	katen kontsultak emen egongo dira edo hori uste dut */
	
	private String kontsulta;
	
	public void Kon(){
	
	try {
	
		Connection conn = DriverManager.getConnection("");
		Statement sta = conn.createStatement();
		ResultSet res = sta.executeQuery(kontsulta);
		
	
	}catch (SQLException sql) {
		
		System.out.println("Error, ez da konektatu");
	}
	
	
	}
	public Api(String kontsulta) {
		
		this.kontsulta = kontsulta;
	}
	
	
}

