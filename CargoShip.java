//Zachary Papora
public class CargoShip extends Ship{
	
	private int tonnage;
	private double maximumSpeed;		//remember to keep as double throughout code
	
	public CargoShip()
	{
		super();						//uses variables from ship super class
		this.tonnage = 0;
		this.maximumSpeed = 0.0;
	}
	
	public CargoShip(String nameOfShip, String launchDate, int xTonnage, double xMaximumSpeed)
	{
		super(nameOfShip, launchDate);
		this.setTonnage(xTonnage);
		this.setMaximumSpeed(xMaximumSpeed);
	}
	
	
	public CargoShip(CargoShip copy)
	{
		super(copy.getNameOfShip(),copy.getLaunchDate());
		this.setTonnage(copy.getTonnage());
		this.setMaximumSpeed(copy.getMaximumSpeed());
	}
	
	public void setTonnage(int xTonnage)
	{
		if(xTonnage < 0)
		{
			System.out.println("Tonnage must be greater than or equal to zero");
		}
		else
		{
			this.tonnage= xTonnage;
		}

	}
	
	public void setMaximumSpeed(double xMaximumSpeed)
	{
		if(xMaximumSpeed < 0)
		{
			System.out.println("Maximum speed must be greater than or equal to zero");
		}
		else
		{
			this.maximumSpeed = xMaximumSpeed;
		}
	}
	
	
	
	public int getTonnage()
	{
		return this.tonnage;
	}

	public double getMaximumSpeed()
	{
		return this.maximumSpeed;
	}
	
	
	public String toString()
	{
		return "Cargo Ship name: "+getNameOfShip()+""
				+ "\nLaunch date: "+getLaunchDate()+""
						+ "\nCargo Ship tonnage: " +getTonnage()+""
								+ "\nMaximum Speed: "+getMaximumSpeed()+" mph";
	}
	
	
}
