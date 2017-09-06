package w1pack.l2;
import w1pack.l2.RandomNumbers;

public class Prog5 
{
	public static void main(String[] args)
	{
		int[][] num = new int[4][4];
		int res = 0;
		for(int i = 0; i < num.length; i++)
		{
			for(int j = 0; j < num.length; j++)
			{
				num[i][j] = RandomNumbers.getRandomInt(1, 99);
			}
		}
		
		//System.out.println(str[0]);
		for(int i = 0; i < num.length; i++)
		{
			for(int j = 0; j < num.length; j++) 
			{
				if(i != 1 && i !=3)
				{
					System.out.print("  "+num[i][j]+"\t");
				}
				else //control each second line to put a plus sign in front the number
				{
					System.out.print("+ "+num[i][j]+"\t");
					if(j == 3) // control if i'm on the last col to put the bar directly after
					{
						System.out.println();
						for(int z = 0; z < num.length; z++)
						{
							System.out.print("____\t");
						}
						System.out.println();
						System.out.println();
					}
				}
			}
			System.out.println();
		}
	}

}
/*Result
 * 
 
  12	  	  71	  	  24	  	  23	
+ 3		+ 99		+ 90		+ 20	
____		____		____		____	


  20	  	  55	  	  98	  	  63	
+ 70		+ 74		+ 98		+ 3	
____		____		____		____	

*/