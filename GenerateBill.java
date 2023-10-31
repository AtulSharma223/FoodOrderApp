import java.time.LocalDate;
import java.time.LocalTime;

public class GenerateBill 
{
	AvailableDishes dish=new AvailableDishes();
	GenerateBill(int typeOfCustomer,int id,String name,int dishNo,int quantity)
	{
		float total=quantity * dish.price[dishNo];
		System.out.println("Yummy in the Tummy resturant");
		System.out.println("Phone num : 123456789");
		System.out.println();
		System.out.println("Customer name :- "+name);
		System.out.println("Customer Id   :- "+id);
		
		System.out.println("\nItem name     Quantity     Rate     Amount");
		System.out.println(dish.menu[dishNo]+"          "+quantity+"     "+"*"+"   "+dish.price[dishNo]+"       "+total+"₹");
		System.out.println("Delivery Charge                     80₹");
		System.out.println("Total Amount                        "+(total+80));
		if(typeOfCustomer==1)
		{
			System.out.println("Discount                            0/-");
			System.out.println("Total Amount Payable                "+(total+80)+"₹");
		}
		if(typeOfCustomer==2)
		{
			System.out.println("Discount                            30%");
			System.out.println("Total Amount Payable                "+((total+80)*0.7)+"₹");
		}
		if(typeOfCustomer==3)
		{
			System.out.println("Discount                            30%");
			System.out.println("Extra Premium Discount              20%");
			System.out.println("Total Amount Payable                "+((total+80)/2)+"₹");
		}
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		System.out.println("\nDate & time of Billing : "+date+" "+time);
	}
	
}
