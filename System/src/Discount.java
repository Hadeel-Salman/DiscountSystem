import ADTs.*; 
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		//making object from Scanner & DiscountMethod (the class we made)    
	    Scanner s = new Scanner(System.in);
	    DiscountMethod Discount = new DiscountMethod();
	    
	    
	    //welcoming Message
	    System.out.println("                    ^^  Welcome to Discounts Program ^^");
	    System.out.println("           we will help you apply the discount on all your products");
	    System.out.println("just write down the discount persentage & the current prices for your products");
	    System.out.println("           ||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
	    System.out.println();
	    
	    //asking the user how many products will they enter
	    System.out.println("How many products would you like to enter?");
	    int values = s.nextInt();
	    //we add 1 to the value Because when the user finishes entering data
	    //he will write a number to get out of the loob and the 
	    //This number will be considered within the size of the stack
	    int num = values+1;
	    //the value that the user enterd will be the size of the stack
	    StackAsArray Item = new StackAsArray(num);
	    StackAsArray ItemName = new StackAsArray(num);
	    
	    //asking user about the Discount persentage
	    System.out.println("inter the Discount you want to make on your products");
	    int discount = s.nextInt();
	    
	    System.out.println();
	    System.out.println("when you're done, type (0) to Print the prices of the products after the discount");
	    System.out.println();
	    //Define variables for product name and it Price before discount
	        int PriceBefore;
	        String Name;
	    
	    //A do-while loop so the user can enter more than one item    
	    do{
	    //asking user about product name and it Price before discount    
	    System.out.print("inter Item Name :");
	    Name = s.next();
	    
	    System.out.print("inter Item price before discount :");
	    PriceBefore = s.nextInt();
	    
	    //puting user input inside the discount method and set the value in a variable Named afterDiscount      
	    double afterDiscount = Discount.DiscountMethod(PriceBefore, discount);
	    
	    //using push method to store user data
	    Item.push(afterDiscount);
	    ItemName.push(Name);
	    
	    //put a condition to end the loop
	    }while (PriceBefore != 0);

	    //pop method will remove the zero Since the program considered it as data
	    Item.pop();
	    ItemName.pop();
	    
	    //if statement to print the prices after discount When the user has finished entering data
	    if (PriceBefore == 0){
	        System.out.println();
	        System.out.println("the items after "+discount+"% discount");
	        
	    //using Enumeration twice to print the price next to the product name   
	        Enumeration e = Item.getEnumeration();
	        Enumeration a = ItemName.getEnumeration();
	    while (e.hasMoreElements()&& a.hasMoreElements()){
	        Object x = e.nextElement();
	        Object y = a.nextElement();
	        System.out.println(y+" "+x+"$");}
	    }}

	}

