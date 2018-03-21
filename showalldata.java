package mobilebillapplication;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

public class showalldata extends JFrame {
	
	public showalldata()
	{
		super("showAll");   //calling the jframe which is the base class
		String heading[]={"Mobile no","Name","Address","smssent","callusage(own network)","callusage(other network)","callusage(mobile to landline)","callusage(STD.ISD)","tariffplan","Amount"};
		String data[][];
		ArrayList<customerinfo> list5;
		try
		{
			list5=userdatareadwritefromfile.readDataFromFile();
			data=new String[list5.size()][10];
			int r=0;
			for(customerinfo x1: list5)
			{
				data[r][0]=x1.getmobileno();
				data[r][1]=x1.getName();
				data[r][2]=x1.getAddress();
				data[r][3]=x1.getsmssent();
				data[r][4]=x1.getcallusage1();
				data[r][5]=x1.getcallusage2();
				data[r][6]=x1.getcallusage3();
				data[r][7]=x1.getcallusage4();
				data[r][8]=x1.gettariffplans();
				data[r][9]=x1.getAmount();
				r++;
				
			}
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data,heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("All Registration Details"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);
			
			setSize(850, 300);
			setLocation(200,200);
			setVisible(true);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
