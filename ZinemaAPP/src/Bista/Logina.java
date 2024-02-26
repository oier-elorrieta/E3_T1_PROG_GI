package Bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modeloa.Api;
import Modeloa.Erabiltzaile;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JPasswordField;

public class Logina extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textErabiltzailea;
	private JPasswordField pswPasahitza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Logina(Api api) {
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLog_in = new JLabel("Log-in");
		lblLog_in.setBounds(5, 5, 424, 33);
		lblLog_in.setHorizontalAlignment(SwingConstants.CENTER);
		lblLog_in.setFont(new Font("Tahoma", Font.BOLD, 27));
		contentPane.add(lblLog_in);
		
		JButton btnLogeatu = new JButton("Log-in");
		btnLogeatu.setBounds(5, 233, 424, 23);
		btnLogeatu.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnLogeatu);
		
		JLabel lblErabiltzailea = new JLabel("Erabiltzailea:");
		lblErabiltzailea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblErabiltzailea.setBounds(40, 95, 106, 23);
		contentPane.add(lblErabiltzailea);
		
		JLabel lblPasahitza = new JLabel("Pasahitza:");
		lblPasahitza.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPasahitza.setBounds(40, 132, 106, 23);
		contentPane.add(lblPasahitza);
		
		textErabiltzailea = new JTextField();
		textErabiltzailea.setBounds(156, 98, 163, 20);
		contentPane.add(textErabiltzailea);
		textErabiltzailea.setColumns(10);
		
		pswPasahitza = new JPasswordField();
		pswPasahitza.setBounds(156, 135, 163, 20);
		contentPane.add(pswPasahitza);
		
		btnLogeatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        String erabiltzailea =  textErabiltzailea.getText();
				String pasahitza = pswPasahitza.getText();
					System.out.println("Erabiltzailea: " + erabiltzailea);
					System.out.println("Pasahitza: " + pasahitza);
					
					if(api.isLoginOk(erabiltzailea, pasahitza)==true) {
						dispose();
						Zinema_aukeraketa zinemaBista = new Zinema_aukeraketa(api);
						zinemaBista.setVisible(true);
					}else {
						textErabiltzailea.setText("");
						pswPasahitza.setText("");
						JOptionPane.showMessageDialog(Logina.this, "Zure kredentzialak ez dira zuzenak.\nMesedez berriro saiatu.", "Kontuz!", JOptionPane.WARNING_MESSAGE);
					}
				
			}
		});
	}
}


