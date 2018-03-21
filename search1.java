package mobilebillapplication;



	//import java.awt.List;
	import java.util.ArrayList;

	import javax.swing.JFrame;
	public class search1 extends JFrame {
	public static int searchmobileno(String mobileno)

	{
		ArrayList<tarif> list4;
		int f=-1;
		try
		{
			list4=tarifdatareadwritefromfile.readDataFromFile();
			for(int p=0;p<list4.size();p++)
				
				if(mobileno.equalsIgnoreCase(list4.get(p).gettariffplans()))
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

	public static int tariffplans(String tariffplans) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int searchtariffplans(String tariffplans) {
		// TODO Auto-generated method stub
		return 0;
	}
	}
		
		


