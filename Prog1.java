package w1pack.l2;
import w1pack.l2.RandomNumbers;

public class Prog1 
{
	public static void main(String[] arg) 
	{
		int x;
		int y;
		double result, result2;
		x = RandomNumbers.getRandomInt(1, 9);
		y = RandomNumbers.getRandomInt(3, 14);
		result = Math.pow(Math.PI, x);
		result2 = Math.pow(y, Math.PI);
		System.out.println("PI raise "+x+": "+result);
		System.out.println(y+" raise PI"+": "+result2);
		
	}
}
/*Result
PI raise 7: 3020.2932277767914
3 raise PI: 31.54428070019754
 */
 