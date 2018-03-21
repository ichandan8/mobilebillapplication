package mobilebillapplication;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.imageio.IIOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Point;
import java.awt.event.KeyEvent;

public class customerentry extends JFrame {
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l10,l11;
	private JTextField tmobileno,tname,tcallusage1,tcallusage2,tcallusage3,tcallusage4,tsmssent,tAmount;
	private JTextArea taddress;
	private JComboBox ttariffplans;
	//private JComboBox tariffplans;
	private JButton bsave,bshowall,bsearch,update_delete,bamount,bback,bbill;
	//private String sysdate,systime;
	/*private final JMenuBar jmenubar;
	private final JMenu jmenu;
	private final JMenuItem jmenuregisterl,jmenushowall;*/
	
   ArrayList<customerinfo> userlist;
	customerinfo c;
	
	public customerentry(String title)
	{
		super(title);
		Container c=getContentPane();
		c.setLayout(new GridLayout(30,20));
		
		tmobileno=new JTextField(20);
		tname=new JTextField(20);
		tcallusage1=new JTextField(20);
		tcallusage2=new JTextField(20);
		tcallusage3=new JTextField(20);
		tcallusage4=new JTextField(20);
		tsmssent=new JTextField(20);
		taddress=new JTextArea(5,20);
		tAmount=new JTextField(20);
		String tvalue[]=new String[6];
		{
			tvalue[0]="select tariff";
			tvalue[1]="5 in 1 SPORTS PACK";
			tvalue[2]="Blackout Days for SMS + Voice";
			tvalue[3]="For Talkies";
			tvalue[4]="Voice SMS";
			tvalue[5]="Master Plan";
		}
		ttariffplans=new JComboBox(tvalue);
		
		//JScrollPane t=new JScrollPane(taddress);
		/*String dvalue[]=new String[13];
		dvalue[0]="Select TariffPlan";
		dvalue[1]="rs 50";
		dvalue[2]="rs 100";
		dvalue[3]="rs 150";
		dvalue[4]="rs 199";
		dvalue[5]="rs 250";
		dvalue[6]="rs 299";
		dvalue[7]="rs 350";
		dvalue[8]="rs 399";
		dvalue[9]="rs 450";
		dvalue[10]="rs 500";
		dvalue[11]="rs 550";
		dvalue[12]="rs 599";
	
		tariffplans=new JComboBox(dvalue);*/
	
	
			
			
			
			
		
		
	//	JPanel cpanel=new JPanel();
		//cpanel.add(tariffplans);
		
		
		bsave=new JButton("save");
		bsave.addActionListener((e) ->{Unique();});//when we have class in this code
		
		bshowall=new JButton("show all");
		bshowall.addActionListener((e) ->{new showalldata();});//when we don't have our class in our code
		
		bback=new JButton("Back");
		bback.addActionListener((e) ->{new tarifentry(title);});
	  bamount = new JButton("amount");
		bamount.addActionListener((e) ->{calculate();});
		
		bbill=new JButton("BILL");
		bbill.addActionListener((e) ->{new bill();});
		//bclearall=new JButton(;"reset all");
		//bclearall.addActionListener((e) ->{resetFrame();});
		JButton bupdate = new JButton("update");
		bupdate.addActionListener((e) ->{transupd();});
		JButton bdelete = new JButton("delete");
		bdelete.addActionListener((e) ->{transdel();});
		//bsearch=new JButton("search");
		//bsearch.addActionListener((e) ->{transsearch();});
		
		/*update_delete=new JButton("update/delete");
		update_delete.addActionListener((e) ->{new JTableRow();});
		
		/*bsearch=new JButton("search");
		bsearch.addActionListener((e) ->{new search();});*/
		
		Font f=new Font("Copperplate Gothic Bold",Font.BOLD,25);
		 l1=new JLabel("Customer Details ",SwingConstants.CENTER);
		 l1.setFont(f);
		 l1.setForeground(Color.BLUE);
		 Image img=new ImageIcon(this.getClass().getResource("/phone.png")).getImage();
		 l1.setIcon(new ImageIcon(img));
		 Font f1=new Font("comic sans ms",Font.BOLD,14);
		 l2=new JLabel("enter Mobile No:");
		 l2.setFont(f1);
		 l2.setForeground(Color.RED);
		 
		 
		 l3=new JLabel("enter name");
		 l3.setFont(f1);
		 l3.setForeground(Color.RED);
		 
		 
		
		 
	
		 l4=new JLabel("enter address");
		 l4.setFont(f1);
		 l4.setForeground(Color.RED);
		 
		 
		 l5=new JLabel("enter smssent:");
		 l5.setFont(f1);
		 l5.setForeground(Color.RED);
		 
		
		 l6=new JLabel("enter callusage(own network):");
		 l6.setFont(f1);
		 l6.setForeground(Color.RED);
		 

		 l7=new JLabel("enter callusage(other network):");
		 l7.setFont(f1);
		 l7.setForeground(Color.RED);
		 

		 l8=new JLabel("enter callusage(mobile to land line):");
		 l8.setFont(f1);
		 l8.setForeground(Color.RED);
		 

		 l10=new JLabel("enter callusage(STD. ISD):");
		 l10.setFont(f1);
		 l10.setForeground(Color.RED);
		 
		 JLabel l9=new JLabel("choose plan(same as before) ");
		 l9.setFont(f);
		 l9.setForeground(Color.black);
		 
		 l11=new JLabel("total charge.... but please click on amount button");
		 l11.setFont(f1);
		 l11.setForeground(Color.RED);
		 

		 
		/* LocalDate today=LocalDate.now();
		 int day=today.getDayOfMonth();
		 int month=today.getMonthValue();
		 int year=today.getYear();
		 
		 sysdate=day+"/"+month+"/"+year;
		 l7=new JLabel("current date:"+sysdate);
		 LocalTime time=LocalTime.now();
		 int hr=time.getHour();
		 int min=time.getMinute();
		 int sec=time.getSecond();
		 systime=hr+":"+min+":"+sec;
		 l8=new JLabel("current time:"+systime);*/
		 
		 c.add(l1);
		 c.add(l2); c.add(tmobileno);
		 c.add(l3); c.add(tname);
		 c.add(l4); c.add(taddress);
		// c.add(cpanel);
		 c.add(l5); c.add(tsmssent);
		 c.add(l6); c.add(tcallusage1);
		 c.add(l7); c.add(tcallusage2);
		 c.add(l8); c.add(tcallusage3);
		 c.add(l10); c.add(tcallusage4);
		 c.add(l9); c.add(ttariffplans);
		 c.add(l11);c.add(tAmount);
		 /*c.add(l5); 
		 c.add(l6); c.add(cpanel);
		 c.add(l7);
		 c.add(l8);*/
		 c.add(bupdate);
		 c.add(bdelete);
		// c.add(bsearch);
		 c.add(bsave); c.add(bshowall);
		 c.add(bback);
		 c.add(bamount);
		 c.add(bbill);
		// c.add(bclearall);c.add(bsearch);
		 
		 setSize(450,700);
		 setLocation(450,10);
		 setResizable(false);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		 setBackground(Color.YELLOW);
		 
		 
	}
	
