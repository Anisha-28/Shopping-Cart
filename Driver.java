import java.util.Scanner;
public class Driver {

	

	public static void main(String[] args) {
		Product milk = new Packaged("Milk", "1", 2, 3, 2, 0.30);
		Product eggs = new Packaged("Eggs", "2", 10, 4, 2, 0.40);
		Product chocolate = new Packaged("Chocolate", "3", 20, 10, 15, 1);
		Product chips = new Packaged("Chips", "4", 5, 20, 30, 2);
		Product candy = new Packaged("Candy", "5", 6, 40, 15, 4);
		Product apple = new FreshFruit("Apple","6", 10,4);
		Product mango = new FreshFruit("Mango","7",5,4);
		Product banana = new FreshFruit("Banana","8",10,5);
		Product watermelon = new FreshFruit("Watermelon","9",60,2);
		Product strawberry = new FreshFruit("Strawberry","10",100,2);
		
	
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("1. Milk");
		System.out.println("2. Eggs");
		System.out.println("3. Chocolate");
		System.out.println("4. Chips");
		System.out.println("5. Candy");
		System.out.println("6. Apple");
		System.out.println("7. Mango");
		System.out.println("8. Banana");
		System.out.println("9. Watermelon");
		System.out.println("10. Strawberry");
		
		
		System.out.println("How many items you want to get");
		int input = sc.nextInt();
		
		while(input<1 || input>11) {
			System.out.println("Please select the right number of items");
			input = sc.nextInt();
		}
		
		double totalPrice=0;
		double Price=0;
		double totalAmount=0;
		double Amount=0;
		double totalTA=0;
		double TA=0;
		
		
		for(int i=0; i<(input); i++) {
			
			System.out.println("Please select the item, you want to bought");
			int input1 = sc.nextInt();
			
			if (input1==1) {
				System.out.println("The product is : \n" + milk.toString());
				 Amount = milk.getprice() - milk.gettaxAmount();
				 Price=milk.getprice();
				TA=milk.gettaxAmount();
			}
			
			else if(input1==2) {
				System.out.println("The product is : \n" + eggs.toString());
				 Amount = eggs.getprice() - eggs.gettaxAmount();
				 Price = eggs.getprice();
				 TA=milk.gettaxAmount();
				 
			}
			else if(input1==3) {
				System.out.println("The product is : \n" + chocolate.toString());
				 Amount = chocolate.getprice() - chocolate.gettaxAmount();
				 Price = chocolate.getprice();
				 TA=chocolate.gettaxAmount();
			}
			else if(input1==4) {
				System.out.println("The product is : \n" + chips.toString());
			    Amount = chips.getprice() - chips.gettaxAmount();
			    Price  = chips.getprice();
			    TA=chips.gettaxAmount();
			}
			else if(input1==5) {
				System.out.println("The product is : \n" + candy.toString());
				Amount = candy.getprice() - candy.gettaxAmount();
				Price = candy.getprice();
				TA=candy.gettaxAmount();
				
			}
			else if(input1==6) {
				System.out.println("The product is : \n" + apple.toString());
				Amount = apple.getprice() - apple.gettaxAmount();
				Price = apple.getprice();
				TA=apple.gettaxAmount();
			
			}
			else if(input1==7) {
				System.out.println("The product is : \n" + mango.toString());
				Amount = mango.getprice() - mango.gettaxAmount();
				Price = mango.getprice();
				TA=mango.gettaxAmount();
			}
			else if(input1==8) {
				System.out.println("The product is : \n" + banana.toString());
				 Amount = banana.getprice() - banana.gettaxAmount();
				 Price = banana.getprice();
				 TA=banana.gettaxAmount();
				
			}
			else if(input1==9) {
				System.out.println("The product is : \n" + watermelon.toString());
				Amount = watermelon.getprice() - watermelon.gettaxAmount();
				Price = watermelon.getprice();
				TA=watermelon.gettaxAmount();
				
			}
			else {
				System.out.println("The product is : \n" + strawberry.toString());
				Amount = strawberry.getprice() - strawberry.gettaxAmount();
				Price = strawberry.getprice();
				TA=strawberry.gettaxAmount();
				
			}
			
			totalAmount = totalAmount+Amount;
			totalTA = totalTA+TA;
			totalPrice = totalPrice+Price;
			
		}
		
		System.out.println("The total price of your docket is : " + totalPrice);
		System.out.println("The total amount excluding tax is : " + totalAmount);
		System.out.println("The total tax value in purchase : " + totalTA); 
	}

}
