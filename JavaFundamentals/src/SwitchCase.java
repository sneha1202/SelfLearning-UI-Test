
public class SwitchCase {

	public static void main(String[] args) {
		
	//when i have multiple condition like
		int month=8;//i have inserted the break point to see the flow while debugging
		if(month==1)  
		{
			System.out.println("jan");  
		}
		else if(month==2)
		{
		 System.out.println("Febuary");
	}
		else if(month==8)
		{
			System.out.println("August");
		}
		switch (month)
		
		{
case 1:
		 System.out.println("jan");
		break;
case 2:
	    System.out.println("Febuary");
	    break;
case 8:
	   System.out.println("August");
	   break;
		
default:  
	  System.out.println("Enter the value between 1-12");
	    break;
		}
	}
}