	public void createRegObj()
	{
		String mobileno,name,address,tariffplans,smssent,callusage1,callusage2,callusage3,callusage4,Amount;
		mobileno=tmobileno.getText().trim();
		
		name=tname.getText().trim();
		address=taddress.getText().trim();
		smssent=tsmssent.getText().trim();
		callusage1=tcallusage1.getText().trim();
		callusage2=tcallusage2.getText().trim();
		callusage3=tcallusage3.getText().trim();
		callusage4=tcallusage4.getText().trim();
		Amount=tAmount.getText().trim();
		//tariffplans=ttariffplans.getText().trim();
		
		
		String t=(String)ttariffplans.getSelectedItem();
		/*String m=(String)month.getSelectedItem();
		String y=(String)year.getSelectedItem();
		
		
		dob=d+"-"+m+"-"+y;*/
		tariffplans=t;
		c=new customerinfo(mobileno,name,address,tariffplans,smssent,callusage1,callusage2,callusage3,callusage4,Amount);
	}
	public void addInformation()
	{
		createRegObj();
		
		 userlist=userdatareadwritefromfile.readDataFromFile();
		 userlist.add(c);
		 userdatareadwritefromfile.writeDatatoFile(userlist);
		
	    	  JOptionPane.showMessageDialog(this, "details saved succesful");
	     

	     
		 resetFrame();
		 
		
		}
	public void Unique()
	{
		int flag=0;
		String mobileno;
		String data[][];
		ArrayList<customerinfo> list5;
		mobileno=tmobileno.getText().trim();
		list5=userdatareadwritefromfile.readDataFromFile();
		data=new String[list5.size()][3];
		int r=0;
		
		 
	     
	     
		for(customerinfo re: list5)
		{
			data[r][0]=re.getmobileno();
			if((mobileno).equals(data[r][0]))
			{
				flag=1;
				JOptionPane.showMessageDialog(this, "Can't save...\n Enter unique mobile no: ");
				break;
			}
			r++;
		}
		Pattern pattern = Pattern.compile("^[789]\\d{9}$");
	      Matcher matcher = pattern.matcher(mobileno);
		if(flag==0 && matcher.matches() )
		{
			addInformation();
			}
		else{
			JOptionPane.showMessageDialog(this, "invalid no");
		}
		}
	
		

	
	public void resetFrame()
	{
		this.dispose();
		new customerentry("All Details");
		
	}
	public void transdel(){
		String mobileno=JOptionPane.showInputDialog("enter mobileno");
		int k=search.searchmobileno(mobileno);
		delete.deleteinfodata(k);
		//JOptionPane.showMessage
	}
	public void transins()
	{
		String mobileno=JOptionPane.showInputDialog("enter mobileno");
		int k=search.searchmobileno(mobileno);
		createRegObj();
	}
	public void transupd()
	{
		String mobileno=JOptionPane.showInputDialog("enter mobileno to update");
		String name=JOptionPane.showInputDialog("enter name to update");
		String address=JOptionPane.showInputDialog("enter address to update");
		String smssent=JOptionPane.showInputDialog("enter smssent to update");
		String callusage1=JOptionPane.showInputDialog("enter callusage(own network) to update");
		String callusage2=JOptionPane.showInputDialog("enter callusage(other network) to update");
		String callusage3=JOptionPane.showInputDialog("enter callusage(mobile to land line) to update");
		String callusage4=JOptionPane.showInputDialog("enter callusage(STD.ISD) to update");
		int k=search.searchmobileno(mobileno);
		update.updateInfoData(k, mobileno, name,address,smssent,callusage1,callusage2,callusage3,callusage4);
	}
	
