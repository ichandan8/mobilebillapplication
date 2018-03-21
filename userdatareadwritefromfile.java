package mobilebillapplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class userdatareadwritefromfile {
	public static ArrayList<customerinfo> readDataFromFile(){
		ArrayList<customerinfo> list5;
		try
		{
			FileInputStream fin=new FileInputStream("Record2.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list5=(ArrayList<customerinfo>)oin.readObject();//use to typecast
			
			oin.close();
			fin.close();
					
		}catch(Exception e)
		{
			list5=new ArrayList<customerinfo>();
		}
		return list5;
	}
	public static void writeDatatoFile(ArrayList<customerinfo>wlist)
	{
		try{
			FileOutputStream fout=new FileOutputStream("Record2.txt");
			ObjectOutputStream oout=new ObjectOutputStream(fout);
			oout.writeObject(wlist);
			oout.close();
			fout.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
