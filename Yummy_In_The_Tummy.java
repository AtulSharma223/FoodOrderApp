import java.util.Scanner;
public class Yummy_In_The_Tummy {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Available dishes.
		
		while(true)
		{
			AvailableDishes menu1=new AvailableDishes();
	        //menu1.addDish("PowBaji", 180);		
			menu1.displayData();
			System.out.println();
			
			
			int id,phn,dishNo;
			
			String name,address,email;
			
			System.out.println("Enter details -->  OrderNO , Phno , DishNo , Name , Address , Email");
			id=sc.nextInt();
			phn=sc.nextInt();
			dishNo=sc.nextInt();
			name=sc.next();
			address=sc.next();
			email=sc.next();
			
			Customers c1=new Customers(id,phn,name,dishNo,address,email);
			c1.displayData();
			System.out.println();
			
			Order order1=new Order();
			System.out.print("Enter Quantity ");
			int quantity;
			quantity=sc.nextInt();
			order1.getData(id,dishNo,quantity);
			order1.displayData();
			System.out.println();
			
			int typeOfCustomer;
			System.out.println("Enter \n1 for guest \n2 for Regular Customer \n3 for Premium members");
			typeOfCustomer=sc.nextInt();
			GenerateBill bill=new GenerateBill(typeOfCustomer,id,name,dishNo,quantity);
			
			
			System.out.print("\nPress 1 for Enter next Customer Details\nPress 2 for exit \n");
			int choice=sc.nextInt();
			if(choice==2)
				break;
		}
		
		
		
	}

}
