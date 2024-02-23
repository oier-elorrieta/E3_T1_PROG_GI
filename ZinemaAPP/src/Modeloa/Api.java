package Modeloa;

import java.sql.*;
import Bista.*;
import java.util.ArrayList;

public class Api {
    
	private String url = "jdbc:mysql://localhost:3307/db_zinema1";
	private String erabiltzailea = "root";
    private String pasahitza = "";
    private Connection konexioa = null;
    private String kontsulta;
    private Statement stm;
    private ResultSet rs;
    private String aukeratutakoZinema;
    private ArrayList<Zinema> zinemaO = zinemaBete();
    private ArrayList<Erabiltzaile> erabiltzaileAr = getErabiltzaileakBete();
   
    
    // Eraikitzailea
    public Api() {
    	
    }
    
    
    
	public ArrayList<Zinema> getZinemaO() {
		return zinemaO;
	}


	public void setZinemaO(ArrayList<Zinema> zinemaO) {
		this.zinemaO = zinemaO;
	}


	public String getAukeratutakoZinema() {
		return aukeratutakoZinema;
	}

	public void setAukeratutakoZinema(String aukeratutakoZinema) {
		this.aukeratutakoZinema = aukeratutakoZinema;
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
    
    public ArrayList<Erabiltzaile> getErabiltzaileakBete(){
    	
    	konektatu();
    	ArrayList<Erabiltzaile> erabiltzaileAr = new ArrayList();
    	
    	 /*KONTSULTA HONEKIN ERABILTZAILE OBJEKTUEI BALIOA EMANGO DIEGU*/
        try {
            this.kontsulta = "SELECT e_izena,izena, abizena,pasahitza,nan, jaiotze_data, generoa, id_erabiltzaile, generoa  FROM ERABILTZAILE";
            stm = this.konexioa.createStatement();
            rs = stm.executeQuery(this.kontsulta);
            
        	  
            while (rs.next()) {
                
                erabiltzaileAr.add(new Erabiltzaile(rs.getString("e_izena"),rs.getString("izena"),rs.getString("pasahitza"),rs.getString("abizena"),rs.getDate("jaiotze_data").toLocalDate(),rs.getString("nan"),rs.getString("generoa"),rs.getInt("id_erabiltzaile")  ));  
               
          }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    	return erabiltzaileAr;
    }
    
    public void Zinemak(){
    	
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
    		this.kontsulta = "SELECT id_saioa, prezioa, id_areto,id_filma,saioa_data,hasiera_ordua FROM saioa where id_zinema =" + id_zinema;
			stm = this.konexioa.createStatement();
			rs = stm.executeQuery(this.kontsulta);
	   	 	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
   
    
    
    
    
    
    public ArrayList<Zinema> zinemaBete() {
    
  
	ArrayList<Zinema> zinemak = new ArrayList<>();
	
	Karteldegia karteldegia = new Karteldegia(filmak());
	Zinemak();
	
	try {
		while (getRs().next()) {
			
			ResultSet rs = getRs(); 
			zinemak.add(new Zinema(rs.getString("Ordutegia"),rs.getString("izena"),rs.getInt("id_zinema"),rs.getString("Kokapena")));		
			
		}

	} catch (SQLException e) {
		System.out.println("Errorea datu-basearekin konexioa egiten: " + e.getMessage());
	}	
	
	for(Zinema i: zinemak){
		
		i.setAretoak(aretoArray(i.getId()));
		saioa(i.getId());
		ArrayList<Saioa> saioak = new ArrayList<>();
		try {
						
		while (getRs().next()) {
				
				ResultSet rs = getRs(); 
				saioak.add(new Saioa(rs.getInt("id_saioa"),i.getAretoak().get(rs.getInt("id_areto")-1),rs.getDate("saioa_data").toLocalDate(),rs.getTime("hasiera_ordua").toLocalTime(),rs.getDouble("prezioa"),karteldegia.getFilmak().get(rs.getInt("id_filma")-1)));		
				
			} 

		} catch (SQLException e) {
			System.out.println("Errorea datu-basearekin konexioa egiten: " + e.getMessage());
		}	
		
		i.setSaioak(saioak);
		System.out.println(i);
	}
	
	return zinemak;
	 
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