import java.time.LocalDate;


public class Order extends Customers
{

		// TODO Auto-generated method stub
	
		AvailableDishes d=new AvailableDishes();
		int orderNo;
		int itemId;
		int quantity;
		
		LocalDate myObj=LocalDate.now();
		String ItemName;
		
		void getData(int orderNo,int itemId,int quantity)
		{
			this.orderNo=orderNo;
			this.itemId=itemId;
			this.quantity=quantity;
		}
		
		void displayData()
		{
			System.out.println("Order is Display in the manner --> OrderId , ItemNo , ItemName , Quanity");
			System.out.println(orderNo+" "+itemId+" "+d.menu[itemId]+" "+quantity);
		}
}
