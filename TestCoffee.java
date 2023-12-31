import java.util.Scanner;
import java.util.ArrayList;

public class TestCoffee  {

	public TestCoffee() {
	
		
	}

	public static void main(String[] args) {
		
		int loop = 1;
		int selection;
		Scanner input = new Scanner(System.in);
		

		
		ArrayList<String> drinks = new ArrayList();
		
		
		do {
			System.out.println("Choose one of the coffee menu options: ");
			System.out.println("1. White Chocolate Mocha");
			System.out.println("2. Dark Chocolate Mocha");
			System.out.println("3. Coffee Mocha");
			System.out.println("4. Peppermint Mocha");
			System.out.println("5. Create a new mocha drink");
			System.out.println("6. View the drink list");
			
			selection = input.nextInt();
			
			switch(selection) {
			case 1: 
				WhiteChocolateMocha wcm = new WhiteChocolateMocha(10.0, "Starbucks");
				wcm.prepare();
				drinks.add("White Chocolate Mocha: "+ wcm.ingredients());
				//drinks.add(wcm.ingredients());
				System.out.println();
				
				
				break;
				
			case 2: 
				DarkChocolateMocha dcm = new DarkChocolateMocha(9.0, "Starbucks");
				dcm.prepare();
				drinks.add("Dark Chocolate Mocha: " + dcm.ingredients());
				System.out.println();
				
				break;
				
			case 3:
				CoffeeMocha cm = new CoffeeMocha("Regular mocha", 5.0, "Coffee Bean");
				cm.prepare();
				drinks.add("Coffee Mocha: " + cm.ingredients());
				System.out.println();
				
				break;
				
			case 4:
				PeppermintMocha pm = new PeppermintMocha("Peppermint mocha", 7.0, "Urth Caffe", 5);
				pm.prepare();
				drinks.add("Peppermint Mocha: " + pm.ingredients());
				System.out.println();
				
				break;
				
			case 5: 
				System.out.println("Custom drinks cost $10.00");
				
				
				System.out.println("Provide the name of your new mocha: ");
				String newMocha = input.nextLine();
				newMocha = input.nextLine();
				
				System.out.println("Provide the ingredients needed: ");
				String newIngredients = input.nextLine();
				
				System.out.println("Provide the instructions on how to make it: ");
				String newInstruct = input.nextLine();
				
				CustomCoffee newdrink = new CustomCoffee(newMocha, newIngredients, newInstruct);
				newdrink.prepare();
				drinks.add(newMocha + ": " + newIngredients);
				System.out.println();
				
				
				break;
				
			case 6: 
				
				System.out.println("Your drink list:");
				for (String s: drinks) { //use for each to print ArrayList
					System.out.println(s);
					
				}
				break;
				
			default: 
				System.out.println("That is not a valid selection.");
			}
			
			System.out.println();
			System.out.println("Press 1 to continue or any number to quit.");
			loop = input.nextInt();
			
			
			
		} while(loop == 1);

		System.out.println("Goodbye!");
	}

}
