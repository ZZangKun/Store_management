/**
 * The fired class includes gramOfSpices and if this fired dish contains meat or not of a fried dish. 
 * It also override the toString method so it would output a specific String unique to other types of dishes
 * @author jackyhxz
 *
 */
public class fried extends Dish{
	private int gramOfSpices;
	private boolean isMeat;
	
	/**
	 * Constructor that takes all the parameter of the fried dish and send the name, sku, and price to the super class
	 * @param name  name of the fried dish
	 * @param sku    sku of the fried dish
	 * @param price    price of the fried dish
	 * @param gramOfSpices	gram of spices of the fried dish
	 * @param isMeat	if this fried dish contains meat or not
	 */
	public fried(String name, String sku, double price, int gramOfSpices, boolean isMeat) {
		super(name, sku, price);
		this.gramOfSpices=gramOfSpices;
		this.isMeat=isMeat;
	}

	/**
	 * 
	 * @return the gram of spices of the fried dish
	 */
	public int getGramOfSpices() {
		return gramOfSpices;
	}

	/**
	 * 
	 * @return if the fried dish contains meat or not
	 */
	public boolean isMeat() {
		return isMeat;
	}
	
	/**
	 * a toString method to override the toString in the super class, so it's output is specific to fried dish
	 */
	public String toString() {
		return "[SKU: "+super.getSku()+"]   "+gramOfSpices+" grams of "+super.getName()+": "+super.getPrice(); 
	}
}
