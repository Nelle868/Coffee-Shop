
public class CoffeeMocha extends Coffee{

	public CoffeeMocha() {
		super();
	}

	public CoffeeMocha(String type, double cost, String name) {
		super(type, cost, name);
	}
	
	// ***** Abstract Methods ***** //
	
	public String ingredients() {
		return "sugar, milk, regular chocolate powder, espresso";
	}
	
	public String howToMakeCoffee() {
		return "Warm the milk, make the espresso, then stir together with sugar and regular chocolate powder and enjoy!";
	}
	
	@Override
	public void prepare() {
		System.out.println("This is " + this.getCoffeeType() + " which needs the following ingredients: ");
		System.out.println(this.ingredients());
		System.out.println("You can easily make it by following these instructions: ");
		System.out.println(this.howToMakeCoffee());
		this.whereToGet();
	}
	
}
