package mobilebillapplication;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
public class bill extends JFrame{
	
	public bill()
	{
		super("BILL");
		Font f=new Font("Copperplate Gothic Bold",Font.BOLD,25);
		 JLabel l1 = new JLabel("Customer Details ");
		 l1.setFont(f);
		 l1.setForeground(Color.BLUE);
		 Image img=new ImageIcon(this.getClass().getResource("/phone.png")).getImage();
		 l1.setIcon(new ImageIcon(img));
		 JButton print=new JButton("print");
			print.addActionListener((e) ->{new print();});;
		String mobileno=JOptionPane.showInputDialog("enter mobileno");
		String heading[]= {"Mobile no","Name","Address","smssent","callusage(own network)","callusage(other network)","callusage(mobile to landline)","callusage(STD.ISD)","tariffplan","Amount"};
		String data[][]=new String[1][10];
		//String mobileno=tmobileno.getText().trim();
		
		ArrayList<customerinfo> list=userdatareadwritefromfile.readDataFromFile();
		int flag=0;
		int r=0;
		for(customerinfo re:list)
		{	
			if((re.getmobileno()).equals(mobileno))
			{	flag=1;
			
				data[r][0]=re.getmobileno();
				data[r][1]=re.getName();                              
				data[r][2]=re.getAddress();
				data[r][3]=re.getsmssent();
				data[r][4]=	re.getcallusage1();							
				data[r][5]=re.getcallusage2();	
				data[r][6]=re.getcallusage3();
				data[r][7]=re.getcallusage4();
				data[r][8]=re.gettariffplans();
				data[r][9]=re.getAmount();
				break;
			}		
					
		}
		if(flag==0)
			JOptionPane.showMessageDialog(this,"UNSUCCESSFUL");
		Container con=getContentPane();
		con.setLayout(new BorderLayout());
		JTable datatable=new JTable(data,heading);
		JScrollPane jsp=new JScrollPane(datatable);
	
		con.add(jsp,BorderLayout.CENTER);
	con.add(l1,BorderLayout.NORTH);
	con.add(print,BorderLayout.EAST);
		setSize(850,200);
		setLocation(200,200);
		setVisible(true);
	

	}
}



