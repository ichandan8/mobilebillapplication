package mobilebillapplication;
	import java.util.ArrayList;

	import javax.swing.JFrame;

	public class update1 extends JFrame {
		public static void updateInfoData(int index,String tariffplans){
			ArrayList<tarif> list4;
			list4=tarifdatareadwritefromfile.readDataFromFile();
			list4.get(index).settariffplans(tariffplans);
			tarifdatareadwritefromfile.writeDatatoFile(list4);
			
			
		}

	}



