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





	

    public class Zinema_aukeraketa extends JFrame{
    	
    	//Panelak
        private JPanel zinemaAuPan;
        private JPanel filmaAuPan;
        private JPanel dataAuPan;
        private JPanel saioaAuPan;
       
        //lbl-ak eta botoiak
        private final JLabel lblZinemaAu = new JLabel("Aukeratu Zinema:");
        private final JButton  btnFilmaData = new JButton("Atzera");
        private final JButton btnZineData = new JButton("Jarraitu");
        private final JButton btnFilmaSaioa = new JButton("Hurrengoa");
        private final JButton  btnDataZine = new JButton("Atzera");
        private final JButton  btnDataFilma = new JButton("Jarraitu");
        private final JButton  btnSaioaErosketa = new JButton("Jarraitu");
        private final JButton  btnSaioaFilma = new JButton("Atzera");
        private final JButton  btnErosketara = new JButton("Bukatu Erosketa");
        
        //cbobox-ak
        private final JComboBox<Zinema> cboZinemaAu = new JComboBox();
        private final JComboBox<String> cboFilmaAu = new JComboBox();
        private final JComboBox<Saioa> cboSaioaAu = new JComboBox();
        SpinnerModel spinnerModel = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        private JSpinner kantAu = new JSpinner(spinnerModel);
       
        //Aukeratutako datuak
        private Zinema aukeratutakoZinema = (Zinema)cboZinemaAu.getSelectedItem();
        private String aukeratutakoPelia;
        private Date aukeratutakoData;
        private Saioa aukeratutakoSaioa;
        private Erabiltzaile logeatutakoErabiltzailea;
        private ArrayList<Sarrera> sarrerak = new ArrayList();
        
        //beste batzuk
        private Date gaurkoData =new Date();
        private LocalDate  currentLocalDate = gaurkoData.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        private UtilDateModel model;
        private ArrayList<String> errepikatuGabekoPel;
        

        
   
   
        
        
        /**
         * 
         * @param api
         */
        public Zinema_aukeraketa(Api api) {
        	
        	logeatutakoErabiltzailea = api.getOkLogeatutakoErabiltzile();
        	
        	
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            getContentPane().setLayout(new BorderLayout(0, 0));

           
            
            zinemaAuPan = hasieratuPanel1_zinemaAu(api);
            dataAuPan = hasieratuPanel3_dataAu();
            

          
            getContentPane().add(zinemaAuPan);
            getContentPane().add(dataAuPan);

           
            zinemaAuPan.setVisible(true);
            dataAuPan.setVisible(false);

          
            //Botoien listenerrak
            
            
            btnZineData.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    zinemaAuPan.setVisible(false);
                    dataAuPan.setVisible(true);
                    aukeratutakoZinema = (Zinema)cboZinemaAu.getSelectedItem();
                    
                }
            });

            
            
            btnDataFilma.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   
              
                	aukeratutakoData = model.getValue();
                	boolean aurrera = false;
            		for(Saioa i:aukeratutakoZinema.getSaioak()) {
            			
            			if(i.getData().equals(aukeratutakoData.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate())) {
            				
            				dataAuPan.setVisible(false);
                			filmaAuPan = hasieratuPanel2_filmaAu();
                        	getContentPane().add(filmaAuPan);
                        	filmaAuPan.setVisible(true);
                        	aurrera = true;
                        	break;
            			}
            			
            		}
            		if(!aurrera) {
            			JOptionPane.showMessageDialog(Zinema_aukeraketa.this, "Data horretan zinema itxita dago", "Kontuz!", JOptionPane.WARNING_MESSAGE);
            			}
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
                	saioaAuPan = hasieratuPanel4_saioAu();
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
            
            btnSaioaErosketa.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	
                	aukeratutakoSaioa = (Saioa) cboSaioaAu.getSelectedItem();
                	sarrerak.add(new Sarrera(aukeratutakoSaioa,aukeratutakoZinema.getIzena(),(int) kantAu.getValue()));
                	saioaAuPan.setVisible(false);
                	zinemaAuPan.setVisible(true);
                	cboSaioaAu.removeAllItems();
                	cboFilmaAu.removeAllItems();
                	
                   
                    
                }
            });
            
            
            btnErosketara.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	aukeratutakoSaioa = (Saioa) cboSaioaAu.getSelectedItem();
                	sarrerak.add(new Sarrera(aukeratutakoSaioa,aukeratutakoZinema.getIzena(),(int) kantAu.getValue()));
                	ErosketaBista erosketaBista = new ErosketaBista(sarrerak,logeatutakoErabiltzailea);
                	erosketaBista.setVisible(true);
                	
                	
                   
                    
                }
            });
            
            

        }

        
        /**
         * 
         * @param api
         * @return
         */
        public JPanel hasieratuPanel1_zinemaAu(Api api) {
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

        
        /**
         * 
         * @return
         */
        public JPanel hasieratuPanel2_filmaAu() {
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
    			
    			if(!errepikatuGabekoPel.contains(i.getFilma().getIzena()) && i.getData().equals(aukeratutakoData.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate())) {
    			
    				cboFilmaAu.addItem(i.getFilma().getIzena());
    				errepikatuGabekoPel.add(i.getFilma().getIzena());
    			}
    		}
    		
    		
    		panel.add(cboFilmaAu, BorderLayout.CENTER);
            
    		
            return panel;
        }

        
        
        
      
        /*
         * 
         */
        public JPanel hasieratuPanel3_dataAu() {            
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

            // Data predeterminatua jartzen

            int year = currentLocalDate.getYear();
            int month = currentLocalDate.getMonthValue();
            int day = currentLocalDate.getDayOfMonth();
            
            model.setDate(year, month, day); 
            model.setSelected(true);

           System.out.println(currentLocalDate);
            
            // Sortu dataren panela

            JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);

            JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());

            datePicker.getJFormattedTextField().setEditable(true);

            // DatePickerraren listenerra sortzen eta datak balidatzen

            model.addPropertyChangeListener(new PropertyChangeListener() {

                @Override

                public void propertyChange(PropertyChangeEvent evt) {
                	
                	aukeratutakoData = model.getValue();
                	SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                	Date maximoa;
					try {
						maximoa = formato.parse("2024-03-11");
					
                	 
						
                    int year = currentLocalDate.getYear();
                    int month = currentLocalDate.getMonthValue();
                    int day = currentLocalDate.getDayOfMonth();

                    if (aukeratutakoData != null && aukeratutakoData.before(gaurkoData) || aukeratutakoData.after(maximoa)) {
                    	
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
        
        
        
        
        /**
         * 
         * @return
         */
        public JPanel hasieratuPanel4_saioAu() {
            
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
    		
    		panel.add(btnErosketara,BorderLayout.EAST);
            panel.add(kantAu,BorderLayout.WEST);
    		
    		
            for(Saioa i: aukeratutakoZinema.getSaioak()) {
            	
            	if(i.getFilma().getIzena().equals(aukeratutakoPelia) && i.getData().equals(aukeratutakoData.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate()))
            	cboSaioaAu.addItem(i);
            	
            }
           
            
            return panel;
        }

        
 
           
            
      
        
        

	}
	

