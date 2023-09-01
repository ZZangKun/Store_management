/**
 * The grilled class extends the Dish class, and takes pounds and isSpicy as extra variable
 * @author jackyhxz
 *
 */

public class grilled extends Dish{
	private double pounds;
	private boolean isSpicy;
	
	/**
	 * Constructor that takes all the parameter of the grilled dish and send the name, sku, and price to the super class
	 * @param name	the name of the grilled dish
	 * @param sku	the sku of the grilled dish
	 * @param price		the price of the grilled dish
	 * @param pounds	how many pounds does the grilled dish have
	 * @param isSpicy	if the grilled dish is spicy or not
	 */
	public grilled(String name, String sku, double price, double pounds, boolean isSpicy) {
		super(name, sku, price);
		this.pounds=pounds;
		this.isSpicy=isSpicy;
	}
	
	/**
	 * 
	 * @return 	the number of pounds the grilled dish weight
	 */
	public double getPounds() {
		return pounds;
	}

	/**
	 * 
	 * @return	if the grilled dish is spicy or not
	 */
	public boolean isSpicy() {
		return isSpicy;
	}
	
	/**
	 * a toString method to override the toString in the super class, so it's output is specific to grilled dish
	 */
	public String toString() {
		if(isSpicy) {
			return "[SKU: "+super.getSku()+"]   "+pounds+" pounds of spicy "+super.getName()+": $"+super.getPrice();
		}else {
			return "[SKU: "+super.getSku()+"]   "+pounds+" pounds of non-spicy "+super.getName()+": $"+super.getPrice();
		}
	}
	
}
