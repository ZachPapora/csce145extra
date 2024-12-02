//Zachary Papora
public class CruiseShip extends Ship{
	
	private int passengerCapacity;
	private int crewMembers;
	
	public CruiseShip()
	{
		super();					//uses variables from Ship class
		this.passengerCapacity = 0;
		this.crewMembers = 0;
	}
	
	public CruiseShip(String nameOfShip, String launchDate, int xPassengerCapacity, int xCrewMembers)
	{
		super(nameOfShip, launchDate);
		this.setPassengerCapacity(xPassengerCapacity);
		this.setCrewMembers(xCrewMembers);
	}
	
	public CruiseShip(CruiseShip copy)
	{
		super(copy.getNameOfShip(), copy.getLaunchDate());
		this.setPassengerCapacity(copy.getPassengerCapacity());
		this.setCrewMembers(copy.getCrewMembers());
	}
	
	public void setPassengerCapacity(int xPassengerCapacity)
	{
		if(xPassengerCapacity < 0)
		{
			System.out.println("Number of passengers must be positive");
		}
		else
		{
			this.passengerCapacity = xPassengerCapacity;
		}
	}
	
	public void setCrewMembers(int xCrewMembers)
	{
		if(xCrewMembers < 0)
		{
			System.out.println("Number of crew members must be posotive");
		}
		else
		{
			this.crewMembers = xCrewMembers;
		}
	}
	
	
	public String toString()
	{
		return "CruiseShip Name: "+getNameOfShip()+"\nNumber of passengers: " +passengerCapacity+"\nNumber of crew members: "+crewMembers;
	}
	
	
	public int getPassengerCapacity()
	{
		return this.passengerCapacity;
	}
	
	public int getCrewMembers()
	{
		return this.crewMembers;
	}

}
