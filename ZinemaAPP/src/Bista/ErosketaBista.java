package Bista;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Modeloa.Sarrera;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import Modeloa.*;


public class ErosketaBista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblTotala;
	
	

	
	public ErosketaBista(ArrayList<Sarrera> sarrerak,Erabiltzaile erabiltzailea) {
		
		System.out.println(sarrerak);
		System.out.println(erabiltzailea);
		
		
		DefaultTableModel model = new DefaultTableModel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblErosketa = new JLabel("EROSKETA");
		lblErosketa.setHorizontalAlignment(SwingConstants.CENTER);
		lblErosketa.setFont(new Font("Tahoma", Font.PLAIN, 36));
		contentPane.add(lblErosketa, BorderLayout.NORTH);
		
		lblTotala = new JLabel("");
		contentPane.add(lblTotala, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		model.addColumn("Zinema");
		model.addColumn("Filma");
		model.addColumn("hasiera ordua");
		model.addColumn("Aretoa");
		model.addColumn("Prezioa");
		model.addColumn("Kantitatea");
		
		int kant = 0;
		double deskontua = 1;
		double totala = 0;
		
		
		for(Sarrera i:sarrerak) {
			
			model.addRow(new Object[]{i.getZinema(), i.getSaioa().getFilma().getIzena(), i.getSaioa().getH_ordua(), i.getSaioa().getAretoa().getIzena(), i.getSaioa().getPrezioa(),i.getKantitatea()});
			
			kant += i.getKantitatea();
			totala += i.getSaioa().getPrezioa()*i.getKantitatea();
		}
		
		if (kant == 2) {
			deskontua = 0.80;
		}else if(kant >=3) {
			deskontua = 0.70;
		}
		
		totala = totala*deskontua;
		
		
		lblTotala.setText("TOTALA: " + totala);
		
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		
		
		
		
		
		
		
		
		
	}
}
