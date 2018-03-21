package mobilebillapplication;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import java.awt.BorderLayout;
	import java.awt.Container;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
	import java.util.ArrayList;

	public class showalldata1 extends JFrame {
		
		


		public showalldata1()
		{
			super("Display All");   //calling the frame which is the base class
			String heading[]={"tarifplans"};
			String data[][];
			ArrayList<tarif> list4;

			
			try
			{
				list4=tarifdatareadwritefromfile.readDataFromFile();
				data=new String[list4.size()][1];
				int r=0;
				for(tarif x: list4)
				{
					data[r][0]=x.gettariffplans();
					r++;
					
				}
				Container con=getContentPane();
				con.setLayout(new BorderLayout());
				
				JTable datatable=new JTable(data,heading);
				JScrollPane jsp=new JScrollPane(datatable);
				
			       
				
				 
				con.add(new JLabel("All tariff Details"),BorderLayout.NORTH);
				con.add(jsp,BorderLayout.CENTER);
				
			
			 

				
				setSize(850, 400);
				setLocation(200,200);
				setVisible(true);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}


			
			
		}
	}

		




