
public class DarkChocolateMocha extends Coffee implements Coffee.Chocolate{

	public DarkChocolateMocha() {
		super();
		setCoffeeType(chocolateType());
	}
	
	public DarkChocolateMocha(double cost, String name) {
		setPrice(cost);
		setCoffeeType(chocolateType());
		setStoreName(name);
	}
	
	// ***** Abstract Methods ***** //
	
	public String ingredients() {
		return "dark chocolate syrup, milk, espresso";
	}
	
	public String howToMakeCoffee() {
		return "Warm the milk, make the espresso, then stir together with dark chocolate syrup and enjoy!";
	}
	
	@Override 
	public String chocolateType() {
		return "Dark chocolate mocha";
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
