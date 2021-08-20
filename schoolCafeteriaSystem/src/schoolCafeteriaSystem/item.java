package schoolCafeteriaSystem;

public class item {
	
	String itemName;
	Double itemPrice;
	
	public item(String itemName, Double itemPrice) {
		this.itemName =itemName;
		this.itemPrice = itemPrice;
	}


	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return itemName +" "+ itemPrice.toString();
		
	}
	
	
	
}
