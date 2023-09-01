import java.util.*;

/**
 * 
 * @author jackyhxz
 *The class Dish has attribute of name, sku(like an ID), and price of a dish in the restaurant.
 *The class also records the totalSales and totalInventory(# of items)
 *The class can sell a dish and keep track of the totalSales and totalInventory
 */
public class Dish {
	private String name;
	private String sku;
	private double price;
	private static int totalInventory;
	private static double totalSales;
	private static ArrayList<Dish> catalog=new ArrayList();
	
	/**
	 * 
	 * @param name   the name of the dish
	 * @param sku   the sku of the dish
	 * @param price   the price of the dish
	 */
	public Dish(String name, String sku, double price) {
		this.name=name;
		this.price=price;
		this.sku=sku;
		totalInventory++;
		catalog.add(this);
	}
	
	/**
	 * 
	 * @return returns the name of the dish
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * 
	 * @return  returns the sku of the dish
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * 
	 * @return  returns the price of the dish
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * 
	 * @return  returns the totalInventory(how many dishes are left)
	 */
	public static int getTotalInventory() {
		return totalInventory;
	}

	/**
	 * 
	 * @return  returns the totalSales
	 */
	public static double getTotalSales() {
		return totalSales;
	}

	/**
	 * 
	 * @return  return the catalog ArrayList which contains all the dishes available
	 */
	public static ArrayList<Dish> getCatalog() {
		return catalog;
	}
	
	/**
	 * locate a dish in the catalog ArrayList according to its respective sku, add the price of that dish to the totalSales
	 * Then removes the item being sold
	 * @param sku   a sku(ID) that is going to be sold
	 */
	public void sell(String sku) {
		for(int i=0; i<catalog.size(); i++) {
			Dish item=catalog.get(i);
			if(item.getSku().equals(sku)) {
				totalSales+=item.getPrice();
				totalInventory--;
				catalog.remove(i);
				break;
			}
		}
	}
	
	
	
	/**
	 *  A toString method to return information about the sku, name, and price of the dish
	 */
	public String toString() {
		return "[SKU: "+sku+"]   "+name+": "+price;
	}

}

