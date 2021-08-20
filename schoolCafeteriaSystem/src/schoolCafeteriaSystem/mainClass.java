package schoolCafeteriaSystem;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainClass {
	
	
	
	
	public static void main(String[] args) {
		
		
		card newCard = new card(0.0);
		Console console = System.console();
		if (console != null) {
		System.out.println("Welcome to the Cafeteria System \nPlease Enter your first name and your last name");
		Scanner scanner = new Scanner(console.reader());
		String firstName = scanner.nextLine();
		String lastName = scanner.nextLine();
		System.out.println("What is your gender?");
		String gender = scanner.nextLine();
		student newStudent = new student(firstName, lastName, gender);
		
		
		System.out.println("Welcome " + firstName + " \nWould you like to enroll for a cafeteria card? Y/ N");
		String answer  = scanner.nextLine();
		if(answer.equalsIgnoreCase("Y")){
			System.out.println("Please enter the amount you would like to top up your card");
			String topUpBalance = scanner.nextLine();
			Double balancedbl = Double.parseDouble(topUpBalance);
			newCard.setBalance(balancedbl);
			System.out.println("You have topped up "+balancedbl+" to your card. \nYou can now use it to buy food items in the cafeteria \nClick M to see the  cafeteria menu, B to check your balance, T to top up again or E to exit the system");
			
			
		}else if(answer.equalsIgnoreCase("N")){
			System.out.println("Thank you for your time. Come back again");
			
		}
	
		String responseStr = scanner.nextLine();
		if(responseStr.equalsIgnoreCase("M")){
			ArrayList<item> cafeteriaMenu = new ArrayList<item>();
			cafeteriaMenu.add(new item("Tea", 40.0));
			cafeteriaMenu.add(new item("Coffee", 50.0));
			cafeteriaMenu.add(new item("Indian Pancakes", 70.0));
			cafeteriaMenu.add(new item("Omelette", 150.0));
			cafeteriaMenu.add(new item("Fried Eggs", 100.0));
			cafeteriaMenu.add(new item("Biscuits", 20.0));
			
		for(int i=0; i< cafeteriaMenu.size(); i++) {
			System.out.print(cafeteriaMenu.get(i)+"\n");;
		}
		System.out.print("Would you like to purchase something from the caferetia?Y/N");
		String menuResponse = scanner.nextLine();
		if (menuResponse.equalsIgnoreCase("Y")) {
				System.out.print("Enter the item from the list that you would like to purchase");
				String order = scanner.nextLine();
				if(order.equalsIgnoreCase("Tea")) {
					
					
				}
				
			
		}else if(menuResponse.equalsIgnoreCase("N")) {
			System.out.println("Thank you. Come back again");
		}
		
		
		
			
			
			
			
			
		}else if(responseStr.equalsIgnoreCase("B")) {
			
			System.out.print("Your card balance is " +newCard.getBalance());
			
		}else if(responseStr.equalsIgnoreCase("T")){
			System.out.println("How much do you want to top up?");
			String newTopUp = scanner.nextLine();
			Double newTopUpdbl = Double.parseDouble(newTopUp);	
			newCard.setBalance(newTopUpdbl + newCard.getBalance());
			System.out.println("You have topped up " +newTopUpdbl+ ". Your new balance is "+ newCard.getBalance());
			
		}else if(responseStr.equalsIgnoreCase("E")) {
			System.exit(0);
		}
		
		
		}else {
			System.out.println("Console is not available");
		}
		 
		
	}
}
