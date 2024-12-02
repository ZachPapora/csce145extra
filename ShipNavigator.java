//Zachary Papora
import java.util.Scanner;
public class ShipNavigator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		boolean anotherShip = true;	//sees if user wants to enter more ships

		System.out.println("Welcome to Ship Navigator");
		
		while(anotherShip)
		{
			System.out.println("Name of Ship:");
			String name1 = key.nextLine();
			
			System.out.println("Enter the launch date (mm/dd/yyyy):");
			String date1 = key.nextLine();
			
			System.out.println("Is the ship a cruise ship, or a cargo ship: ");
			String type1 = key.nextLine();
			
			if(type1.equalsIgnoreCase("cruise ship"))
			{
				System.out.println("Enter the number of passengers: ");
				int passengers1 = key.nextInt();
				key.nextLine();
				
				System.out.println("Enter how many crew members are on the ship");
				int crew1 = key.nextInt();
				key.nextLine();
				
				CruiseShip cruiseShip1 = new CruiseShip(name1, date1, passengers1, crew1);
				System.out.println("Creating a cruise ship..."
						+ "\nDetails: ");
				System.out.println(cruiseShip1);
			}
			else if(type1.equalsIgnoreCase("cargo ship"))
			{
				System.out.println("Enter the ships tonnage:");
				int tonnage1 = key.nextInt();
				key.nextLine();				//lets user enter input
				
				System.out.println("Enter the maximum speed of the ship (in mph): ");
				double maxSpeed1 = key.nextDouble();
				key.nextLine();					//lets user enter input
				
				CargoShip cargoShip1 = new CargoShip(name1, date1, tonnage1, maxSpeed1);
				System.out.println("Creating Cargo ship...  "
						+ "\nDetails: ");
				System.out.println(cargoShip1);
			}
			else
			{
				System.out.println("Please enter valid type of ship.");
			}
			
			System.out.println("Do you want to enter an additional ship? (Yes/No)");
			String userResponse = key.nextLine();
			
			if(userResponse.equalsIgnoreCase("no"))
			{
				anotherShip = false;
			}
			else
			{
				anotherShip = true;		//not completely sure if else statement is needed here
			}
			
			
		}
		
		System.out.println("Finished!"			
				+ "\nExiting Program");				//final words
		
		key.close();
	}

}
