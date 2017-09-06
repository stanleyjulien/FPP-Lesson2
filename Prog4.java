package w1pack.l2;
import java.util.Scanner;

public class Prog4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string: ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		for(int i = sb.length()-1; i >= 0;i--)
		{
			System.out.print(sb.charAt(i));
		}
		
	
	}
}
/*Result
Input a string: 
Just Test It!
!tI tseT tsuJ
*/