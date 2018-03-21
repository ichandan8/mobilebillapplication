package mobilebillapplication;

import java.io.Serializable;

public class customerinfo implements Serializable {

	private String mobileno;
	private String name;
	private String address;
	private String tariffplans;
	private String callusage1;
	private String callusage2;
	private String callusage3;
	private String callusage4;
	private String smssent;
	private String Amount;
	public customerinfo(String mobileno,String name,String address,String tariffplans,String smssent,String callusage1,String callusage2,String callusage3,String callusage4,String Amount){
		super();
		this.mobileno=mobileno;
		this.name=name;
		this.address=address;
		this.callusage1=callusage1;
		this.smssent=smssent;
		
		this.callusage2=callusage2;
		this.callusage3=callusage3;
		this.callusage4=callusage4;
	this.tariffplans=tariffplans;
	this.Amount=Amount;
	}
	public customerinfo()
	{
		
	}
	public String getmobileno()
	{
		return mobileno;
	}
	public void setmobileno(String mobileno)
	{
		this.mobileno=mobileno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getcallusage1()
	{
		return callusage1;
	}
	public void setcallusage1(String callusage1)
	{
		this.callusage1=callusage1;
	}
	public String getsmssent()
	{
		return smssent;
	}
	public void setsmssent(String smssent)
	{
		this.smssent=smssent;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String gettariffplans()
	{
		return tariffplans;
	}
	public void settariffplans(String tariffplans)
	{
		this.tariffplans=tariffplans;
	}
	
	public String getcallusage2()
	{
		return callusage2;
	}
	public void setcallusage2(String callusage2)
	{
		this.callusage2=callusage2;
	}
	public String getcallusage3()
	{
		return callusage3;
	}
	public void setcallusage3(String callusage3)
	{
		this.callusage3=callusage3;
	}
	public String getcallusage4()
	{
		return callusage4;
	}
	public void setcallusage4(String callusage4)
	{
		this.callusage4=callusage4;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String Amount)
	{
		this.Amount=Amount;
	}
}

