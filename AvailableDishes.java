
public class AvailableDishes 
{

		String menu[]=new String[100];
		int price[]=new int[100];
		AvailableDishes()
		{
			menu[1]="Pizza";
			price[1]=120;
			
			menu[2]="Burger";
			price[2]=50;
			
			menu[3]="Dosha";
			price[3]=140;
			
			menu[4]="Biryani";
			price[4]=150;
			
			menu[5]="Hot Dog";
			price[5]=80;
			
			menu[6]="Noodle";
			price[6]=150;
			
			menu[7]="Pasta";
			price[7]=100;
			
			menu[8]="Donuts";
			price[8]=70;
			
			menu[9]="Sandwich";
			price[9]=160;			
		}
		
		int count=10;
		void addDish(String name,int price)
		{
			menu[count]=name;
			this.price[count]=price;
			count++;
		}
		void displayData()
		{
			System.out.println();
			System.out.println("Our Available Dishes are ");
			for(int i=1;i<count;i++)
			{
				System.out.println(i+" "+menu[i]+" "+price[i]);
			}
		}

}
