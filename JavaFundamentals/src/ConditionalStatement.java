
public class ConditionalStatement {

	public static void main(String[] args) {
		//Finding the gretest of two numbers.Generally in unit testing dev has to very conditional statement.
		//Always pass diff value to verify the logic.
		int a=30, b=20, c=50;
		if(a<b)
		{
			System.out.println("b is greatest");
		}
		else
		{
			System.out.println("a is greatest");
			
			//Finding gretest of three numbers.	

			if(a>b & a>c)
			{
				System.out.println("a is greatest"+a);
			}
			else if(b>c && b>a)
			{
				System.out.println("b is greatest"+b);
			}
			else
			{
				System.out.println("c is greatest"+c);//This like a truth table true true alwya gives you true apart from it
				//any condition you take outcome false
			}
		}
		
		//Sorting Mechanism available in java.
		//Bouble sorting, heap sorting ,quick sorting
		//like i have 20 10 5 4 greatest of it would be 20
	}
}
