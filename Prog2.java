package w1pack.l2;

public class Prog2 
{
	public static void main(String[] arg) 
	{
		float a = 1.27f;
		float b = 3.881f;
		float c = 9.6f;
		
		int r2 = (int)(a + b + c);
		int r3 = Math.round(a + b + c);
		System.out.println(r2);
		System.out.println(r3);
	}
}
/*Result
14
15
 */