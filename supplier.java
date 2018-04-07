package billing_System;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class supplier extends JFrame
{
	

	public supplier() throws URISyntaxException
	{
		 final URI uri = new URI("http://airpple.manufacturer.globalsources.com/si/6008836882715/Homepage.htm?source=CoyName_L1DD&pkg=P6");
		 final URI uri1 = new URI("http://www.globalsources.com/gsol/GeneralManager?&catalog_id=2000000003844&design=clean&language=en&page=prodalert/SAMarketing&source=L1%20DD%20Pg&from=follow_me&supplier_id=6008836882715&SAFrom=&pop_host=www.globalsources.com");
		 final URI uri2=new URI("http://www.globalsources.com/gsol/I/Humidifier-filter/p/sm/1151408942.htm#1151408942");
		 final URI uri3=new URI("http://www.globalsources.com/gsol/I/Air-purifier/p/sm/1148078792.htm#1148078792");
		 final URI uri4=new URI("http://peacetar.manufacturer.globalsources.com/si/6008800530472/Homepage.htm?source=CoyName_L1DD&pkg=P6");
		 final URI uri5=new URI("http://www.globalsources.com/gsol/GeneralManager?&catalog_id=2000000003844&design=clean&language=en&page=prodalert/SAMarketing&source=L1%20DD%20Pg&from=follow_me&supplier_id=6008800530472&SAFrom=&pop_host=www.globalsources.com");
		 
		 JLabel back=new JLabel(new ImageIcon("C:\\task\\back.jpeg"));
		 back.setSize(1370,800);
		JFrame order=new JFrame("Supplier");
		order.setContentPane(back);
		order.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		order.getContentPane().setLayout(null);
		order.setSize(1370, 800);
		order.setVisible(true);
		
			JButton button = new JButton("1.Vansen Intellight Manufacturing Co.Ltd");
			button.setBounds(30, 50, 500, 40);
		    button.setHorizontalAlignment(SwingConstants.LEFT);
		    button.setBorderPainted(false);
		    button.setOpaque(false);
		    button.setBackground(Color.WHITE);
		    button.setForeground(Color.white);
		    button.setSize(750, 50);
	        button.setFont(new Font("Times New Roman",Font.BOLD,35));
		    button.setToolTipText(uri.toString());
		    button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					open(uri);
				}
			});
		    order.getContentPane().add(button);
		    order.setVisible(true);
		    
		    JLabel l1=new JLabel("Avg Response Time: More than 72h");
		    l1.setForeground(Color.BLACK);
		    l1.setFont(new Font("Times New Roman",Font.BOLD,20));
		    l1.setBounds(80,100,500,40);
		    order.getContentPane().add(l1);
		    
		    JLabel l2=new JLabel("Location: China (Mainland)");
		    l2.setForeground(Color.BLACK);
		    l2.setFont(new Font("Times New Roman",Font.BOLD,20));
		    l2.setBounds(80,120,500,40);
		    order.getContentPane().add(l2);
		    
		    JButton follow1 = new JButton("",new ImageIcon("C:\\task\\follow.jpg"));
		    follow1.setBounds(50, 160, 80, 40);
		    follow1.setHorizontalAlignment(SwingConstants.LEFT);
		    follow1.setBorderPainted(false);
		    follow1.setOpaque(false);
		    follow1.setBackground(Color.WHITE);
		    follow1.setForeground(Color.CYAN);
		    follow1.setSize(110,20);
		    follow1.setFont(new Font("Times New Roman",Font.BOLD,15));
		    follow1.setToolTipText(uri.toString());
		    follow1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					open(uri1);
				}
			});
		    order.getContentPane().add(follow1);
		    
		    ImageIcon i=new ImageIcon("C:\\task\\img1.jpg");
		    
		    JButton img1=new JButton("Aroma Diffuser",i);
		    img1.setBounds(30, 200, 170, 150);
		    
		    img1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					open(uri2);
				}
			});
		    img1.setVisible(true);
		    order.getContentPane().add(img1);
		    
		    JLabel dsc=new JLabel("Ultra Sonic Aroma");
		    dsc.setForeground(Color.BLACK);
		    dsc.setFont(new Font("Times New Roman",Font.BOLD,20));
		    dsc.setBounds(30,350,500,40);
		    order.getContentPane().add(dsc);
		    JLabel dsc1=new JLabel("Diffuser and Humidifier");
		    dsc1.setForeground(Color.BLACK);
		    dsc1.setFont(new Font("Times New Roman",Font.BOLD,20));
		    dsc1.setBounds(20,375,250,40);
		    order.getContentPane().add(dsc1);
		    
		    ImageIcon i1=new ImageIcon("C:\\task\\img2.jpg");
		    
		    JButton img2=new JButton("Aroma Diffuser",i1);
		    img2.setBounds(300, 200, 140, 150);
		    
		    img2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					open(uri3);
				}
			});
		    img2.setVisible(true);
		    order.getContentPane().add(img2);
		    
		    JLabel ds=new JLabel("Ultra Sonic Aroma");
		    ds.setForeground(Color.BLACK);
		    ds.setFont(new Font("Times New Roman",Font.BOLD,20));
		    ds.setBounds(300,350,500,40);
		    order.getContentPane().add(ds);
		    JLabel ds1=new JLabel("Diffuser and Humidifier");
		    ds1.setForeground(Color.BLACK);
		    ds1.setFont(new Font("Times New Roman",Font.BOLD,20));
		    ds1.setBounds(290,375,250,40);
		    order.getContentPane().add(ds1);
		    
		    JButton button2 = new JButton("2.Peace Target Limited");
			button2.setBounds(30, 430, 250, 40);
		    button2.setHorizontalAlignment(SwingConstants.LEFT);
		    button2.setBorderPainted(false);
		    button2.setOpaque(false);
		    button2.setBackground(Color.WHITE);
		    button2.setForeground(Color.white);
		    button2.setSize(750, 50);
	        button2.setFont(new Font("Times New Roman",Font.BOLD,35));
		    button2.setToolTipText(uri.toString());
		    button2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					open(uri4);
				}
			});
		    order.getContentPane().add(button2);
		    order.setVisible(true);
		    
		    JLabel l3=new JLabel("Avg Response Time: More than 72h");
		    l3.setForeground(Color.BLACK);
		    l3.setFont(new Font("Times New Roman",Font.BOLD,20));
		    l3.setBounds(80,480,500,40);
		    order.getContentPane().add(l3);
		    
		    JLabel l4=new JLabel("Location: Hong Kong SAR");
		    l4.setForeground(Color.BLACK);
		    l4.setFont(new Font("Times New Roman",Font.BOLD,20));
		    l4.setBounds(80,500,500,40);
		    order.getContentPane().add(l4);
		    
		    JButton follow2 = new JButton("",new ImageIcon("C:\\task\\follow.jpg"));
		    follow2.setBounds(50, 550, 80, 40);
		    follow2.setHorizontalAlignment(SwingConstants.LEFT);
		    follow2.setBorderPainted(false);
		    follow2.setOpaque(false);
		    follow2.setBackground(Color.WHITE);
		    follow2.setForeground(Color.CYAN);
		    follow2.setSize(110,20);
		    follow2.setFont(new Font("Times New Roman",Font.BOLD,15));
		    follow2.setToolTipText(uri.toString());
		    follow2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					open(uri5);
				}
			});
		    order.getContentPane().add(follow2);
		    
		    JButton exit=new JButton("",new ImageIcon("C:\\task\\exit.jpg"));
			exit.setBounds(1290,0, 70, 30);
			exit.setHorizontalAlignment(SwingConstants.LEFT);
			exit.setBorderPainted(false);
			exit.setOpaque(false);
			//exit.setBackground(Color.WHITE);
			exit.addActionListener(new ActionListener() {
				
				private JFrame frame;

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					frame=new JFrame("Exit");
					if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Billing System",
							JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
					{
						//System.exit(0);
						order.setVisible(false);
						
					}
				}
			});
			order.getContentPane().add(exit);
	}
	private static void open(URI uri) {
	    if (Desktop.isDesktopSupported()) {
	      try {
	        Desktop.getDesktop().browse(uri);
	      } catch (IOException e) { /* TODO: error handling */ }
	    } else { /* TODO: error handling */ }
}
}
