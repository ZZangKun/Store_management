import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Catalog: ");
		for(int i=0; i<Dish.getCatalog().size(); i++) {
			System.out.println(Dish.getCatalog().get(i));
		}
		System.out.println();
		System.out.print("(q to quit) Enter SKU to sell: ");
		Scanner input=new Scanner(System.in);
		String sold=input.nextLine();
		
		while(!sold.equals("q")) {
			System.out.println();
			for(int i=0; i<Dish.getCatalog().size(); i++) {
				if(sold.equals(Dish.getCatalog().get(i).getSku())) {
					System.out.print("Item Sold! Total sales to date: ");
					System.out.println(Dish.getTotalSales()+Dish.getCatalog().get(i).getPrice());
					System.out.print("Current number of items in inventory: ");
					System.out.println(Dish.getTotalInventory()-1);
					Dish.getCatalog().get(i).sell(sold);
					break;
				}
			}
			System.out.println("Current Catalog: ");
			for(int i=0; i<Dish.getCatalog().size(); i++) {
				System.out.println(Dish.getCatalog().get(i));
			}
			System.out.println();
			System.out.print("(q to quit) Enter SKU to sell: ");
			sold=input.nextLine();
		}
		

	}
	
	/**
	* Returns a random integer between 0 and n-1, inclusive
	* @return a random integer between 0 and n-1, inclusive
	*/	
	public static int random(int n) {
		return (int)(Math.random() * n);
	}


static {
	for(int i=0; i<10; i++) {
		int ran=random(3);
		if(ran==0) {
			double [] pound={2, 2.5, 3, 5, 7.5};
			double pounds=pound[random(pound.length)];
			boolean isSpicy;
			if(random(2)==0) {
				isSpicy=false;
			}else {
				isSpicy=true;
			}
			String [] grilledNames= {"Grilled Eggplant", "Grilled Beef", "Grilled Vegetables", "Grilled Mutton", "Grilled Fish"};
			String grilledName=grilledNames[random(grilledNames.length)];
			double [] grilledPrices= {5.99, 8.99, 10.99, 12.25, 15.99};
			double grilledPrice=grilledPrices[random(grilledPrices.length)];
			String sku="1234-"+i;
			
			grilled g=new grilled(grilledName, sku, grilledPrice, pounds, isSpicy);
			
			
		}else if(ran==1) {
			int [] gram={2, 3, 5, 7, 9};
			int grams=gram[random(gram.length)];
			boolean isMeat;
			if(random(2)==0) {
				isMeat=false;
			}else {
				isMeat=true;
			}
			String [] friedNames= {"Fried Pork", "Fried Beef", "Fried Vegetables", "Fried Mutton", "Fried Fish"};
			String friedName=friedNames[random(friedNames.length)];
			double [] friedPrices= {7.99, 9.99, 12.99, 14.25, 18.99};
			double friedPrice=friedPrices[random(friedPrices.length)];
			String sku="1234-"+i;
			
			fried f=new fried(friedName, sku, friedPrice, grams, isMeat);

		}else {
			double [] sugar={0, 0.3, 0.5, 0.75, 1.0};
			double percentSugar=sugar[random(sugar.length)];
			boolean addMilk;
			if(random(2)==0) {
				addMilk=false;
			}else {
				addMilk=true;
			}
			String [] beverageNames= {"Traditional Milk Tea", "HongKong Lemon Tea", "Iced Coffee", "Hot Coffee", "Iced Mango Tea"};
			String beverageName=beverageNames[random(beverageNames.length)];
			double [] beveragePrices= {2.99, 3.99, 4.99, 5.25};
			double beveragePrice=beveragePrices[random(beveragePrices.length)];
			String sku="1234-"+i;
			
			beverage b=new beverage(beverageName, sku, beveragePrice, percentSugar, addMilk);

		}
	}
}

}

