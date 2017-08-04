package User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;


@SuppressWarnings("serial")
public class About extends JFrame { 
    JLabel thanks,l11,l7,l8,l9,l10;
    JButton fKey;
    KeyListener finsh;

    public About()
     {
	   try {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
           System.err.println("Error al cargar Look And Feel");

        }

	   	setExtendedState( getExtendedState()|JFrame.MAXIMIZED_BOTH );
	   	setLocationRelativeTo( null );
        setTitle("WinExpert");
        thanks = new JLabel("Thank you...");
        thanks.setForeground(Color.MAGENTA);
        
        l7 = new JLabel("TeZfuRzA 17.2");
        l8 = new JLabel("SRISHTA '17");
        l9 = new JLabel("WinExpert Project Developed By");
        l10 = new JLabel("<html><body>The Student of CSE...</body></html>");
        l11=new JLabel("<html><body><p>JayaKumar Arasan</p>"
        		+"<p>Elangovan Ganesan</p>"
        		+ "<p>Salman Munna</p>"
        		+ "<p>Sivanesan Muniyandi</p>"
        		+ "</body></html>");
        
        l7.setForeground(Color.red);
        l8.setForeground(Color.ORANGE);
        l9.setForeground(Color.darkGray);
        l10.setForeground(Color.green);
        l11.setForeground(Color.blue);
        
        l7.setBounds(100, 10, 400, 50);
        l8.setBounds(150, 70, 300, 40);
        l9.setBounds(850, 490, 400, 30);
        l10.setBounds(1050, 450, 400, 200);
        l11.setBounds(1070, 550, 300, 200);
        
        l7.setFont(new Font("Monotype Corsiva",Font.TRUETYPE_FONT,45));
        l8.setFont(new Font("Monotype Corsiva",Font.TRUETYPE_FONT,35));
        l9.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        l10.setFont(new Font("Monotype Corsiva",Font.BOLD,30));
        l11.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        fKey = new JButton("Finsh");
        
        //fKey.addActionListener(this);
        setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
        thanks.setBounds(450, 250, 700, 110);
        
        fKey.setBounds(650, 490, 150, 30);
        thanks.setFont(new Font("Monotype Corsiva",Font.BOLD,100));
        fKey.setFont(new Font("Monotype Corsiva",Font.BOLD,25));
        add(thanks);
        add(fKey);
        setLayout(new BorderLayout());
        setVisible(true);
        setBackground(Color.pink);
        new AbstractAction() {
 	public void actionPerformed(ActionEvent actionEvent) {
         actionEvent.getSource();
       }
     };
     //finsh listener
     finsh=new KeyListener(){
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
		}
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub	
			if(arg0.getKeyCode()==10)
		       {
				fKey.removeKeyListener(finsh);
            	//sKey.removeKeyListener(start);
            	setVisible(false);
           		dispose();
           		System.exit(1);
		         }
		}
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
		}
     };
         fKey.addKeyListener(finsh);
         
     setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     setResizable(false);
     getRootPane().setWindowDecorationStyle(JRootPane.NONE);
     setVisible(true);
     }
      public static void main(String args[])
   {
        new About();
    }
	
}