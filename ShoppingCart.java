import java.util.Scanner;
/**
*  A class that creates a Shopping Cart to store items. 
*	@author Kendall E. Ladrillono 
*/
public class ShoppingCart extends Item {

	ArrayBag<Item> aBag = new ArrayBag<Item>();
	
	/**Creates a Shopping Cart. */
	public ShoppingCart() {
		
		super();
		this.aBag = aBag;
	}// end constructor
	
	/**Gets the current number of items in the shopping cart. 
	@return an integer */
	public int getCurrentNumItems() {
		
		return aBag.getCurrentSize();
	}// end getCurrentNumItems

	/**Checks if the shopping cart is empty. 
	@return True if the cart is empty or false if it is not empty. */
	public boolean isEmpty() {
		
		return aBag.isEmpty();
	}// end isEmpty
		
	/**Adds a new item (newItem) to the shopping cart.
	@param newItem, the item to be added.
	@return True if the addition is successful, or false if unsuccessful. */
	public boolean addItem(Item newItem) {
		
		return aBag.add((Item) newItem);
	}// end addItem

	/**Removes one unspecified item from the shopping cart, if possible.
	@return the name of the item if successful or null if not. */          
	public Item removeItem() {
		
		return aBag.remove();
	}// end removeItem
	   
	/**Removes one instance of a specific item (anItem) from the shopping cart, if possible.
	@param anItem, the item to be removed.
	@return true if the removal was successful or false if unsuccessful. */
	public boolean removeItem(Item anItem) {
		
		return aBag.remove(anItem);
	}// end removeItem
		
	/** Deletes all items from the shopping cart. */
	public void clearItems() {
	
		aBag.clear();
	}// end clearItems
		
	/**Counts the number of times a specific item (anItem) occurs in the shopping cart.
	@param anItem, the specific item to be counted.
	@return an integer of the number of times anItem occurs. */
	public int getNumberOf(Item anItem) {
		
		return aBag.getFrequencyOf(anItem);
	}// end getNumberOf
		
	/**Checks if the shopping cart contains a specific item (anItem).
	@param anItem, the item to be search for in the bag.
	@return True if the shopping cart contains anItem, or false if it does not. */
	public boolean contains(Item anItem) {
	
		return aBag.contains(anItem);
	}// end contains
		
	/**Calculates the total price of items in the shopping cart.
	@return an integer of the total price. */
	public int getTotalPrice() {
		
		int totalSum = 0;
		Object[] bagArray = aBag.toArray();
		
		for (int item=0; item < getCurrentNumItems(); item++) 
		{			
			totalSum += (((Item) bagArray[item]).getPrice());
		}
		return totalSum;
		
	}// end getTotalPrice
		
	/**Allows the user to enter a delivery address.
	@return a string of the address after entry. */
	public String addDeliveryAddress() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your Street Address: ");
		String address = scan.nextLine();
		System.out.println("Enter your City, State, Zip Code: ");
		String address2 = scan.nextLine();
		
		String message;
		message = "Delivery Address: "+"\n"+address+"\n"+address2;
		scan.close();
		
		return message;
	}// end addDeliveryAddress
	   
	/**Retrieves all items that are in the shopping cart.
	@return a new array of all the items in the shopping cart. */
	public Object[] toArray() {
		
		return aBag.toArray();
	}// end toArray

}// end class
