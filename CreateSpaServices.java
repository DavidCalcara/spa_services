import java.util.Scanner;

public class CreateSpaServices 
{
	public static void main(String[] args)
	{
		// Declare variables to hold values from keyboard
		String service;
		double price;
		//Declare Objects
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		Scanner keyboard = new Scanner(System.in);
		// User prompts that gives input from the user to the variables
		System.out.print("Enter service >> ");
		service = keyboard.nextLine();
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();
		// Set value from user as the value for the object data
		firstService.setServiceDescription(service);
		firstService.setPrice(price);

		keyboard.nextLine();
		System.out.print("Enter service >> ");
		service = keyboard.nextLine();

		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();
		// Set value from user as the value for the object data
		secondService.setServiceDescription(service);
		secondService.setPrice(price);
		
		//------------ Output Statements ---------------
		System.out.println("First service details:");
		System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

		System.out.println("Second service details:");
		System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

	}
}