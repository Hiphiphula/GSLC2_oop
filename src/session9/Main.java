package session9;

import java.util.ArrayList;
import java.util.Scanner;

/*
the differences between abstract and interface:

1. Abstract uses abstract keyword and extends to declare and inherit its attributes, whereas interface uses interface keyword and implements. 

2. Abstract can have both abstract and non abstract methods. On the other hand, interface can only have abstract methods. 

3. Abstract has a constructor. Interface does not have a constructor. 
 */


// My program is vehicle rental application. the program can record the vehicle rented, show the rent details, and return the vehicles.
// To exit this program, users need to return all the rented vehicles first. 

public class Main {

	public static ArrayList<Details> rentlist = new ArrayList<>();
	static int count = 0;
	static transportations tr; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int input = 0;
		
		
		
		do { //the menu
			System.out.println("Transportation Rental");
			System.out.println("1. Rent a vehicle");
			System.out.println("2. Show rented vehicle and the rent cost");
			System.out.println("3. Return vehicle");
			System.out.println("4. Exit");
			System.out.print("Choose menu:  ");
			input = scan.nextInt();
			
			
			if(input == 1) //rent a vehicle
			{
				rentTr();
				
			}
			else if(input == 2) //show rented vehicles details
			{
				if(count != 0)
				{
					int i = 0;
					for(Details bt : rentlist)
					{
						++i;
						//here is the implementation of the interface.
						System.out.println(i + ". Type: " + bt.printType());
						System.out.println("Model: " + bt.getmodel());
						System.out.println("Year: " + bt.getyear());
						System.out.println("Cost: Rp" + bt.rentCost());
						System.out.println();
					}
					
					System.out.printf("\n\n\n");
					
					i = 0;
				}
				else//if there is no transportation rented
				{
					System.out.println("You haven't rented any vehicles");
					System.out.println("\n\n");
				}
			}
			else if (input == 3) //RETURN VEHICLES
			{
				if(count == 0) { //if there is no transportation rented
					System.out.println("You haven't rented any vehicles");
					System.out.printf("\n\n\n");
				}
				else
				{
					int i = 0;
					
					for(Details bt : rentlist)
					{
						++i;
						//here is the implementation of the interface.
						System.out.println(i + ". Type: " + bt.printType());
						System.out.println("Model: " + bt.getmodel());
						System.out.println("Year: " + bt.getyear());
						System.out.println("Cost: " + bt.rentCost());
						System.out.println();
					}
					
					do
					{
						System.out.println("Return vehicles: ");
						i = scan.nextInt();
						System.out.println();
					}while(i < 0 || i > count);
					
					
					rentlist.remove(i-1);
					--count;
					System.out.println("The vehicle is returned");
					
					
				}
			}
			else if(input == 4) //exit the program
			{
				if (rentlist!= null) //if the list is not null,
				{
					System.out.println("Please return all the vehicles first");
				}
				else //if the list is empty
				{
					System.out.println("thank you for your patronage!");
				}
			}
			
		}while(input <= 4 && input >= 1);
		

	}
	
	
	public static void rentTr()
	{
		Scanner sc = new Scanner(System.in);
		int trans;
		String model;
		int year;
		int days;
		
		
		do
		{
			System.out.println("Select your transportation: ");
			System.out.println("1. Car");
			System.out.println("2. Van");
			System.out.println("3. Motorcycles");
			System.out.println("4. Campervan");
			System.out.print("Your choice: ");
			trans = sc.nextInt();
			System.out.println();
			
		}while(trans < 1 && trans > 4);
		
		sc.nextLine();
//		This is followed by the respective dummy inputs:
		System.out.println("Model: "); //Chevrolet Corvette
		model = sc.nextLine();
		System.out.println("Production Year: "); //2022
		year = sc.nextInt();
		System.out.println("For how many days: ");// 49
		days = sc.nextInt();
		
		switch(trans) 
		{
			case 1:
				tr = new Car(model, year, days);
				break;
				
			case 2:
				tr = new Van(model, year, days);
				break;
			
			case 3:
				tr = new Motorcycle(model, year,days);
				break;
			
			case 4:
				tr = new CamperVan(model, year, days);
				break;
		}
		
		rentlist.add((Details) tr);
		++count;
		System.out.println("Recorded!");
		System.out.printf("\n\n\n\n");
	}
	
	

}
