package mobilebillapplication;
import java.util.ArrayList;

	import javax.swing.JFrame;

	public class delete1 extends JFrame {
		 public  static void deleteinfodata(int index)
		 {
		 
		 ArrayList<tarif>list4;
			list4=tarifdatareadwritefromfile.readDataFromFile();
		list4.remove(index);
			tarifdatareadwritefromfile.writeDatatoFile(list4);	
		 } 

	}


