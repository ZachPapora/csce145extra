//Zachary Papora
public class Ship {		//this is the super class
	
	private String nameOfShip;
	private String launchDate;
	
	public Ship()
	{
		this.nameOfShip = "no name yet";
		this.launchDate = "mm/dd/yyyy";
	}
	
	public Ship(String xNameOfShip, String xLaunchDate)
	{
		this.setNameOfShip(xNameOfShip);
		this.setLaunchDate(xLaunchDate);
	}

	public void setNameOfShip(String xNameOfShip)
	{
		if (xNameOfShip != null)
		{
			this.nameOfShip = xNameOfShip;
		}
		else
		{
			System.out.println("Enter valid name of ship");
		}
	}
	
	public void setLaunchDate(String xLaunchDate)
	{
		String yearCheck = xLaunchDate.substring(6);	//takes only yyyy out of mm/dd/yyyy format
		
		int year = Integer.parseInt(yearCheck);
		
		if(year  < 1990 || year > 2019)		
		{
			System.out.println("Year is out of range!");
		}
		else			//inclusive to 1990 and 2019
		{ 
			this.launchDate = xLaunchDate;
		}
	}
	
	
	
	public String getNameOfShip()
	{
		return this.nameOfShip;
	}
	
	public String getLaunchDate()
	{
		return this.launchDate;
	}
	
	public String toString()
	{
		return "The name of the ship is: "+this.nameOfShip+"\nAnd the launch date is: "+this.launchDate;
	}
}
