package Bista;

import java.awt.EventQueue;

import Modeloa.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
;public class OngiEtorri extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public OngiEtorri(Api api) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ONGI ETORRI!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(106, 67, 212, 43);
		contentPane.add(lblNewLabel);
		
		JButton OngiEtorriBtn = new JButton("Aurrera Egin");
		OngiEtorriBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
<<<<<<< HEAD
				dispose();
				try {
					Logeatu_Pantalla frame = new Logeatu_Pantalla(api);
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
=======
				Zinema_aukeraketa zinemaBista = new Zinema_aukeraketa(api);
				zinemaBista.setVisible(true);
				dispose(); 
				
>>>>>>> 4021640c4c8f71034bfb86c41b2edd2d86d63b0c
			}
		});
		OngiEtorriBtn.setBounds(143, 168, 132, 23);
		contentPane.add(OngiEtorriBtn);
		
	}
}
