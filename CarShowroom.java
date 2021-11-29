package inheritence;

public class CarShowroom 
{

public static void main(String [] args) 
	{
	// Reference for Parent Class (Cars)...
	Cars car=new Gt86();
	car.have();
	System.out.println();
	// Downcasting to Toyota Class...
	Toyota to=(Toyota) car;
	to.makes();
	to.have();
	System.out.println();
	// Downcasting to Gt86 Class...
	Gt86 gt=(Gt86) car;
	gt.model();
	gt.makes();
	gt.have();
}

}
