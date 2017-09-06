package w1pack.l2;

public class Prog7 
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int i = 0; i < args.length; i++) 
		{
			System.out.println(args[i]+" "+args[i].length());
			if(args[i].startsWith("A")) 
			{
				count += 1;
			}
		}
		System.out.println("Number of word start with 'A': "+count);
	}

}
/*Result
Stanley 7
Abdalah 7
Midley 6
Midwige 7
Agent 5
Number of word start with 'A': 2
*/