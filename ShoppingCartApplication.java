import java.util.Arrays;
/**
 * A class that utilizes a Shopping Cart and methods to manipulate items in the cart.
 * @author Kendall E. Ladrillono
 *
 */
public class ShoppingCartApplication {

	public static void main(String[] args) {
		
		ShoppingCart newCart = new ShoppingCart();
		
		/**Create items and add them to newBag. */
		Item oneItem = new Item("Milk", 3, true);
		System.out.println(newCart.addItem(oneItem));
				
		Item twoItem = new Item("Bread", 4, true);
		newCart.addItem(twoItem);
				
		Item threeItem = new Item("Rocky Road Ice Cream", 6, true);
		newCart.addItem(threeItem);
				
		Item fourItem = new Item("Coffee creamer", 6, true);
		newCart.addItem(fourItem);
				
		Item fiveItem = new Item("Peanut Butter", 5, true);
		newCart.addItem(fiveItem);
		newCart.addItem(fiveItem);
		
		/**Displays items in newBag. */
		System.out.println("The bag contains the following items: ");
		Object[] bagArray = newCart.toArray();
		
		for (int index=0; index < bagArray.length; index++)
			{
				System.out.println(bagArray[index] + " ");
			}// end for loop
		
		System.out.println("Current cart total: $" + newCart.getTotalPrice());
		
		/**Test code for counting how many items are in the bag. */
		System.out.println("How many items are in the cart?");
		System.out.println(newCart.getCurrentNumItems());
		
		/**Test code that counts the number of fiveItem. */
		System.out.println("How many peanut butter items are in the cart?");
		System.out.println(newCart.getNumberOf(fiveItem));
		
		/**Test code that checks if bag contains object fourItem. */
		System.out.println("Does the bag contain coffee creamer?");
		System.out.println(newCart.contains(fourItem));
		
		/**Test code for removing a specific item. */
		System.out.println("Remove oneItem (milk).");
		System.out.println(newCart.removeItem(oneItem));
		
		/**Test code for removing a non-specific item. */
		System.out.println("Remove an item.");
		System.out.println(newCart.removeItem());
		
		System.out.println("How many items are in the cart now?");
		System.out.println(newCart.getCurrentNumItems());
		
		/**Display bag. */
		System.out.println("The bag contains the following items: ");
		bagArray = newCart.toArray();
		
		for (int index=0; index < bagArray.length; index++)
			{
				System.out.println(bagArray[index] + " ");
			}// end for loop
				
		/**Test code for isEmpty before and after clearing the bag. */
		System.out.println("Is the bag empty?");
		System.out.println(newCart.isEmpty());
		newCart.clearItems();
				
		System.out.println("Is the bag empty now?");
		System.out.println(newCart.isEmpty());
				
		/**Test code for addDeliveryAddress. */
		System.out.println(newCart.addDeliveryAddress());
		
		
	}// end main

}// end class
