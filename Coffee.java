
public abstract class Coffee {

	private String coffeetype;
	private double price;
	private String storeName;
	
	protected Coffee() {
		coffeetype = "None";
		price = 0.0;
		storeName = "None";
	}
	
	protected Coffee (String coffee, double pricing, String store) {
		coffeetype = coffee;
		price = pricing;
		storeName = store;
	}
	
	public interface Chocolate{
		String chocolateType();
	}
	
	// ***** Abstract Methods ***** //
	
	public abstract String ingredients();
	
	public abstract String howToMakeCoffee();
	
	// **** Getters **** //
	
	public String getCoffeeType() {
		return coffeetype;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	// **** Setters **** //
	
	public void setCoffeeType(String coffee) {
		coffeetype = coffee;
	}
	
	public void setPrice(double pricing) {
		price = pricing;
	}
	
	public void setStoreName(String name) {
		storeName = name;
	}
	
	// ***** Methods ***** //
	
	public void prepare() {
		System.out.println("This is " + this.coffeetype + " which needs the following ingredients: ");
		System.out.println(this.ingredients());
		this.whereToGet();
	}
	
	public void whereToGet() {
		System.out.println("You could also buy this from "+ this.storeName + " for $"+ this.price+"0.");
	}
	
}
