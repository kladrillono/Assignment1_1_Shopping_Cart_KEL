import java.util.ArrayList;
/**
 * A class that creates Item objects to place in Shopping Cart.
 * @author Kendall E. Ladrillono
 *
 */
public class Item {
	
	private String description;
	private int price;
	private boolean stockStatus;
   
	/** Creates an empty Item object */
   	public Item() 
   	{
   		description = "";
   		price = 0;
   		stockStatus = true;
   	}// end empty-argument constructor
   	
   	/**Creates an Item object with parameters
   	@param itemDescription, itemPrice, itemStatus */
	public Item(String itemDescription, int itemPrice, boolean itemStatus) 
	{
      description = itemDescription;
      price = itemPrice;
      stockStatus = itemStatus;
	}// end constructor
	
	/**Get description of an item
	@return the description of the Item. */
	public String getDescription() 
	{
      return description;
	} // end getDescription
	
	/**Get the price of an item
	@return the price of the Item. */
	public int getPrice() 
	{
      return price;
	} // end getPrice
	
	/**Get the stock status of an item
	@return True if the item is in stock or false if it is out of stock. */
	public boolean getStatus()
	{
		return stockStatus;
	} // end getStatus 

	/**Displays the Item and Item information 
	@return a String with item and item description. */
	@Override
	public String toString() 
	{
		return "Item "+"\n"+"Description: " + description +"\n" +"Price: "+"$" + price +"\n" + "In Stock? " + stockStatus;
	} // end toString
	
} // end Item class

