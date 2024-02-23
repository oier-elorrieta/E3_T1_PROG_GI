package Bista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Filma_aukeraketa extends JFrame {

private static final long serialVersionUID = 1L;
private JPanel contentPane;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Filma_aukeraketa frame = new Filma_aukeraketa();
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
public Filma_aukeraketa() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 300);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JComboBox comboBox_1_Data = new JComboBox();
comboBox_1_Data.setBounds(97, 74, 208, 22);
contentPane.add(comboBox_1_Data);

JLabel DataLbl = new JLabel("Aukeratu data");
DataLbl.setBounds(159, 23, 77, 14);
contentPane.add(DataLbl);

JLabel FilmaLbl = new JLabel("Aukeratu FIlma");
FilmaLbl.setBounds(159, 129, 77, 14);
contentPane.add(FilmaLbl);

JComboBox comboBox_2_Filmak = new JComboBox();
comboBox_2_Filmak.setBounds(97, 173, 208, 22);
contentPane.add(comboBox_2_Filmak);
}
}
