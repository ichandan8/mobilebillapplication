package mobilebillapplication;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;
	public class tarifdatareadwritefromfile
	{
		public static ArrayList<tarif> readDataFromFile(){
			ArrayList<tarif> list4;
			try
			{
				FileInputStream fin=new FileInputStream("Record1.txt");
				ObjectInputStream oin=new ObjectInputStream(fin);
				list4=(ArrayList<tarif>)oin.readObject();
				
				oin.close();
				fin.close();
						
			}catch(Exception e)
			{
				list4=new ArrayList<tarif>();
			}
			return list4;
		   }
		public static void writeDatatoFile(ArrayList<tarif>wlist)
		{
			try{
				FileOutputStream fout=new FileOutputStream("Record1.txt");
				ObjectOutputStream oout=new ObjectOutputStream(fout);
				oout.writeObject(wlist);
				oout.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}












