package CANDYMACHINE.STEP4;

import java.util.Scanner;

public class MAIN {
	
	public static void main(String[] args) {
		
	static Scanner console = new Scanner(System.in);
		
		CashRegister cashRegister = new CashRegister(); 
        Dispenser candy = new Dispenser(100, 50);      
        Dispenser chips = new Dispenser(100, 65);        
        Dispenser gum = new Dispenser(75, 45);         
        Dispenser cookies = new Dispenser(100, 85);      
   
		
		
		int choice;  //variable to hold the selection
		
		showSelection();
		choice = console.nextInt();
		
		while (choice != 9)
		{
			switch (choice)
			{
			case 1:
				sellProduct(candy, cashRegister);
				break;
				
			case 2:
				sellProduct(chips, cashRegister);
				break;
				
			case 3:
				sellProduct(gum, cashRegister);
				break;
				
			case 4:
				sellProduct(cookies, cashRegister);
				break;
				
				default:
					System.out.println("Invalid Selection");
			}//end switch
			
			showSelection();
			choice = console.nextInt();
		}//end while
	}//end main 
		
		public static void showSelection()
		{
			System.out.println("*** wlcome to Gab's" + "CAndy Shop ***");
			System.out.println("To select an itrm, enter ");
			System.out.println("1 for Candy");
			System.out.println("2 for Chips");
			System.out.println("3 for Gum");
			System.out.println("4 for Cookies");
			System.out.println("9 to exit");
		}//end showSelection
		
		public static void sellProduct(Dispenser product, CashRegister cRegister)
		{
			int price;         //variable to hold the product price 
			int coinsInserted; //variable to hold the amount entered
			int coinsRequired; //variable to show the extra amount 
			                   //needed
			
			if (product.getCount() > 0)
			{
				price = product.getProductCost();
				coinsRequired = price;
				coinsInserted = 0;
				
				while (coinsRequired > 0)
				{
					System.out.print("Please deposit "
							+ coinsRequired
							+ " cents: ");
					
					coinsInserted = coinsInserted
							      + console.nextInt();
					
					coinsRequired = price
							- coinsInserted;
				}
				
				System.out.println();
				
				
				cRegister.acceptAmount(coinsInserted);
				product.makeSale();
				
				System.out.println("Collect your item "
						+ "at the bottom and "
						+ "enjoy.\n");
			}
			else
				System.out.println("Sorry this item "
						+ "is sold out.\n");
		}//end sellProduct
			

}


		
		
	}
