package billing_System;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.Statement;
import java.io.EOFException;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu.Separator;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;

public class bill extends JFrame implements  ActionListener{

	private JPanel contentPane;
JFrame frame=new JFrame("new");
private JTextField ft,ft1,ft2,ft3;


	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill frame = new bill();
					
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		});
	}

	/**
	 * Create the frame.
	 */
	public bill() {
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		init();
		frame.setSize(1370, 800);
				
	}

	private void init() {
		// TODO Auto-generated method stub
		frame=new JFrame();
		
		
		JLabel label = new JLabel(new ImageIcon("C:\\task\\back.jpeg"));
		frame.setContentPane(label);
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);;
		frame.setVisible(true);
		JLabel l=new JLabel(new ImageIcon("C:\\task\\banner4.jpg"));
		l.setBounds(250, 10, 1310, 350);
        frame.getContentPane().add(l);
        
        JLabel l1=new JLabel(new ImageIcon("C:\\task\\banner.jpg"));
		l1.setBounds(200,350, 1200, 350);
        frame.getContentPane().add(l1);
		
		
		double fan=30;
		double fridge=7.1;
		double TV=3.2;
		double mixer=2.1;
		double Tax=0.75;
		
		JButton menu = new JButton("",new ImageIcon("C:\\task\\home.jpg"));
		menu.setBounds(50, 20, 130, 50);
		menu.setBackground(Color.GRAY);
		menu.setForeground(Color.white);
       menu.setFont(new Font("Times New Roman",Font.BOLD,20));
		menu.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.getContentPane().add(menu);
		
		JSeparator sep=new JSeparator(SwingConstants.VERTICAL);
		sep.setBounds(240,0, 300, 1000);
		sep.setForeground(Color.black);
		sep.setBackground(Color.black);
		frame.getContentPane().add(sep);
		
		JSeparator sep1=new JSeparator(SwingConstants.HORIZONTAL);
		sep1.setBounds(0,80, 240, 50);
		sep1.setForeground(Color.black);
		sep1.setBackground(Color.black);
		frame.getContentPane().add(sep1);
		
		
		JButton b1=new JButton("",new ImageIcon("C:\\task\\product.png"));
		b1.setBounds(40, 140, 130, 40);
		b1.setVisible(false);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub
				if(ae.getSource().equals(b1))
				{
					JFrame f=new JFrame("Product_List");
					f.setSize(1380, 800);
					JLabel label = new JLabel(new ImageIcon("C:\\task\\back.jpeg"));
					f.setContentPane(label);
					f.setVisible(true);
					
					JTextArea ta=new JTextArea();
					ta.setFont(new Font("Times New Roman",Font.BOLD,20));
					ta.setBounds(550, 25, 550, 500);
					f.getContentPane().add(ta);
					
					
					
				    JTextField ft=new JTextField();
					ft.setFont(new Font("Times New Roman",Font.BOLD,20));
					ft.setBounds(150, 50,100, 30);
					f.getContentPane().add(ft);
					
					JLabel fl=new JLabel("Cost of Fan");
					fl.setForeground(Color.white);
			        fl.setFont(new Font("Times New Roman",Font.BOLD,20));
					fl.setBounds(280, 50, 150, 30);
					f.getContentPane().add(fl);
					
					JTextField t1=new JTextField();
					t1.setFont(new Font("Times New Roman",Font.BOLD,20));
					t1.setBounds(410, 50,100, 30);
					f.getContentPane().add(t1);
					
					
					JTextField ft1=new JTextField();
					ft1.setFont(new Font("Times New Roman",Font.BOLD,20));
					ft1.setBounds(150, 100,100, 30);
					f.getContentPane().add(ft1);
					
					JLabel fl1=new JLabel("Cost of Fridge");
					fl1.setForeground(Color.white);
			        fl1.setFont(new Font("Times New Roman",Font.BOLD,20));
					fl1.setBounds(280, 100, 150, 30);
					f.getContentPane().add(fl1);
					
					JTextField t2=new JTextField();
					t2.setFont(new Font("Times New Roman",Font.BOLD,20));
					t2.setBounds(410, 100,100, 30);
					f.getContentPane().add(t2);
					
					
					
					
					JTextField ft2=new JTextField();
					ft2.setFont(new Font("Times New Roman",Font.BOLD,20));
					ft2.setBounds(150, 150,100, 30);
					f.getContentPane().add(ft2);
					
					JLabel fl2=new JLabel("Cost of TV");
					fl2.setForeground(Color.white);
			        fl2.setFont(new Font("Times New Roman",Font.BOLD,20));
					fl2.setBounds(280, 150, 150, 30);
					f.getContentPane().add(fl2);
					
					JTextField t3=new JTextField();
					t3.setFont(new Font("Times New Roman",Font.BOLD,20));
					t3.setBounds(410, 150,100, 30);
					f.getContentPane().add(t3);
					
					JTextField ft3=new JTextField();
					ft3.setFont(new Font("Times New Roman",Font.BOLD,20));
					ft3.setBounds(150, 200,100, 30);
					f.getContentPane().add(ft3);
					
					f.addWindowListener(new WindowAdapter() {
						public void windowActivated(WindowEvent we)
						{
							ft.setEnabled(false);
							ft1.setEnabled(false);
							ft2.setEnabled(false);
							ft3.setEnabled(false);
							
						}
					});
					
					JCheckBox cbx1=new JCheckBox("FAN");
					cbx1.setBounds(50, 50, 60, 30);
					cbx1.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(cbx1.isSelected())
							{
								ft.setEnabled(true);
								ft.setText("0");
								ft.requestFocus();
							}
							else
							{
								ft.setEnabled(false);
								ft.setText("");
							}
						}
					});
					f.getContentPane().add(cbx1);
					
					JCheckBox cbx2=new JCheckBox("Fridge");
					cbx2.setBounds(50, 100, 60, 30);
					cbx2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(cbx2.isSelected())
							{
								ft1.setEnabled(true);
								ft1.setText("0");
								ft1.requestFocus();
							}
							else
							{
								ft1.setEnabled(false);
								ft1.setText("");
							}
						}
					});
					f.getContentPane().add(cbx2);
					
					JCheckBox cbx3=new JCheckBox("TV");
					cbx3.setBounds(50, 150, 60, 30);
					cbx3.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(cbx3.isSelected())
							{
								ft2.setEnabled(true);
								ft2.setText("0");
								ft2.requestFocus();
							}
							else
							{
								ft2.setEnabled(false);
								ft2.setText("");
							}
						}
					});
					f.getContentPane().add(cbx3);
					
					JCheckBox cbx4=new JCheckBox("Mixer");
					cbx4.setBounds(50, 200, 60, 30);
					cbx4.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(cbx4.isSelected())
							{
								ft3.setEnabled(true);
								ft3.setText("0");
								ft3.requestFocus();
							}
							else
							{
								ft3.setEnabled(false);
								ft3.setText("");
							}
						}
					});
					f.getContentPane().add(cbx4);
					
					
					
					frame.addWindowListener(new WindowAdapter() {
						public void windowAactivated(WindowEvent we)
						{
							ft.setEnabled(false);
							ft1.setEnabled(false);
							ft2.setEnabled(false);
							ft3.setEnabled(false);
						}
					});
					JLabel fl3=new JLabel("Cost of Mixer");
					fl3.setForeground(Color.white);
			        fl3.setFont(new Font("Times New Roman",Font.BOLD,20));
					fl3.setBounds(280, 200, 150, 30);
					f.getContentPane().add(fl3);
					
					JTextField t4=new JTextField();
					t4.setFont(new Font("Times New Roman",Font.BOLD,20));
					t4.setBounds(410, 200,100, 30);
					f.getContentPane().add(t4);
					
					JLabel fl4=new JLabel("Sub Total");
					fl4.setForeground(Color.white);
			        fl4.setFont(new Font("Times New Roman",Font.BOLD,20));
					fl4.setBounds(50, 400, 150, 30);
					f.getContentPane().add(fl4);
					
					JTextField t5=new JTextField();
					t5.setFont(new Font("Times New Roman",Font.BOLD,20));
					t5.setBounds(150, 400,100, 30);
					f.getContentPane().add(t5);
					
					JLabel fl5=new JLabel("Tax");
					fl5.setForeground(Color.white);
			        fl5.setFont(new Font("Times New Roman",Font.BOLD,20));
					fl5.setBounds(50, 450, 150, 30);
					f.getContentPane().add(fl5);
					
					JTextField t6=new JTextField();
					t6.setFont(new Font("Times New Roman",Font.BOLD,20));
					t6.setBounds(150, 450,100, 30);
					f.getContentPane().add(t6);
					
					JLabel fl6=new JLabel("Total");
					fl6.setForeground(Color.white);
			        fl6.setFont(new Font("Times New Roman",Font.BOLD,20));
					fl6.setBounds(50, 500, 150, 30);
					f.getContentPane().add(fl6);
					
					JTextField t7=new JTextField();
					t7.setFont(new Font("Times New Roman",Font.BOLD,20));
					t7.setBounds(150, 500,100, 30);
					f.getContentPane().add(t7);
					
					
					
					JButton bt1=new JButton("Total Cost");
					bt1.setBounds(50,570, 100, 30);
					bt1.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							double F=fan * Double.parseDouble(ft.getText());
							double Fr=fridge * Double.parseDouble(ft1.getText());
							double T=TV * Double.parseDouble(ft2.getText());
							double M=mixer * Double.parseDouble(ft3.getText());
							
							double sumup=F+Fr+T+M;
							
							double tax=(Tax*sumup)/100;
							
							String S=String.format("£%.2f", sumup);
							t5.setText(S);
							
							String tTax=String.format("£%.2f", tax);
							t6.setText(tTax);
								
							double sumTotal=sumup+tax;
							
							String tTotal=String.format("£%.2f", sumTotal);
							t7.setText(tTotal);
							
							String cstOfF=String.format("£ %.2f", F);
							t1.setText(cstOfF);
							
							String cstOfFr=String.format("£ %.2f", Fr);
							t2.setText(cstOfFr);
							
							String cstOfTv=String.format("£ %.2f", T);
							t3.setText(cstOfTv);
							
							String cstOfM=String.format("£ %.2f", M);
							t4.setText(cstOfM);
						}
					});
					f.getContentPane().add(bt1);
					
					JButton bt2=new JButton("Reset");
					bt2.setBounds(170,570, 100, 30);
					bt2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
							ft.setText(null);
							t1.setText(null);
							ft1.setText(null);
							t2.setText(null);
							ft2.setText(null);
							t3.setText(null);
							ft3.setText(null);
							t4.setText(null);
							t5.setText(null);
							t6.setText(null);
							t7.setText(null);
							ta.setText(null);
							
							cbx1.setSelected(false);
							cbx2.setSelected(false);
							cbx3.setSelected(false);
							cbx4.setSelected(false);
						}
					});
					f.getContentPane().add(bt2);
					
					JButton bt3=new JButton("Receipt");
					bt3.setBounds(290,570, 100, 30);
					bt3.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							 
							// TODO Auto-generated method stub
							String cfan=String.format(ft.getText());
							String cfridge=String.format(ft1.getText());
							String cTv=String.format(ft2.getText());
							String cMixer=String.format(ft3.getText());
							
							String cfanCost=String.format(t1.getText());
							String cfridgeCost=String.format(t2.getText());
							String cTvCost=String.format(t3.getText());
							String cMixerCost=String.format(t4.getText());
							
							String TaxCost=String.format(t5.getText());
							String SubCost=String.format(t6.getText());
							String TotalCost=String.format(t7.getText());
							//*******************************************************************************
							int refs=1325+(int)(Math.random()*4238);
							//*******************************************************************************
							Calendar timer=Calendar.getInstance();
							timer.getTime();
							SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
							tTime.format(timer.getTime());
							SimpleDateFormat tDate=new SimpleDateFormat("dd-MMM-yyyy");
							tDate.format(timer.getTime());
							//**********************************************************************************
							ta.append("\tOnline Billing Systems\n"+
							"Reference:\t\t\t"+refs+
							"\n***********************************************\t"+
							"\nFan:\t"+cfan+ "\t "+ "Cost of Fan:\t   "+cfanCost+
							"\nFridge:\t"+cfridge+ "\t "+ "Cost of Fridge: " +cfridgeCost+
							"\nTV:\t"+cTv+ "\t "+ "Cost of TV:\t   "+cTvCost+
							"\nMixer:\t"+cMixer+ "\t "+ "Cost of Mixer:  "+cMixerCost+
							"\n***********************************************\t"+
							"\nTax:\t............"+TaxCost+
							"\nSub Total:\t............"+SubCost+
							"\nTotal:\t............"+TotalCost+
							"\n***********************************************\t"+
							"\nDate:"+tDate.format(timer.getTime())+
							"\nTime:"+tTime.format(timer.getTime())+
							"\n\n\t\tThank You\n");
						}
					});
					f.getContentPane().add(bt3);
					
					JButton bt4=new JButton("Exit");
					bt4.setBounds(410,570, 100, 30);
					bt4.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							frame=new JFrame("Exit");
							if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Billing System",
									JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
							{
								//System.exit(0);
								f.setVisible(false);
							}
						}
					});
					f.getContentPane().add(bt4);
					
					JButton bt5=new JButton("Print");
					bt5.setBounds(530,570, 100, 30);
					bt5.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
							StringReader sr=new StringReader(ta.getText());
							LineNumberReader lnr=new LineNumberReader(sr);
							Properties p=new Properties();
							PrintJob pj=getToolkit().getPrintJob(frame, "Print Recepit", p);
							if(pj!=null)
							{
								Graphics gr=pj.getGraphics();
								if(gr!=null)
								{
									FontMetrics fm=gr.getFontMetrics();
									int margin=20;
									int pageH=pj.getPageDimension().height-margin;
									int fontH=fm.getHeight();
									int fontDes=fm.getDescent();
									int curH=margin;
									String nextline;
									gr.setFont(f.getFont());
									try
									{
										do
										{
											nextline=lnr.readLine();
											if(nextline!=null)
											{
												if((curH+fontH)>pageH)
												{
													gr.dispose();
													gr=pj.getGraphics();
													curH=margin;
												}
												curH+=fontH;
												if(gr!=null)
												{
													gr.setFont(f.getFont());
													gr.drawString(nextline, margin, curH-fontDes);
													
												}
											}
										}
										while(nextline!=null);
									}
									catch(EOFException eof)
									{
										
									}
									catch (Throwable t) {
										// TODO: handle exception
									}
								}
								gr.dispose();
							}
							if(pj!=null)
							{
								pj.end();
							}
						}
					});
					f.getContentPane().add(bt5);
				}
			}
		});
		
		
		
		frame.getContentPane().add(b1);
		
		
		JButton b2=new JButton("",new ImageIcon("C:\\task\\newcust.jpg"));
		b2.setBounds(60, 100, 90, 80);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JFrame po=new JFrame("Customer Details");
				po.setSize(1380, 800);
				JLabel label = new JLabel(new ImageIcon("C:\\task\\back.jpeg"));
				po.setContentPane(label);
				po.setVisible(true);
				
				JLabel l=new JLabel("Customer Details");
				l.setBounds(70, 70, 350, 30);
				l.setForeground(Color.white);
		        l.setFont(new Font("Times New Roman",Font.BOLD,35));
		        po.getContentPane().add(l);
				
				JLabel l1=new JLabel("Customer Name");
				l1.setBounds(50, 150, 150, 30);
				l1.setForeground(Color.white);
		        l1.setFont(new Font("Times New Roman",Font.BOLD,20));
		        po.getContentPane().add(l1);
		        
		        JTextField t1=new JTextField();
				t1.setFont(new Font("Times New Roman",Font.BOLD,20));
				t1.setBounds(210, 150,150, 30);
				po.getContentPane().add(t1);
				
				JLabel l2=new JLabel("Contact No");
				l2.setBounds(50, 200, 150, 30);
				l2.setForeground(Color.white);
		        l2.setFont(new Font("Times New Roman",Font.BOLD,20));
		        po.getContentPane().add(l2);
		        
		        JTextField t2=new JTextField();
				t2.setFont(new Font("Times New Roman",Font.BOLD,20));
				t2.setBounds(210, 200,150, 30);
				po.getContentPane().add(t2);
				
				JLabel l3=new JLabel("Email id");
				l3.setBounds(50, 250, 150, 30);
				l3.setForeground(Color.white);
		        l3.setFont(new Font("Times New Roman",Font.BOLD,20));
		        po.getContentPane().add(l3);
		        
		        JTextField t3=new JTextField();
				t3.setFont(new Font("Times New Roman",Font.BOLD,20));
				t3.setBounds(210, 250,150, 30);
				po.getContentPane().add(t3);
				
				JLabel l4=new JLabel("Address");
				l4.setBounds(50, 300, 150, 30);
				l4.setForeground(Color.white);
		        l4.setFont(new Font("Times New Roman",Font.BOLD,20));
		        po.getContentPane().add(l4);
		        
		        JTextArea t4=new JTextArea();
				t4.setFont(new Font("Times New Roman",Font.BOLD,20));
				t4.setBounds(210, 300,150, 100);
				po.getContentPane().add(t4);
				
				
				JTextArea ta=new JTextArea();
				ta.setFont(new Font("Times New Roman",Font.BOLD,20));
				ta.setBounds(500, 150, 300, 300);
				po.getContentPane().add(ta);
				
				JButton order=new JButton("Done");
				order.setBounds(50,450, 100, 30);
				order.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent ae) {
						// TODO Auto-generated method stub
						if(ae.getSource().equals(order) && t1.getText().isEmpty() && t2.getText().isEmpty() && t3.getText().isEmpty() && t4.getText().isEmpty())
						{
							JOptionPane.showMessageDialog(null, "Please Insert the Details");
							
						}
						else
						{
							b1.setVisible(true);
							b2.setVisible(false);
							String name=String.format(t1.getText());
							String contact=String.format(t2.getText());
							String eid=String.format(t3.getText());
							String addr=String.format(t4.getText());
							
							
							
							ta.append("        Customer Details\n"+
									"\n***********************************************\t"+
									"\nName:\t"+name+ "\n"+ "Contact:\t   "+contact+
									"\nEmail Id:\t"+eid+"\nAddress:\t"+addr);
						}
							
						
							
					
					}
				});
				po.getContentPane().add(order);
				
				
				
				menu.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						b2.setVisible(true);
						b1.setVisible(false);
					}
				});
				menu.setBounds(20, 20, 180, 50);
				menu.setForeground(Color.white);
		       menu.setFont(new Font("Times New Roman",Font.BOLD,20));
		       
				
				JButton cancel=new JButton("Cancel");
				cancel.setBounds(200,450, 100, 30);
				cancel.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						frame=new JFrame("Exit");
						if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Billing System",
								JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
						{
							//System.exit(0);
							po.setVisible(false);
						}
					}
				});
				po.getContentPane().add(cancel);
				
				
				JButton bt5=new JButton("Print");
				bt5.setBounds(350,450, 100, 30);
				bt5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						StringReader sr=new StringReader(ta.getText());
						LineNumberReader lnr=new LineNumberReader(sr);
						Properties p=new Properties();
						PrintJob pj=getToolkit().getPrintJob(frame, "Print Recepit", p);
						if(pj!=null)
						{
							Graphics gr=pj.getGraphics();
							if(gr!=null)
							{
								FontMetrics fm=gr.getFontMetrics();
								int margin=20;
								int pageH=pj.getPageDimension().height-margin;
								int fontH=fm.getHeight();
								int fontDes=fm.getDescent();
								int curH=margin;
								String nextline;
								//gr.setFont(f.getFont());
								try
								{
									do
									{
										nextline=lnr.readLine();
										if(nextline!=null)
										{
											if((curH+fontH)>pageH)
											{
												gr.dispose();
												gr=pj.getGraphics();
												curH=margin;
											}
											curH+=fontH;
											if(gr!=null)
											{
												//gr.setFont(f.getFont());
												gr.drawString(nextline, margin, curH-fontDes);
												
											}
										}
									}
									while(nextline!=null);
								}
								catch(EOFException eof)
								{
									
								}
								catch (Throwable t) {
									// TODO: handle exception
								}
							}
							gr.dispose();
						}
						if(pj!=null)
						{
							pj.end();
						}
					}
				});
				po.getContentPane().add(bt5);
							
			}
		});
		frame.getContentPane().add(b2);
		
		JButton b3=new JButton("",new ImageIcon("C:\\task\\supplier.png"));
		b3.setBounds(60, 200, 95, 40);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
						try {
							supplier s=new supplier();
						} catch (URISyntaxException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}		
			}
		});
		frame.getContentPane().add(b3);
		
		
		
		JButton b4=new JButton("",new ImageIcon("C:\\task\\logout.png"));
		b4.setBounds(70, 260, 70, 55);
		b4.addActionListener(new ActionListener() {
			
			private JFrame frame1;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame1=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame1, "Confirm if you want to exit","Billing System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
					//frame.setVisible(false);
					
					
				}
			}
		});
		frame.getContentPane().add(b4);
		
		
		
	
		
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	

	

	
	
}
