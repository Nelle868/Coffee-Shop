
public class PeppermintMocha extends Coffee{
	
	private int peppermintsyrupAmount;

	public PeppermintMocha() {
		super();
		peppermintsyrupAmount = 0;
	}
	
	public PeppermintMocha(String type, double cost, String name, int amount) {
		super(type, cost, name);
		peppermintsyrupAmount = amount;
	}
	
	// ***** Abstract Methods ***** //
	
	public String ingredients() {
		return "peppermint chocolate syrup, milk, espresso";
	}
	
	public String howToMakeCoffee() {
		return "Warm the milk, make the espresso, then stir together with " + peppermintsyrupAmount + " pumps of peppermint chocolate syrup and enjoy!";
	}
	
	//**** Getter **** //
	
	public int getAmount() {
		return peppermintsyrupAmount;
	}
	
	// **** Setter **** //
	
	public void setAmount(int amount) {
		peppermintsyrupAmount = amount;
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
