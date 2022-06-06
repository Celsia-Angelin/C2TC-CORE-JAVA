import java.util.Scanner;
public class EvenOdd {
	public static void main (String[] args) {
		int num;
		System.out.println("Enter any number: ");
		
		Scanner s=new Scanner(System.in);
		num=s.nextInt();			//input
		
		if(num%2==0)
		{
			System.out.println("Number is even...");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}
}


//Enter any number: 222
//Number is even...

