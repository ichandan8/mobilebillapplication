package mobilebillapplication;

import java.util.ArrayList;

import javax.swing.JFrame;

public class update extends JFrame {
	public static void updateInfoData(int index,String mobileno,String name,String address,String smssent,String callusage1, String callusage2, String callusage3, String callusage4){
		ArrayList<customerinfo> list5;
		list5=userdatareadwritefromfile.readDataFromFile();
		list5.get(index).setmobileno(mobileno);
		list5.get(index).setName(name);
		list5.get(index).setAddress(address);
		list5.get(index).setsmssent(smssent);
		list5.get(index).setcallusage1(callusage1);
		list5.get(index).setcallusage2(callusage2);
		list5.get(index).setcallusage3(callusage3);
		list5.get(index).setcallusage4(callusage4);
		//list1.get(index).setAmount(Amount);
		
		userdatareadwritefromfile.writeDatatoFile(list5);
		
		
	}

}
