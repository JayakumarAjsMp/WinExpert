package Login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here  
        try {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
           System.err.println("Error al cargar Look And Feel");
        }
        JFrame.setDefaultLookAndFeelDecorated(false);
        JFrame fr = new JFrame();        
        fr.setSize(Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
        fr.setUndecorated(true);
        JPanel pl = new JPanel();
        pl.setLayout(new BorderLayout());        
        pl.setBorder(BorderFactory.createLineBorder(Color.red));
        pl.setBackground(Color.pink);
        
        JPanel pl1 = new JPanel();
        pl1.setLayout(new BorderLayout());        
        pl1.setBorder(BorderFactory.createLineBorder(Color.red));
        pl1.setBackground(Color.pink);
        
        JPanel pl2 = new JPanel();
        pl2.setLayout(new BorderLayout());        
        pl2.setBorder(BorderFactory.createLineBorder(Color.red));
        pl2.setBackground(Color.pink);
        JPanel pl3 = new JPanel();
        pl3.setLayout(new BorderLayout());        
        pl3.setBorder(BorderFactory.createLineBorder(Color.red));
        pl3.setBackground(Color.pink);
        JPanel pl4 = new JPanel();
        pl4.setLayout(new BorderLayout());        
        pl4.setBorder(BorderFactory.createLineBorder(Color.red));
        pl4.setBackground(Color.pink);
        
        JLabel la = new JLabel("");
        JLabel la1 = new JLabel("");
        JLabel la2 = new JLabel("");
        JLabel la3 = new JLabel("");
        final JProgressBar pb = new JProgressBar();        
        pb.setOrientation(JProgressBar.HORIZONTAL);        
        pb.setMinimum(0);
        pb.setMaximum(50); 
        la.setLocation(200,0500);
        la.setText("WelCome To WiNDowS ExPertS...");
        la.setFont(new Font("Monotype Corsiva",Font.BOLD,50));
        pl1.add(la,BorderLayout.CENTER);
        pl.add(pb,BorderLayout.SOUTH);
        pl2.add(la1,BorderLayout.EAST);
        pl3.add(la2,BorderLayout.WEST);
        pl4.add(la3,BorderLayout.NORTH);
        
        
        fr.add(pl2,BorderLayout.EAST);
        fr.add(pl3,BorderLayout.WEST);
        fr.add(pl4,BorderLayout.NORTH);
        
        fr.add(pl1,BorderLayout.CENTER);
        fr.add(pl,BorderLayout.SOUTH);

        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        		//  fr.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width/2)-(fr.getWidth()/2),(Toolkit.getDefaultToolkit().getScreenSize().height/2)-(fr.getHeight()/2));        
        fr.setVisible(true);

        for (int i = 0; i <= 50; i++) {
          final int percent = i;          
          try {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                  pb.setValue(percent);                  
                }
            });
            java.lang.Thread.sleep(50); 
          } catch (InterruptedException e) {e.printStackTrace();}
        }
        fr.setVisible(false);
        new Registrationn();
    }
}

