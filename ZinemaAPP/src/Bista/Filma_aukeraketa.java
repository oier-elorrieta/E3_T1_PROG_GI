package Bista;

import java.awt.EventQueue;
import Modeloa.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import Kontroladorea.*;
import java.awt.Font;

public class Filma_aukeraketa extends JFrame {


	private JPanel contentPane;



/**
* Create the frame.
*/
		public Filma_aukeraketa(Api api) {
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(new BorderLayout(0, 0));
			JPanel panel = new JPanel();
			contentPane.add(panel);
			panel.setLayout(new BorderLayout(0, 0));
			
			JLabel lblDataAukeraketa = new JLabel("AukeratuData");
			lblDataAukeraketa.setFont(new Font("Tahoma", Font.PLAIN, 26));
			panel.add(lblDataAukeraketa, BorderLayout.NORTH);
			
	
		}
	}
