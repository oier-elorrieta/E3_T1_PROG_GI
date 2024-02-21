package Kontroladorea;

import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Modeloa.*;
import  Bista.*;


public  class Kontroladorea {


	public static  void main(String[] args) {
		
		Api api = new Api();
		OngiEtorri ongiBista = new OngiEtorri(api);
		ongiBista.setVisible(true);
		
	}		
}