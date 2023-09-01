/**
 * The grilled class extends the Dish class, and takes percentSugar and addMilk as extra variable
 * @author jackyhxz
 *
 */
public class beverage extends Dish{
	private double percentSugar;//in decimal, like 53%=0.53
	private boolean addMilk;
	
	
	/**
	 * Constructor that takes all the parameter of the beverage and send the name, sku, and price to the super class
	 * @param name	the name of the beverage
	 * @param sku	the sku of the beverage
	 * @param price		the price of the beverage
	 * @param percentSugar	percentage of sugar added to the beverage
	 * @param addMilk	if the beverage contains milk
	 */
	public beverage(String name, String sku, double price, double percentSugar, boolean addMilk) {
		super(name, sku, price);
		this.percentSugar=percentSugar;
		this.addMilk=addMilk;
	}

	/**
	 * 
	 * @return percentage of sugar added to the beverage
	 */
	public double getPercentSugar() {
		return percentSugar;
	}

	
	/**
	 * 
	 * @return  if the beverage contains milk
	 */
	public boolean isAddMilk() {
		return addMilk;
	}
	
	/**
	 * a toString method to override the toString in the super class, so it's output is specific to beverage
	 */
	public String toString() {
		return "[SKU: "+super.getSku()+"]   "+super.getName()+": "+super.getPrice();
	}
}
