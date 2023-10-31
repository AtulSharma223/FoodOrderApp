
public class Customers {

		// TODO Auto-generated method stub
		int orderNumber;
		int phoneNo;
		int customerCount=0;
		String name;
		String address;
		String emailId;
		int dishNumber;
		
		Customers()
		{
			
		}
		Customers(int orderNumber,int phoneNo,String name,int dishNumber,String address,String emailId)
		{
			this.orderNumber=orderNumber;
			this.phoneNo=phoneNo;
			this.name=name;
			this.address=address;
			this.emailId=emailId;
			this.dishNumber=dishNumber;
		}
		void getData(int orderNumber,int phoneNo,String name,int dishNumber,String address,String emailId)
		{
			this.orderNumber=orderNumber;
			this.phoneNo=phoneNo;
			this.name=name;
			this.address=address;
			this.emailId=emailId;
			this.dishNumber=dishNumber;
			
		}
		void displayData()
		{
			System.out.print("Detail of customer is : ");
			System.out.println(orderNumber+" "+phoneNo+" "+name+" "+dishNumber+" "+address+" "+emailId);
		}
		
	
}
