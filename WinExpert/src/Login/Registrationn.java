package Login;

import javax.swing.*;

import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.sql.*;
import javax.swing.UIManager.*;

import User.QuestionGenerator;
 
@SuppressWarnings({ "serial", "unused" })
public class Registrationn extends JFrame { 
    JLabel l1, l2, l3, l4, l5,l6,l7,l8,l9,l10;
    JTextField tf1, tf2, tf3, tf4,tf5;
    JButton btn1, btn2;
    KeyListener submit,clear;
    //WinPanel p=new WinPanel();
   public Registrationn()
     {
	   
	   try {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
           System.err.println("Error at Look And Feel");
        }
	   setExtendedState( getExtendedState()|JFrame.MAXIMIZED_BOTH );
	  
	   setLocationRelativeTo( null );
        setTitle("Registration");
        setBackground(Color.pink);
        
        l1 = new JLabel("Participant Details:");
        l1.setForeground(Color.BLUE);
        l2 = new JLabel("Participant Name:");
        l6 = new JLabel("Member Name:");
        l3 = new JLabel("Email-ID:");
        l4 = new JLabel("College:");
        l5 = new JLabel("Phone No:"); 
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5=new JTextField();
        
        l7 = new JLabel("TeZfuRzA 17.2");
        l8 = new JLabel("SRISHTA '17");
        l9 = new JLabel("WinExpert Project Developed By");
        l10 = new JLabel("<html><body>The Student of CSE...</body></html>");
        
        l7.setForeground(Color.red);
        l8.setForeground(Color.ORANGE);
        l9.setForeground(Color.darkGray);
        l10.setForeground(Color.green);
        
        btn1 = new JButton("Submit");
        btn2 = new JButton("Clear");
 
       // btn1.addActionListener(this);
       // btn2.addActionListener(this);
        setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
        
        tf1.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
        tf2.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
        tf3.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
        tf4.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
        tf5.setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
     
        
        
        l1.setBounds(550, 100, 400, 70);
        l2.setBounds(480, 170, 300, 30);
        l6.setBounds(480, 210, 300, 30);
        l3.setBounds(480, 250, 300, 30);
        l4.setBounds(480, 290, 300, 30);
        l5.setBounds(480, 330, 300, 30);
        tf1.setBounds(700, 170, 250, 30);
        tf5.setBounds(700, 210, 250, 30);
        tf2.setBounds(700, 250, 250, 30);
        tf3.setBounds(700, 290, 250, 30);
        tf4.setBounds(700 ,330, 250, 30);
        btn1.setBounds(550, 400, 150, 30);
        btn2.setBounds(770, 400, 150, 30);
        
        l7.setBounds(100, 10, 400, 50);
        l8.setBounds(150, 70, 300, 70);
        l9.setBounds(850, 590, 400, 30);
        l10.setBounds(1100, 630, 300, 50);
        
        
        l1.setFont(new Font("Monotype Corsive",Font.BOLD,25));
        l2.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        l3.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        l4.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        l5.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        l6.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        tf1.setFont(new Font("Monotype Corsiva",Font.BOLD,15));
        tf2.setFont(new Font("Monotype Corsiva",Font.BOLD,15));
        tf3.setFont(new Font("Monotype Corsiva",Font.BOLD,15));
        tf4.setFont(new Font("Monotype Corsiva",Font.BOLD,15));
        tf5.setFont(new Font("Monotype Corsiva",Font.BOLD,15));
        btn1.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        btn2.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        
        l7.setFont(new Font("Monotype Corsiva",Font.TRUETYPE_FONT,45));
        l8.setFont(new Font("Monotype Corsiva",Font.TRUETYPE_FONT,35));
        l9.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        l10.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        
        
        tf1.setText(null);
        tf2.setText(null);
        tf3.setText(null);
        tf4.setText(null);
        tf5.setText(null);
        
        add(l1);
        add(l2);
        add(tf1);
        add(l6);
        add(tf5);
        add(l3);
        add(tf2);
        add(l4);
        add(tf3);
        add(l5);
        add(tf4);
        add(btn1);
        add(btn2);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        
        setLayout(new BorderLayout());
        setVisible(true);
        //setSize(Toolkit.getDefaultToolkit (). getScreenSize (). width, Toolkit.getDefaultToolkit (). getScreenSize (). height);
        
      
        new AbstractAction() {
 	public void actionPerformed(ActionEvent actionEvent) {
         actionEvent.getSource();
        
       }
     };
     
     //clear listener
     clear=new KeyListener(){

		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
			if(arg0.getKeyCode()==10)
		       {
		            tf1.setText("");
		            tf5.setText("");
		            tf2.setText("");
		            tf3.setText("");
		            tf4.setText("");
		         }
		}

		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
		    
		}
    	 
     };
     
     //submit listener
     submit=new KeyListener(){
     	
     	
     	public void keyTyped(KeyEvent e) {
 			// TODO Auto-generated method stub
 	
 		}

 		public void keyPressed(KeyEvent e) {
 			// TODO Auto-generated method stub
 				}

 		public void keyReleased(KeyEvent e) {
 			// TODO Auto-generated method stub
 			
        if (e.getKeyCode()==10 )
         {
        	String s1,s2,s3,s4,s5;
             s1 = tf1.getText();
            s2 = tf5.getText();
             s3 = tf2.getText();
            s4 = tf3.getText();
            s5=tf4.getText();
            try
            {
         	   int x=0;
         	   String s6="0";
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","");
                 String sql="insert into reg values(?,?,?,?,?,?)";
                 PreparedStatement ps = con.prepareStatement(sql);
                 ps.setString(1, s1);
                 ps.setString(2, s2);
                 ps.setString(3, s3);
                 ps.setString(4, s4);
                 ps.setString(5,s5);
                 ps.setString(6, s6);
                 ps.executeUpdate();
                 x++;
                 if (x > 0) 
                 {
                 	btn2.removeKeyListener(clear);
                 	btn1.removeKeyListener(submit);
                 	x=0;
                    new QuestionGenerator(s1,s5);
                    s1=s2=s3=s4=s5=null;
                    setVisible(false);
                		dispose();
                    
                 }
             
            }
         catch (Exception ex) 
             {
                 System.out.println(ex);
             }
        		 
            }else{

	            tf1.setText("");
	            tf5.setText("");
	            tf2.setText("");
	            tf3.setText("");
	            tf4.setText("");
            }
         }
     };
     btn1.addKeyListener(submit);
     btn2.addKeyListener(clear);
     setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     setResizable(false);
     getRootPane().setWindowDecorationStyle(JRootPane.NONE);
     setVisible(true);
          }
    
   
    public static void main(String args[])
   {
        new Registrationn();
    }
	
}
