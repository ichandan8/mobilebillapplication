package mobilebillapplication;

//import java.awt.List;
import java.util.ArrayList;

import javax.swing.JFrame;
public class search extends JFrame {
public static int searchmobileno(String mobileno)

{
	ArrayList<customerinfo> list5;
	int f=-1;
	try
	{
		list5=userdatareadwritefromfile.readDataFromFile();
		for(int p=0;p<list5.size();p++)
			
			if(mobileno.equalsIgnoreCase(list5.get(p).getmobileno()))
			{
				f=p;
				
				break;
			}
		return(f);
	}
	catch(Exception e)
	{
		System.out.println(e);
		return(-2);
		
			}
	}
}
	
	