	public double calculate()
	{
		int callusage1=0;
		int callusage2=0;
		int callusage3=0;
		int callusage4=0;
		int smssent=0;
		String tariffplans="";
		float total=0.0f;
		
		callusage1=Integer.parseInt(tcallusage1.getText());
		callusage2=Integer.parseInt(tcallusage2.getText());
		callusage3=Integer.parseInt(tcallusage3.getText());
		callusage4=Integer.parseInt(tcallusage4.getText());
		smssent=Integer.parseInt(tsmssent.getText());
		tariffplans=(String)ttariffplans.getSelectedItem();
		if(tariffplans.equals("5 in 1 SPORTS PACK"))
		{
			total=(float) ((112.4/100)*(75+0.25*((double)callusage1)+0.30*((double)callusage2)+0.60*((double)callusage3)+0.75*((double)callusage4)+0.50*((double)smssent)));
			//Amount.setText(total);
			JOptionPane.showMessageDialog(this, "your total charge is "  +  total);
		}
		else if(tariffplans.equals("Blackout Days for SMS + Voice"))
		{
			total=(float) ((112.24/100)*(99+0.20*((double)callusage1)+0.25*((double)callusage2)+0.55*((double)callusage3)+0.70*((double)callusage4)+0.50*((double)smssent)));
			//Amount.setText(total);
			JOptionPane.showMessageDialog(this, "your total charge is"  +  total);
		}
		else if(tariffplans.equals("For Talkies"))
		{
			total=(float) ((112.24/100)*(175+0.15*((double)callusage1)+0.20*((double)callusage2)+0.50*((double)callusage3)+0.65*((double)callusage4)+0.50*((double)smssent)));
			//Amount.setText(total);
			JOptionPane.showMessageDialog(this, "your total charge is"  +  total);
		}
		else if(tariffplans.equals("Voice SMS"))
		{
			total=(float) ((112.24/100)*(275+0.10*((double)callusage1)+0.20*((double)callusage2)+0.45*((double)callusage3)+0.60*((double)callusage4)+0.50*((double)smssent)));
			//Amount.setText(total);
			JOptionPane.showMessageDialog(this, "your total charge is"  +  total);
		}
			else if(tariffplans.equals("Master Plan"))
			{
				total=(float) ((112.24/100)*(275+0.05*((double)callusage1)+0.15*((double)callusage2)+0.40*((double)callusage3)+0.55*((double)callusage4)+0.50*((double)smssent)));
				//Amount.setText(total);
				JOptionPane.showMessageDialog(this, "your total charge is"  +  total);
				
			}	
		return (double) total;
		
	}
	
	
}
	
	
	/*public static void main(String args[])
	{
		new customerentry("Registration1");
	}*/


