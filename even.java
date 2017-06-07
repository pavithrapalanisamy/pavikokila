package evenodd;
	import java.util.Scanner;


public class even {

	public static void main(String[] args) {
	int n;
	System.out.println("enter the integer");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	if(n%2==0)
	{
		System.out.println("even number");
		
	}
	else
	{
		System.out.println("odd number");
		
	}
	}

}

