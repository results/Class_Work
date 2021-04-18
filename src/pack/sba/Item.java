package pack.sba;

public class Item{
	
	String itemName = "";
	String itemDesc = "";
	Double itemPrice = 0.0;
	Integer quantity = 0;
	Integer availableQuantity = 0;
    
    
    public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Item() {
        this.setQuantity(1);
    }
    
    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
    	 this.setQuantity(1);
        this.setItemName(itemName);
        this.setItemDesc(itemDesc);
        this.setItemPrice(itemPrice);
        this.setAvailableQuantity(availableQuantity);
    }
    
    
    
}
