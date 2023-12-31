
public class WhiteChocolateMocha extends Coffee implements Coffee.Chocolate{

	public WhiteChocolateMocha() {
		super();
		setCoffeeType(chocolateType());
	}
	
	public WhiteChocolateMocha(double cost, String name) {
		setPrice(cost);
		setCoffeeType(chocolateType());
		setStoreName(name);
	}
	
	// ***** Abstract Methods ***** //
	
	public String ingredients() {
		return "white chocolate syrup, milk, espresso";
	}
	
	public String howToMakeCoffee() {
		return "Warm the milk, make the espresso, then stir together with white chocolate syrup and enjoy!";
	}

	
	@Override 
	public String chocolateType() {
		return "White chocolate mocha";
	}
	
	@Override
	public void prepare() {
		System.out.println("This is " + this.getCoffeeType() + " which needs the following ingredients: ");
		System.out.println(this.ingredients());
		System.out.println("You can easily make it by following these instructions: ");
		System.out.println(this.howToMakeCoffee());
		this.whereToGet();
	}
	
	public String getIngredients() {
		return this.ingredients();
	}
}
