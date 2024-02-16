package Modeloa;

import java.sql.*;
import java.util.ArrayList;

public class Api {
    
	private String url = "jdbc:mysql://localhost:3307/db_zinema1";
	private String erabiltzailea = "root";
    private String pasahitza = "";
    private Connection konexioa = null;
    private String kontsulta;
    private Statement stm;
    private ResultSet rs;
    
    
    // Eraikitzailea
    public Api() {
    }
    
    
    
    public ResultSet getRs() {
		return rs;
	}



	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	


	// Datu-basearekin konexioa egiteko metodoa
    public Connection konektatu() {
        
    	try {
    		
            // Konexioa sortu, oraindik ez badago
            if (konexioa == null || konexioa.isClosed()) {
                
                this.konexioa = DriverManager.getConnection(this.url, this.erabiltzailea, this.pasahitza);
                System.out.println("Konektatuta!!!");
            }
        } catch (SQLException e) {
            System.out.println("Errorea datu-basearekin konexioa egiten: " + e.getMessage());
        }
    	return konexioa;
    }
    
    public void  Zinemak(){
    	
    	konektatu();
    	
    	try {
    		this.kontsulta = "SELECT ordutegia,Kokapena,izena,id_zinema FROM zinema";
			stm = this.konexioa.createStatement();
			rs = stm.executeQuery(this.kontsulta);
	   	 	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public ArrayList<Aretoa> aretoArray(int id) {
        
    	konektatu();
        ArrayList<Aretoa> aretoArray = new ArrayList<>();
       
        
        /*KONTSULTA HONEKIN ARETO OBJEKTUEI BALIOA EMANGO DIEGU*/
        try {
            this.kontsulta = "SELECT izena,id_areto FROM areto WHERE id_zinema = " + id;
            stm = this.konexioa.createStatement();
            rs = stm.executeQuery(this.kontsulta);
            
        	  
            while (rs.next()) {
                
                aretoArray.add(new Aretoa(rs.getString("izena"),rs.getInt("id_areto")));  
               
          }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return aretoArray;
    }
    
    public ArrayList<Filma>  filmak() {
    	
    	konektatu();
    	ArrayList<Filma> filmak= new ArrayList<>();
    	
    	/*KONTSULTA HONEKIN FILMA OBJEKTUEI BALIOA EMANGO DIEGU*/
        try {
            this.kontsulta = "SELECT izena, id_filma, generoa, iraupena FROM filma";
            stm = this.konexioa.createStatement();
            rs = stm.executeQuery(this.kontsulta);
            
        	  
            while (rs.next()) {
                
                filmak.add(new Filma(rs.getString("izena"),rs.getInt("id_filma"),rs.getString("generoa"),rs.getInt("iraupena")));  
               
          }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    	
    	return filmak;
    }
    
    
    public void saioa(int id_zinema){
    	konektatu();
    	
    	try {
    		this.kontsulta = "SELECT id_saioa, prezioa, id_areto,id_filma,saioa_data,hasiera_ordua FROM saioa where id_zinema";
			stm = this.konexioa.createStatement();
			rs = stm.executeQuery(this.kontsulta);
	   	 	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
   
    
    // Saio-hasiera egiaztatzeko metodoa
    public boolean isLoginOk() {
    	
        boolean loginOk = false;
        konektatu(); // Konexioa egiaztatzeko
        
        try {
            // Erabiltzailea eta pasahitza datu-basean dauden egiaztatu
        	
        	 this.kontsulta = "SELECT * FROM erabiltzaile WHERE izena= 'Andoni' AND pasahitza = 'p123'";
        	 stm = this.konexioa.createStatement();
        	 rs = stm.executeQuery(this.kontsulta);
        	 
            // Emaitza bat aurkitzen bada, saioa hasita da
            if (rs.next()) {
                loginOk = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Errorea saio-hasierako egiaztapena egiten: " + e.getMessage());
        }
        
        return loginOk;
    }
    
    
    
    // Beste metodoak...
    
    // Getter & Setter
    public String getErabiltzailea() {
        return erabiltzailea;
    }
    public void setErabiltzailea(String erabiltzailea) {
        this.erabiltzailea = erabiltzailea;
    }
    
    public String getPasahitza() {
        return pasahitza;
    }
    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }
}