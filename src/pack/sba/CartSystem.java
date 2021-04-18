package pack.sba;

public class CartSystem extends TheSystem {
    CartSystem() {
    }

    @Override
    public void display() {
    	double subtotal = 0;
    	System.out.println("Cart:");
        System.out.format("%-20s %-20s %-10s %-10s %-10s\n", "Name", "Description", "Price", "Quantity", "Sub Total");
        for(Item item : this.getItemCollection().values()) {
        	subtotal = item.getQuantity() * item.getItemPrice();
        	System.out.format("%-20s %-20s %-10.2f %10d %-10.2f\n", item.getItemName(),item.getItemDesc(),item.getItemPrice(),item.getQuantity(),subtotal);
        }
    	double tax = subtotal *0.05;
    	double total = subtotal+tax;
    	System.out.format("%-20s %-20.2f\n", "Pre-tax Total", subtotal);
    	System.out.format("%-20s %-20.2f\n", "Tax", tax);
    	System.out.format("%-20s %-20.2f\n", "Total", total);
    }
}
