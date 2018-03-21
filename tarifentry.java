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
    import javax.swing.ImageIcon;
    import javax.swing.JButton;
	import javax.swing.JComboBox;
	import java.awt.Color;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.JTextArea;
	import java.awt.BorderLayout;
	import java.awt.Container;
	import java.awt.FlowLayout;
	import java.awt.Font;
    import java.awt.Frame;
    import java.awt.GridLayout;
    import java.awt.Image;
    import java.time.LocalDate;
	import java.time.LocalTime;
	import java.util.ArrayList;
	import java.awt.Point;
	import java.awt.event.KeyEvent;
	public class tarifentry extends JFrame {
		private JLabel l1;
		private JComboBox ttariffplans;
		private JButton bregister,bshowall,bclearall,bsearchall,bsearch,bsave,bupdate,bdelete,btariff;
		private final JMenuBar jmenubar;
		private final JMenu jmenu;
		private final JMenuItem jmenuregister,jmenushowall,jmenusearch,jmenuupdate,jmenudelete;
	   ArrayList<tarif> userlist;
		tarif c;
		public tarifentry(String title)
		{
			super(title);
			Container c=getContentPane();
			c.setLayout(new GridLayout(20,8));
			Container h=getContentPane();
			h.setLayout(new GridLayout(20,8));

			jmenubar=new JMenuBar();
			jmenu=new JMenu("ADMIN");
			jmenu.setMnemonic(KeyEvent.VK_M );
			
			jmenuregister=new JMenuItem("add customer details");
			jmenuregister.setMnemonic(KeyEvent.VK_R);
			jmenuregister.setToolTipText("add customer details");
			jmenuregister.addActionListener((e)->{new customerentry(title);});
			jmenushowall=new JMenuItem("Show All customer details");
			jmenushowall.setMnemonic(KeyEvent.VK_A);
			jmenushowall.addActionListener((e)->{new showalldata();});
			jmenusearch=new JMenuItem("Search");
			jmenusearch.setMnemonic(KeyEvent.VK_S);
			jmenushowall.addActionListener((e)->{new update();});
			jmenuupdate=new JMenuItem("Update");
			jmenuupdate.setMnemonic(KeyEvent.VK_U);
			jmenushowall.addActionListener((e)->{new delete();});
			jmenudelete=new JMenuItem("Delete");
			jmenudelete.setMnemonic(KeyEvent.VK_D);
			jmenushowall.addActionListener((e)->{new search();});
			JMenu jmenu1 = new JMenu("USER");
			jmenu1.setMnemonic(KeyEvent.VK_M );
			JMenuItem jmenuregister1 = new JMenuItem("Generate yr bill");
			jmenuregister1.setMnemonic(KeyEvent.VK_R);
			jmenuregister1.setToolTipText("Generate yr bill");
			jmenuregister1.addActionListener((e)->{new bill();});
			
			jmenu.add(jmenuregister);
			jmenu.add(jmenushowall);
			jmenu1.add(jmenuregister1);
		
			//jmenu.add(jmenusearch);
			//jmenu.add(jmenuupdate);
			//jmenu.add(jmenudelete);
			
			
			jmenubar.add(jmenu1);
			jmenubar.add(jmenu);
			setJMenuBar(jmenubar);
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
			
			bsave=new JButton("save");
			bsave.addActionListener((e) ->{Unique();});//when we have class in this code
			
			bshowall=new JButton("Show All");
			bshowall.addActionListener((e) ->{new showalldata1();});
			
			bupdate=new JButton("Update");
			bupdate.addActionListener((e) ->{trans_upd();});
			
			
			bdelete=new JButton("Delete");
			bdelete.addActionListener((e) ->{trans_del();});
			
			btariff=new JButton("VIEW PLANS");
			btariff.addActionListener((e)  ->{new tarifftable();});
			
			//JButton bnext = new JButton("next");
			//bnext.addActionListener((e) ->{new customerentry(title);});
			
			
			//when we don't have our class in our code
			  
			
		/*bsearch=new JButton("Search");
			bsearch.addActionListener((e)  ->{trans_ins();});
			
			
			bclearall=new JButton("reset all");
			bclearall.addActionListener((e) ->{resetFrame();});*/
			
			//update_delete=new JButton("update/delete");
			//update_delete.addActionListener((e) ->{new JTableRow();});
			
			/*bsearch=new JButton("search");
			bsearch.addActionListener((e) ->{new search();});*/
			
			Font f=new Font("Copperplate Gothic Bold",Font.BOLD,25);
			 l1=new JLabel("java telecome services ",SwingConstants.CENTER);
			 l1.setFont(f);
			 l1.setForeground(Color.blue);
			 Image img=new ImageIcon(this.getClass().getResource("/phone.png")).getImage();
			 l1.setIcon(new ImageIcon(img));
			JLabel l2=new JLabel("please choose ur plan ");
			 l2.setFont(f);
			 l2.setForeground(Color.red);
			 
			 
	

			 
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
			 c.add(l2); c.add(ttariffplans);
		
			 // c.add(bnext);
			 /*c.add(l5);
			 c.add(l6);
			 /*c.add(l5); 
			 c.add(l6); c.add(cpanel);
			 c.add(l7);
			 c.add(l8);*/
			// c.add(update_delete);
			 
			 c.add(bsave); c.add(bshowall);
			 c.add(bdelete);c.add(bupdate);
			 c.add(btariff);
			// c.add(bsearch);
			// c.add(search);
			// c.add(bclearall);c.add(bsearch);
			 
			 setSize(450,700);
			 setLocation(450,10);
			 setResizable(false);
			 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 setVisible(true);
			 setBackground(Color.RED);
			 
		}
		
		public void createRegObj()
		{
			String tariffplans;
			String t=(String)ttariffplans.getSelectedItem();
			

			JOptionPane.showMessageDialog(this, "operation sucessful...");
			
			//String t=(String)tariffplans.getSelectedItem();
			/*String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			
			
			dob=d+"-"+m+"-"+y;*/
			tariffplans=t;
			c=new tarif(tariffplans);
		}
		public void addInformation()
		{
			createRegObj();
			 userlist=tarifdatareadwritefromfile.readDataFromFile();
			 userlist.add(c);
			 tarifdatareadwritefromfile.writeDatatoFile(userlist);
			 
			 
			 resetFrame();
			 
			
			}
		public void Unique()
		{
			int flag=0;
			String tariffplans;
			String data[][];
			ArrayList<tarif> list;
			//ttariffplans=ttariffplans.gettext().trim();
			list=tarifdatareadwritefromfile.readDataFromFile();
			data=new String[list.size()][3];
			int r=0;
			for(tarif x: list)
			{
				data[r][0]=x.gettariffplans();
				
				r++;
			}
			if(flag==0)
			{
				addInformation();
				}
			}

		
		public void resetFrame()
		{
			this.dispose();
			new tarifentry("tariff Details");
			
		}
		public void trans_del(){
			String tariffplans=JOptionPane.showInputDialog("enter tariff");
			int k=search1.searchtariffplans(tariffplans);
			delete1.deleteinfodata(k);
			//JOptionPane.showMessageDialog(this, "attempt sucessful...");
		}
		public void trans_ins()
		{
			String tariffplans=JOptionPane.showInputDialog("enter tariff");
			int k=search1.tariffplans(tariffplans);
			createRegObj();
		}
		public void trans_upd()
		{
			String tariffplans=JOptionPane.showInputDialog("enter tariff to update");
		
			int k=search1.tariffplans(tariffplans);
			update1.updateInfoData(k, tariffplans);
		}
		public static void main(String[] args)
		{
			new tarifentry("java telecome services");
			
			}
	}



