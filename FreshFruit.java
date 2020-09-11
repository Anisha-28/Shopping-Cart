
public class FreshFruit extends Product{
	
	private double weight;

	
	public FreshFruit(){
		super(null,null,0);
		
		this.weight=0;
	}
	
	public FreshFruit(String name, String ID, double price,double weight){
		super(name,ID,price);
		
		this.weight=weight;
	
		super.getname();
		super.getID();
		super.getprice();
		super.gettaxAmount();
	
	}
	
	public double getweight() { 
		return weight; 
	}
	
	
	public String toString() {
		
		
		return String.format("%s %s\n%s %s\n%s %s\n%s %s\n", "Name:", name, "ID: ", ID, "Price:", price, "Weight :", weight);
		
		
		
		
	}
	
	






}
