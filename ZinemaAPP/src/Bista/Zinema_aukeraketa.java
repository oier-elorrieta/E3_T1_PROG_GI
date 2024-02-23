package Bista;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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




<<<<<<< HEAD
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

    public class Zinema_aukeraketa extends JFrame{
    	
        private JPanel zinemaAuPan;
        private JPanel filmaAuPan;
        private JPanel dataAuPan;
        private JPanel saioaAuPan;
        private final JLabel lblZinemaAu = new JLabel("Aukeratu Zinema:");
        private final JComboBox<Zinema> cboZinemaAu = new JComboBox();
        private final JButton  btnFilmaData = new JButton("Atzera");
        private final JButton btnZineData = new JButton("Jarraitu");
        private final JButton btnFilmaSaioa = new JButton("Hurrengoa");
        private final JButton  btnDataZine = new JButton("Atzera");
        private final JButton  btnDataFilma = new JButton("Jarraitu");
        private final JButton  btnSaioaErosketa = new JButton("Jarraitu");
        private final JButton  btnSaioaFilma = new JButton("Atzera");
        
        
        Zinema aukeratutakoZinema = (Zinema)cboZinemaAu.getSelectedItem();
       
        Date selectedDate;
        Date currentDate =new Date();
        LocalDate  currentLocalDate = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        UtilDateModel model;
        private final JComboBox<String> cboFilmaAu = new JComboBox();
        ArrayList<String> errepikatuGabekoPel;
        private final JComboBox<Saioa> cboSaioaAu = new JComboBox();
        String aukeratutakoPelia;
        
        
        
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
            dataAuPan = hasieratuPanel3();
            

          
            getContentPane().add(zinemaAuPan);
            getContentPane().add(dataAuPan);

           
            zinemaAuPan.setVisible(true);
            dataAuPan.setVisible(false);

            // btn asfasdfasdfasdfdsfasasdfasdasafsasfasdfasdasfasdfasdfasdfasdfasdfasdfasdfasdfasdf
            btnZineData.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    zinemaAuPan.setVisible(false);
                    dataAuPan.setVisible(true);
                    aukeratutakoZinema = (Zinema)cboZinemaAu.getSelectedItem();
                    
                }
            });

            
            
            btnDataFilma.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   
                	dataAuPan.setVisible(false);
                	selectedDate = model.getValue();
                	
                	filmaAuPan = hasieratuPanel2();
                	getContentPane().add(filmaAuPan);
                	
                	filmaAuPan.setVisible(true);
                	
                	
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
                	cboFilmaAu.removeAllItems();
                	dataAuPan.setVisible(true);
                    filmaAuPan.setVisible(false);
                    
                }
            });
            
            btnFilmaSaioa.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	aukeratutakoPelia = (String)cboFilmaAu.getSelectedItem();
                	filmaAuPan.setVisible(false);
                	saioaAuPan = hasieratuPanel4();
                	getContentPane().add(saioaAuPan);
                	saioaAuPan.setVisible(true);
                	
                    
                }
            });
            
            btnSaioaFilma.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	cboSaioaAu.removeAllItems();
                	saioaAuPan.setVisible(false);
                	filmaAuPan.setVisible(true);
                   
                    
                }
            });
            

        }

        /////////////////////////////////////////////////////////////////////////////////////////////
        
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

        ///////////////////////////////////////////////////////////////////////////////////////////////
        
        public JPanel hasieratuPanel2() {
            JPanel panel = new JPanel();
            panel.setBounds(0, 0, 434, 261);
            panel.setLayout(new BorderLayout(0, 0));

            JLabel lblFilmaAu = new JLabel("Aukeratu Filma:");
            lblFilmaAu.setHorizontalAlignment(SwingConstants.CENTER);
            lblFilmaAu.setFont(new Font("Tahoma", Font.PLAIN, 26));
            panel.add(lblFilmaAu, BorderLayout.NORTH);
    		
            JSplitPane splitPane = new JSplitPane();
            splitPane.setEnabled(false);
    		splitPane.setResizeWeight(0.5);
          
           
    		panel.add(splitPane, BorderLayout.SOUTH);
    		
    		
    		splitPane.setLeftComponent(btnFilmaData);
    		splitPane.setRightComponent(btnFilmaSaioa);
    		
    		errepikatuGabekoPel = new ArrayList<>();
    		
    		for(Saioa i:aukeratutakoZinema.getSaioak()) {
    			
    			if(!errepikatuGabekoPel.contains(i.getFilma().getIzena()) && i.getData().equals(selectedDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate())) {
    			
    				cboFilmaAu.addItem(i.getFilma().getIzena());
    				errepikatuGabekoPel.add(i.getFilma().getIzena());
    			}
    		}
    		
    		
    		panel.add(cboFilmaAu, BorderLayout.CENTER);
            
    		
            return panel;
        }

        
        
        
        ////////////////////////////////////////////////////////////////////////////////////
        
        public JPanel hasieratuPanel3() {            
            JPanel panel = new JPanel();
            panel.setBounds(0, 0, 434, 261);
            panel.setLayout(new BorderLayout(0, 0));
            JSplitPane splitPane = new JSplitPane();
            splitPane.setEnabled(false);
            splitPane.setResizeWeight(0.5);
            panel.add(splitPane, BorderLayout.SOUTH);
            
            splitPane.setLeftComponent(btnDataZine);
            splitPane.setRightComponent(btnDataFilma);
            // Crear el modelo de fecha

            model = new UtilDateModel();

            Properties properties = new Properties();

            properties.put("text.today", "Hoy");

            properties.put("text.month", "Mes");

            properties.put("text.year", "Año");

            // Configurar el modelo para no permitir fechas pasadas

            int year = currentLocalDate.getYear();
            int month = currentLocalDate.getMonthValue();
            int day = currentLocalDate.getDayOfMonth();
            
            model.setDate(year, month, day); 
            model.setSelected(true);

           System.out.println(currentLocalDate);
            
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
                	
                	selectedDate = model.getValue();
                	SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                	Date maximoa;
					try {
						maximoa = formato.parse("2024-03-11");
					
                	 
						
                    int year = currentLocalDate.getYear();
                    int month = currentLocalDate.getMonthValue();
                    int day = currentLocalDate.getDayOfMonth();

                    if (selectedDate != null && selectedDate.before(currentDate) || selectedDate.after(maximoa)) {
                    	
                        model.setDate(year,month,day);
                        model.setSelected(true);
                        
                        

                    }
					} catch (ParseException e) {
						
						e.printStackTrace();
					}
                }

            });
            
            panel.add(datePicker, BorderLayout.CENTER);

            
            
            return panel;
        }
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        public JPanel hasieratuPanel4() {
            
        	JPanel panel = new JPanel();
            panel.setBounds(0, 0, 434, 261);
            panel.setLayout(new BorderLayout(0, 0));

            JLabel lblSaioaAu = new JLabel("Aukeratu Saioa:");
           
            panel.add(lblSaioaAu, BorderLayout.NORTH);
            lblSaioaAu.setHorizontalAlignment(SwingConstants.CENTER);
            lblSaioaAu.setFont(new Font("Tahoma", Font.PLAIN, 26));
            JSplitPane splitPane = new JSplitPane();
            panel.add(cboSaioaAu, BorderLayout.CENTER);
            
            panel.add(splitPane, BorderLayout.SOUTH);
            splitPane.setEnabled(false);
    		splitPane.setResizeWeight(0.5);
            
  
            
    		splitPane.setLeftComponent(btnSaioaFilma);
    		splitPane.setRightComponent(btnSaioaErosketa);
            
            for(Saioa i: aukeratutakoZinema.getSaioak()) {
            	
            	if(i.getFilma().getIzena().equals(aukeratutakoPelia) && i.getData().equals(selectedDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate()))
            	cboSaioaAu.addItem(i);
            	
            }
           
            
            return panel;
        }

        
        
        
>>>>>>> 4021640c4c8f71034bfb86c41b2edd2d86d63b0c
	}
	

