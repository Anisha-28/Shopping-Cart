
public class Product {
	protected String name;
	protected String ID;
	protected double price;
	protected double taxAmount;
	
	
	public Product() {
		this(null ,null ,0 ,0) ;
	}
     
	public Product(String name) {
		this(name,null,0,0);
	
	}
	
	public Product(String name, String ID) {
		this(name, ID ,0,0);
	
	}
	
	public Product(String name, String ID, double price) {
		this(name, ID ,price,0);
	
	}
	

    public Product(String name, String ID, double price, double taxAmount) {
		this.name=name;
		this.ID=ID;
		this.price=price;
		this.taxAmount=taxAmount;
	
	}
    
	public String getname() { 
		return name; 
	}
	public String getID() { 
		return ID; 
	}
	public double getprice() {
		return price;
	}
	public double gettaxAmount() {
		return taxAmount;
	}
	
	
	public void setname(String name) {
		this.name = name;		
	} 
	public void setID(String ID) {
		this.ID = ID;	
	}
	
	public void setprice(double price) {
		this.price = price;
	} 
	
	public void settaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	} 
	
	/*public void setnameID(String name, String ID) { 
		this.name = name;
		this.ID = ID;
	} 
	public void setnameIDprice(String name, String ID, double price) { 
		this.name = name;
		this.ID = ID;
		this.price = price;
	} 
	
	public void setnameIDpricetaxAmount(String name, String ID, double price,double taxAmount) { 
		this.name = name;
		this.ID = ID;
		this.price = price;
		this.taxAmount=taxAmount;
	} */
	
	public String toString() {
		return String.format("%s %s\n%s%s\n%s%s\n", "Name:", name, "ID:", ID, "Price:", price, "Tax Amount:", taxAmount);	
	}
	
	

}
