package Bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Zinemak extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zinemak frame = new Zinemak();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Zinemak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ZubiarteBtn = new JButton("ZUBIARTE");
		ZubiarteBtn.setBounds(10, 161, 89, 23);
		contentPane.add(ZubiarteBtn);
		
		JButton btnNewButton_1 = new JButton("MAX-OCIO");
		btnNewButton_1.setBounds(109, 161, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("GOLEM");
		btnNewButton_2.setBounds(219, 161, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("YELMO");
		btnNewButton_3.setBounds(318, 161, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("AUKERATU NAHI DUZUN FILMA");
		lblNewLabel.setBounds(123, 33, 151, 14);
		contentPane.add(lblNewLabel);
	}
}
