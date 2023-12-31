
public class CustomCoffee extends Coffee{
	
	private String customIngredients;
	private String customInstructions;
	
	

	public CustomCoffee(String type, String ingreds, String instruct) {
		super();
		super.setCoffeeType(type);
		customIngredients = ingreds;
		customInstructions = instruct;
		this.setPrice(10.0);
		super.setStoreName("our store");
	}

	
	// ***** Abstract Methods ***** //
	
		public String ingredients() {
			return customIngredients;
		}
		
		public String howToMakeCoffee() {
			return customInstructions;
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
