package mobilebillapplication;

import java.util.ArrayList;

import javax.swing.JFrame;

public class delete extends JFrame {
	 public  static void deleteinfodata(int index)
	 {
	 
	 ArrayList<customerinfo>list5;
		list5=userdatareadwritefromfile.readDataFromFile();
	list5.remove(index);
		userdatareadwritefromfile.writeDatatoFile(list5);	
	 } 

}
