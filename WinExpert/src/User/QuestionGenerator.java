package User;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
//import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.UIManager;

import Panel.WinPanel;

@SuppressWarnings("serial")
public class QuestionGenerator extends JFrame implements Runnable{

  private static String driverName = "com.mysql.jdbc.Driver";
  private static int ans1,ans2,cl=0;
  private static String Que;
  static JButton ans = new JButton("Ans");
  static JButton nxtPa=new JButton("NxtPage");

  WinPanel p1=new WinPanel();
  private static int cor=0;
  Thread chrono;
  private KeyListener ansKey;
  private KeyListener nxtPaKey;
  private static WinPanel p2=new WinPanel();
  private static WinPanel p=new WinPanel();	
  private static  ArrayList<Integer> u=new ArrayList<Integer>();
  private static JLabel Ques =new JLabel();
  private static JLabel QuesNo =new JLabel();
  private static JLabel win =new JLabel();
  private static JLabel time =new JLabel();
  private static String userName,phNO;
@SuppressWarnings({ "unused", "deprecation" })
public QuestionGenerator(String user,String phNo) {
	setTitle("Question");
	userName=user;
	phNO=phNo;
	if(cl!=10){
		try {
	           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	        } catch (Exception e) {
	           System.err.println("Error al cargar Look And Feel");
	        }
		//setExtendedState( getExtendedState()|JFrame.MAXIMIZED_BOTH );
	//layout for frame panel & button
	setLayout(new BorderLayout());
	setBackground(Color.pink);
	setExtendedState( getExtendedState()|JFrame.MAXIMIZED_BOTH );
		
	p1.setLayout (new BorderLayout ());
    p1.setBackground(Color.pink);
    add(p1,BorderLayout.NORTH);
	p1.add(time,BorderLayout.WEST); 
	time.setForeground(Color.blue);
	chrono = new Thread(this);
	setCursor(getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
	
	p2.setLayout (new BorderLayout ());
    p2.setBackground(Color.DARK_GRAY);
    add(p2,BorderLayout.CENTER);
	
    p.setLayout (new BorderLayout ());
    p.setBackground(Color.pink);
    add(p,BorderLayout.SOUTH);
    
    //button text
    nxtPa.setFont(new Font("Monotype Corsiva",Font.BOLD,15));
    ans.setFont(new Font("Monotype Corsiva",Font.BOLD,15));
    ans.setBackground(Color.white);
    nxtPa.setBackground(Color.white);
    //label text
  
    time.setFont(new Font("Monotype Corsiva",Font.BOLD,30));
    Ques.setFont(new Font("Monotype Corsiva",Font.BOLD,30));
    Ques.setBounds(80, 250, 200, 500);
    Ques.setForeground(Color.white);
    
    QuesNo.setFont(new Font("Monotype Corsiva",Font.BOLD,30));
    //QuesNo.setBounds(80, 250, 200, 500);
    QuesNo.setForeground(Color.blue);
    p1.add(QuesNo,BorderLayout.EAST);
    QuesNo.setText("<html><body>"+cl+"</body></html>");
    
    win =new JLabel();
    win.setText("<html><body>Please use 'W' instead of Windows key</body></html>");
    win.setFont(new Font("Monotype Corsiva",Font.BOLD,30));
    win.setBounds(780, 50, 200, 500);
    win.setForeground(Color.white);
    p2.add(win,BorderLayout.NORTH);
    
    //database call & focus key
    addWindowFocusListener(new WindowAdapter() {
    	public void windowGainedFocus(WindowEvent e) {
	    	u.clear();
	    	u.removeAll(u);
			ans2=db();
			
	        ans.requestFocusInWindow();
	        ans.setFocusable(true);
	        ans.setHideActionText(isFocused());
	    }
	});
	
	//key action listener
	Action actionListener = new AbstractAction() {
     
	public void actionPerformed(ActionEvent actionEvent) {
        actionEvent.getSource();
       
      }
    };
    
    //answer listener
    ansKey=new KeyListener(){
    	int c=0;
    	
    	public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
	
		}

		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
				}

		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			//ans.removeKeyListener(ansKey);
			ans.removeKeyListener(nxtPaKey);
			int b=e.getKeyCode();
				c+=b;
				u.add(c);
				System.out.println("Key pressed code = "+b);
		}
	};
	
