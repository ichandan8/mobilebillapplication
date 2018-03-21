package mobilebillapplication;


	import java.io.Serializable;

	public class tarif implements Serializable 
	{

			private String tariffplans;
			
			
			public tarif (String tariffplans){
				super();
				this.tariffplans=tariffplans;
				
			}
			public tarif()
			{
				
			}
			public String gettariffplans()
			{
				return tariffplans;
			}
			public void settariffplans(String tariffplans)
			{
				this.tariffplans=tariffplans;
			}
			
		}






