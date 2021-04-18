package pack.sba;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
	
	HashMap<String, Item> itemCollection;

    TheSystem() {
       setItemCollection(new HashMap<>());//init with inferred args
       if(getClass().getSimpleName().equals("AppSystem")) {//check caller
    	   try {
    		   Scanner scanner = new Scanner(new File("./resources/sample.txt"));
    		   while(scanner.hasNextLine()) {
    			   String itemInfo[] = scanner.nextLine().split("  ");//tricky - double spaces
    			   this.add(new Item(itemInfo[0], itemInfo[1],Double.parseDouble(itemInfo[2]),Integer.parseInt(itemInfo[3])));
    		   }
    		   scanner.close();//may cause issues with HR
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
       }
    }
    
    public void setItemCollection(HashMap<String, Item> coll) {
    	this.itemCollection = coll;
    }
    
    public HashMap<String, Item> getItemCollection(){
        return itemCollection;
    }
    
    public Boolean checkAvailability(Item item) {
    	boolean available = item.getQuantity() > 0 && item.getQuantity() <= item.getAvailableQuantity() && item.getAvailableQuantity() > 0;
    	if(!available)
    		System.out.println("System is unable to add "+item.getItemName()+" to the card. System only has "+item.getAvailableQuantity()+" "+item.getItemName()+"s.");
        return available;
    }
    
    public Boolean add(Item item) {
        if(item != null) {//avoid unreachable code
	        if(this.getItemCollection().containsKey(item.getItemName())) {
	        	item.setQuantity(item.getQuantity()+1);
	        	return true;
	        } else {
	        	this.getItemCollection().put(item.getItemName(), item);
	        	return true;
	        }
        }
        return false;
    }

    public Item remove(String itemName) {
    	Item item = null;
    	if(this.getItemCollection().containsKey(itemName)) {
    		item = this.getItemCollection().get(itemName);
    		item.setQuantity(0);//reset
    		return this.getItemCollection().remove(itemName);
    	}
    	return item;
    }

    public abstract void display();
}
