package Bista;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import java.time.LocalDate;
import java.time.ZoneId;

import Modeloa.*;
import Kontroladorea.*;




    public class Zinema_aukeraketa extends JFrame{
    	
        private JPanel zinemaAuPan;
        private JPanel filmaAuPan;
        private JPanel dataAuPan;
        private final JLabel lblZinemaAu = new JLabel("Aukeratu Zinema:");
        private final JComboBox<Zinema> cboZinemaAu = new JComboBox();
        private final JButton  btnFilmaData = new JButton("Atzera");
        private final JButton btnZineData = new JButton("Jarraitu");
        private final JButton btnNext = new JButton("Hurrengoa");
        private final JButton  btnDataZine = new JButton("Atzera");
        private final JButton  btnDataFilma = new JButton("Jarraitu");
        private JSplitPane splitPane = new JSplitPane();
        Zinema aukeratutakoZinema = (Zinema)cboZinemaAu.getSelectedItem();
        private final JComboBox cboFilmAu = new JComboBox();
        private final JSplitPane splitPane_1 = new JSplitPane();
      
        
        /**
         * Create the frame.
         */
        
        
        
        public void filmakBete() {
        	
        	
        	
        }
        
        
        
        
        
        
        public Zinema_aukeraketa(Api api) {
        	
        
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            getContentPane().setLayout(new BorderLayout(0, 0));

           
            
            zinemaAuPan = hasieratuPanel1(api);
            filmaAuPan = hasieratuPanel2();
            dataAuPan = hasieratuPanel3();

          
            getContentPane().add(zinemaAuPan);
            getContentPane().add(filmaAuPan);
            getContentPane().add(dataAuPan);

           
            zinemaAuPan.setVisible(true);
            filmaAuPan.setVisible(false);
            dataAuPan.setVisible(false);

            // btn asfasdfasdfasdfdsfasasdfasdasafsasfasdfasdasfasdfasdfasdfasdfasdfasdfasdfasdfasdf
            btnZineData.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    zinemaAuPan.setVisible(false);
                    dataAuPan.setVisible(true);
                    
                    
                    
                }
            });

            btnNext.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   
                    filmaAuPan.setVisible(false);
                    
                }
            });

            btnDataZine.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                	dataAuPan.setVisible(false);
                    zinemaAuPan.setVisible(true);
                    
                }
            });
            
            btnFilmaData.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dataAuPan.setVisible(true);
                    filmaAuPan.setVisible(false);
                    
                }
            });

        }

        public JPanel hasieratuPanel1(Api api) {
            JPanel panel = new JPanel();
            panel.setBounds(0, 0, 434, 261);
            panel.setLayout(new BorderLayout(0, 0));

            panel.add(lblZinemaAu, BorderLayout.NORTH);
            lblZinemaAu.setHorizontalAlignment(SwingConstants.CENTER);
            lblZinemaAu.setFont(new Font("Tahoma", Font.PLAIN, 26));

            panel.add(cboZinemaAu, BorderLayout.CENTER);
            panel.add(btnZineData, BorderLayout.SOUTH);

            for(int i = 0;i < api.getZinemaO().size();i++)
            cboZinemaAu.addItem(api.getZinemaO().get(i));
            
            return panel;
        }

        public JPanel hasieratuPanel2() {
            JPanel panel = new JPanel();
            panel.setBounds(0, 0, 434, 261);
            panel.setLayout(new BorderLayout(0, 0));

            JLabel lblFilmaAu = new JLabel("Aukeratu Filma:");
            lblFilmaAu.setHorizontalAlignment(SwingConstants.CENTER);
            lblFilmaAu.setFont(new Font("Tahoma", Font.PLAIN, 26));
            panel.add(lblFilmaAu, BorderLayout.NORTH);
    		splitPane.setEnabled(false);
    		splitPane.setResizeWeight(0.5);
          
           
    		panel.add(splitPane, BorderLayout.SOUTH);
    		
    		
    		splitPane.setLeftComponent(btnFilmaData);
    		splitPane.setRightComponent(btnNext);
    		
    		panel.add(cboFilmAu, BorderLayout.CENTER);
            
            return panel;
        }

        public JPanel hasieratuPanel3() {
            JPanel panel = new JPanel();
            panel.setBounds(0, 0, 434, 261);
            panel.setLayout(new BorderLayout(0, 0));
            
            splitPane_1.setEnabled(false);
            splitPane_1.setResizeWeight(0.5);
            panel.add(splitPane_1, BorderLayout.SOUTH);
            
            splitPane_1.setLeftComponent(btnDataZine);
            splitPane_1.setRightComponent(btnDataFilma);
            // Crear el modelo de fecha

            UtilDateModel model = new UtilDateModel();

            Properties properties = new Properties();

            properties.put("text.today", "Hoy");

            properties.put("text.month", "Mes");

            properties.put("text.year", "Año");

            // Configurar el modelo para no permitir fechas pasadas

            model.setDate(2024, Calendar.FEBRUARY, 1); // Configuramos la fecha mínima (1 de febrero de 2024)

            model.setSelected(true);

            // Crear el panel de fecha

            JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);

            // Crear el picker de fecha con DateComponentFormatter

            JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());

            // Configurar el picker de fecha

            datePicker.getJFormattedTextField().setEditable(true);

            // Añadir un PropertyChangeListener al modelo para validar las fechas

            model.addPropertyChangeListener(new PropertyChangeListener() {

                @Override

                public void propertyChange(PropertyChangeEvent evt) {

                    Date selectedDate = model.getValue();
                    
       
                    Date currentDate =new Date();
                    
                    Calendar fechaActual = Calendar.getInstance();
                    fechaActual.setTime(currentDate);
                    fechaActual.add(Calendar.DAY_OF_MONTH, -1);
                    currentDate = fechaActual.getTime();
                    
                    LocalDate  currentLocalDate = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    
                    int year = currentLocalDate.getYear();
                    int month = currentLocalDate.getMonthValue();
                    int day = currentLocalDate.getDayOfMonth();

                    if (selectedDate != null && selectedDate.before(currentDate)) {

                        model.setDate(year,month,day);
                        model.setSelected(true);

                    }

                }

            });
            
            panel.add(datePicker, BorderLayout.CENTER);

            
            
            return panel;
        }
	}
	

