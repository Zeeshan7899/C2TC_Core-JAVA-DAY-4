package DAY6;

public class switchcase {
	public static void main(String[] args) 
	{
		int x = 10;
		char y = 'b' ;
		String name = "editor"; 
		switch (x) 
		{
		case 1: 
			System.out.println("The value of x is 1");
			break;
		case 2:
			System.out.println("The value of x is 2");
			break;
		case 3:
			System.out.println("The value of x is 3");
			break;
		default:
		System.out.println("The value of x is other than 1,2,3");
			break;

		}

	
	switch (y) 
	{
	case 'a' : 
	case 'A' : 
		System.out.println("The value of y is a");
		break;
	case 'b':
	case 'B' :
		System.out.println("The value of y is b");
		break;
	case 'c':
	case 'C' :	
		System.out.println("The value of y is c");
		break;
	default:
System.out.println("The value of y is other than a,b,c");
		break;
	}


	switch (name.toLowerCase()) 
	{
	case "author":
		System.out.println("Vikas");
		break;
	case "team":
		System.out.println("Team  ");
		break;
	case "editor":
		System.out.println("Zeeshan");
		break;
	default:
		System.out.println("Invalid entry");
		break;
}
	}


}
/* OUTPUT 
The value of x is other than 1,2,3
The value of y is b
Zeeshan
*/