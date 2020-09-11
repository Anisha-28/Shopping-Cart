
public class Packaged extends Product{
	private int quantity;
	private int useDate;

	//public Packaged() {
		
	//}
	public Packaged() {
		/*super(name,ID,price,taxAmount);
		this.quantity=quantity;
		this.useDate=useDate;
		*/
	}
	
	
	public Packaged(String name, String ID, int quantity, double price, int useDate, double taxAmount) {
		super(name,ID,price,taxAmount);
		this.quantity=quantity;
		this.useDate=useDate;
		
		super.getname();
		super.getID();
		super.getprice();
		super.gettaxAmount();
	}
	
	
	public int getquantity() { 
		return quantity; 
	}
	public int getuseDate() { 
		return useDate; 
	}
	
	public String toString() {
		return String.format("%s %s\n%s %s\n%s %s\n%s %s\n%s %s\n%s %s\n", "Name:", name, "ID:", ID, "Quantity: ", quantity, "Price:" , price,"UseDate:", useDate, "Tax Amount:", taxAmount);	
	}
	
	
}
