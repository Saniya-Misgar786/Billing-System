package billing_System;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class billingSystem extends JFrame implements ActionListener{

	private JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JButton b1,b2,b3;
	JTextField t1;
	JPasswordField p1;
	Font f;
	int cnt=0,cnt1=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billingSystem window = new billingSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public billingSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setContentPane(new JLabel(new ImageIcon("C:\\task\\back.jpeg")));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel(new ImageIcon("C:\\task\\billng.png"));
		label.setForeground(Color.white);
        label.setFont(new Font("Times New Roman",Font.BOLD,30));
        label.setBounds(200,100,400,100);
		frame.getContentPane().add(label);
		
		
		JLabel label1 = new JLabel(new ImageIcon("C:\\task\\bil.png"));
		label1.setForeground(Color.white);
        label1.setFont(new Font("Times New Roman",Font.BOLD,30));
        label1.setBounds(750,200,200,200);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel(new ImageIcon("C:\\task\\bil.jpg"));
		label2.setForeground(Color.white);
        label2.setFont(new Font("Times New Roman",Font.BOLD,30));
        label2.setBounds(650,100,400,400);
		frame.getContentPane().add(label2);
		
		JLabel l8 = new JLabel(new ImageIcon("C:\\task\\unm.jpg"));
		l8.setBounds(150,250,50,25);
		frame.getContentPane().add(l8);
		
		
		l1 = new JLabel("User Name : "); 
		l1.setBounds(200,250,200,25);
		 l1.setForeground(Color.white);
		 l1.setFont(new Font("Times New Roman",Font.BOLD,20));
		frame.getContentPane().add(l1);

		t1 = new JTextField(20);
		t1.setBounds(350,250,200,25);
		t1.setToolTipText("Enter Username");
		frame.getContentPane().add(t1);

        l4 = new JLabel(new ImageIcon("C:\\task\\pass.png"));
		l4.setBounds(150,300,50,25);
		frame.getContentPane().add(l4);

		l2 = new JLabel("Password  : "); 
		l2.setFont(new Font("Times New Roman",Font.BOLD,20));
		l2.setBounds(200,300,200,25);
		 l2.setForeground(Color.white);
		 frame.getContentPane().add(l2);

		p1 = new JPasswordField(20);
		p1.setBounds(350,300,200,25);
		p1.setToolTipText("Enter Password");
		frame.getContentPane().add(p1);

		b1 = new JButton("",new ImageIcon("C:\\task\\Log.png"));
		b1.setBounds(200,400,80,35);
		frame.getContentPane().add(b1);b1.addActionListener(this);

		b2 = new JButton("",new ImageIcon("C:\\task\\clear.png"));
		b2.setBounds(320,400,80,35);
		frame.getContentPane().add(b2);b2.addActionListener(this);

		b3 = new JButton("",new ImageIcon("C:\\task\\cancel.jpg"));
		b3.setBounds(440,400,80,35);
		frame.getContentPane().add(b3);b3.addActionListener(this);

		frame.setTitle("Login");
		frame.setLocation(20,20);
		frame.setSize(1370,800);
		frame.setResizable(false);
		
		frame.setVisible(true);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1)
		{
			try
			{
				String s=t1.getText();
				String s1=new String(p1.getPassword());
				if((s.compareTo("admin")==0)&&(s1.compareTo("admin")==0))
				{
					JOptionPane.showMessageDialog(null," Welcome !!! You are valid user ...!!!  ","WELCOME",JOptionPane.INFORMATION_MESSAGE);
			   	    frame.setVisible(false);
			   	    new bill();
			   	    
                    /*  JFrame wel= new JFrame("Bill");
                      wel.setSize(1370, 800);
  					wel.setContentPane(new JLabel(new ImageIcon("C:\\Users\\pote\\Downloads\\back.jpeg")));
  					wel.setVisible(true);
  					wel.getContentPane().setLayout(null);
  					
  					JLabel l=new JLabel("BILLING SYSTEM");
  					l.setForeground(Color.white);
  			        l.setFont(new Font("Times New Roman",Font.BOLD,30));
  			        l.setBounds(300,100,300,40);
  					wel.getContentPane().add(l);*/
  					
  					
  			
  					
			        
				}
				else
				{
					throw new Exception();
				}
			}
			catch(Exception e1)
			{
			    cnt++;
			    JOptionPane.showMessageDialog(null," Sorry !!! You are not valid user ...!!!","WARNING",JOptionPane.ERROR_MESSAGE);
			    t1.setText("");
			    p1.setText("");
			    if(cnt==3)
			    {
			         JOptionPane.showMessageDialog(null,"Sorry !!! Your 3 attempts are over ...!!!","WARNING",JOptionPane.ERROR_MESSAGE);
			         System.exit(0);
			    }
            }

		}

		else if(ae.getSource()==b2)
		{
			t1.setText("");
			p1.setText("");

		}

		else if(ae.getSource()==b3)
		{
		    System.exit(0);
		}
	}


}
/*
<applet code="BillingSystem" width=400 height=150>
</applet>
*/