	//next page key listener
	 nxtPaKey=new KeyListener(){
	   	public void keyPressed(KeyEvent arg0) {
	   		// TODO Auto-generated method stub
	   	}
	   	public void keyReleased(KeyEvent arg0) {
	   		// TODO Auto-generated method stub
	   		if(arg0.getKeyCode()==10){
	   			System.out.println("Total Key pressed Values = "+u.get(u.size()-1));
	   			if(ans2==u.get(u.size()-1)){
	   				cor=cor+1;
	   				
	   			 try
	   		    {
	   		         Class.forName("com.mysql.jdbc.Driver");
	   		         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
	   		         String sql="UPDATE reg SET score=? WHERE Phno=?";
	   		         PreparedStatement ps = con.prepareStatement(sql);
	   		         ps.setString(1, ""+cor+"");
	   		         ps.setString(2, phNO);
	   		         ps.executeUpdate();
	   		         System.out.println("Score ="+cor);
	   		}

	   		catch(Exception e)
	   		{
	   			 System.out.println("Failed update the score..."+e);
	   			
	   		}
	   				System.out.println("Answer is correct:");
	   				System.out.println("Total correct answer = "+cor);
	   				u.clear();
	   				u.removeAll(u);
	   				chrono.stop();
	   				dispose();
	   				ans.removeKeyListener(ansKey);
	   				nxtPa.removeKeyListener(nxtPaKey);
	   				new QuestionGenerator(userName,phNO);
	   				}
	   			else{
	   				System.out.println("Answer is worng ");
	   				System.out.println("Total correct answer = "+cor);
	   				u.clear();
	   				u.removeAll(u);
	   				chrono.stop();
	   				dispose();
	   				ans.removeKeyListener(ansKey);
	   				nxtPa.removeKeyListener(nxtPaKey);
	   				new QuestionGenerator(userName,phNO);
	   		}	
	   		}
	   		}

	   	public void keyTyped(KeyEvent arg0) {
	   		// TODO Auto-generated method stub
	   	}
	   };
	
	   //key listener remover
    ans.addKeyListener(ansKey);
    nxtPa.addKeyListener(nxtPaKey);
	pack();
	p.add(ans,BorderLayout.WEST);
    p.add(nxtPa,BorderLayout.EAST);    
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    setResizable(false);
    getRootPane().setWindowDecorationStyle(JRootPane.NONE);
    setVisible(true);
    cl+=1;
  }else{
	  setVisible(false);
      dispose();
      System.out.println("Finsh test...");
      nxtPa.removeKeyListener(nxtPaKey);
      ans.removeKeyListener(ansKey);
     new About();
 }
	
}

//database
public int db(){
	nxtPa.removeKeyListener(ansKey);
    ans.removeKeyListener(nxtPaKey);
try {                 
	
    Class.forName(driverName);                
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
    String sql="SELECT Que,Ans FROM Ques ORDER BY RAND() LIMIT 1" ;
    
    PreparedStatement pst=con.prepareStatement(sql);
    ResultSet rs=pst.executeQuery();
   // boolean x = rs.next();
    System.out.println("Connected..");
    while(rs.next())
    {
    	chrono.start ();
    	Que=rs.getString("Que");
        ans1=rs.getInt("Ans");
        Ques.setText("<html><body><centre>"+Que+"</center></body></html>");
        p2.add(Ques,BorderLayout.CENTER);
         
     }
    return ans1;
}

catch(Exception e)
{
	 System.out.println("Failed connect..."+e);
	 return 0;
}
}

//timer
@SuppressWarnings({ "static-access", "deprecation" })
public void run() {
    int seconds=30;
   
    try {
    	
    for(;;)
    {
    	
            //if(seconds==) { seconds=0;}
            seconds--;
            
            time.setText(userName+" Time is going : "+seconds);
            chrono.sleep(1000);
    
    if(seconds<=0){
    	seconds=30;
    	setVisible(false);
        
        System.out.println("time out");
        nxtPa.removeKeyListener(nxtPaKey);
        ans.removeKeyListener(ansKey);
        new QuestionGenerator(userName,phNO);
        chrono.stop();
    }
    }
    }
    
    catch (InterruptedException e) { System.out.println(e.getMessage()); }
}
public static void main(String[] ajs){
	new QuestionGenerator(userName,phNO);
}
}