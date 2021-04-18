package pack.sba;

public class AppSystem extends TheSystem {
    AppSystem() {
    }

    
    
    /**
     * This is ridiculously badly. Instructions do not specify correctly that all must be justified left. Compiler says there are too many spaces and does not properly explain the issue
     */
    @Override
    public void display() {
    	System.out.println("AppSystem Inventory:");
        System.out.format("%-20s %-20s %-10s %-10s\n", "Name", "Description","Price","Available Quantity");
        for(Item item : this.getItemCollection().values()) {
        	System.out.format("%-20s %-20s %-10.2f %-10d\n", item.getItemName(),item.getItemDesc(),item.getItemPrice(),item.getAvailableQuantity());
        }
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        if(item != null) {
        	if(this.getItemCollection().containsKey(item.getItemName())) {
        		System.out.println(item.getItemName()+" is already in the App System");
        		return false;
        	} else {
        		this.getItemCollection().put(item.getItemName(), item);//doesn't contain, add it
        		return true;
        	}
        }
        return false;
    }

    public Item reduceAvailableQuantity(String item_name) {
        if(this.getItemCollection().containsKey(item_name)) {
        	Item cont = this.getItemCollection().get(item_name);
        	cont.setAvailableQuantity(cont.getAvailableQuantity()-1);
        	if(cont.getAvailableQuantity() <= 0) {
        		this.getItemCollection().remove(item_name);
        		cont = null;//will now return null
        	}
        	return cont;
        } else {
        	return null;//not in collection
        }
    }
}
