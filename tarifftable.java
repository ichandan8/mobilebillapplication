package mobilebillapplication;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class tarifftable extends JFrame {
	public tarifftable(){
		super("ALL TARIFF DETAIL");   //calling the jframe which is the base class
		String[] columnNames = {"S.No","Name",
                "tariff charge",
                "sms charge",
                "call charge(own network)",
                "call charge(other network)",
                 "call charge(mobile to landline)",
                 "call charge(STD.ISD)"};
	
		
			
			
		Object[][] data = {
			    {"1","5 in 1 SPORTS PACK","75",
			     "0.50/sms","0.25/min","0.30/min","0.60/min","0.75/min" },
			    {"2","Blackout Days for SMS + Voice"
			    	,"99",
				     "0.50/sms","0.20/min","0.25/min","0.55/min","0.70/min"},
			    {"3","For Talkies","150",
					     "0.50/sms","0.15/min","0.20/min","0.50/min","0.65/min"},
			    {"4","Voice SMS","199",
						     "0.50/sms","0.10/min","0.15/min","0.45/min","0.60/min"},
			    {"5", "Master Plan","250",
							     "0.50/sms","0.05/min","0.10/min","0.40/min","1.15/min"}
			};
		
				
			
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			
			
			JTable datatable = new JTable(data, columnNames);
			JScrollPane jsp=new JScrollPane(datatable);
			
			
			con.add(new JLabel("All Tariff Details"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);
			
			setSize(850, 300);
			setLocation(200,200);
			setVisible(true);
		}
	

	}


