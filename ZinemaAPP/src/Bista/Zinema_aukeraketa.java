package Bista;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import Modeloa.*;
import Kontroladorea.*;



public class Zinema_aukeraketa extends JFrame{
	
	private JPanel Panel1;
	private JPanel Panel2;
	private JPanel Panel3;
	private JButton btnPa;
	private JButton btnPanela;
	private JButton btnPanela_1;
	private JTextField textIzena;
	

	/**
	 * Create the frame.
	 */
	public Zinema_aukeraketa(Api api) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		
		JPanel dataPnl = new JPanel();
		dataPnl.setBounds(0, 0, 434, 261);
		getContentPane().add(dataPnl);
		hasieratuFrame();
		
		
		
		
		
	}
	
	public void hasieratuFrame() {
		
		
		
		
		
	
	}
	
	public void hasieratuZinemaPnl() {
		JPanel zinemaPnl = new JPanel();
		zinemaPnl.setBounds(0, 0, 434, 261);
		getContentPane().add(zinemaPnl);
		
	}
	
	public void hasieratuFilmaPnl() {
		JPanel filmaPnl = new JPanel();
		filmaPnl.setBounds(0, 0, 434, 261);
		getContentPane().add(filmaPnl);
	}
	
	public void hasieratuDataPnl() {
		JPanel filmaPnl = new JPanel();
		filmaPnl.setBounds(0, 0, 434, 261);
		getContentPane().add(filmaPnl);
	}
	}
	
