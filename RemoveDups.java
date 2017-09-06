package w1pack.l2;
import java.util.Arrays;

public class RemoveDups 
{
	public static void main(String[] args) 
	{
		String[] strOrig = {"horse", "dog", "cat", "horse","dog"};
		String[] strDest = new String[strOrig.length];
		
		//String comp = strOrig[0];
		int count = 0;
		int cIdx = 0;
		int[] idx = new int[strOrig.length];
		for(int i = 0; i < idx.length; i++) idx[i] = -1;
		
		for(int i = 0; i < strOrig.length; i++) 
		{
			String comp = strOrig[i];
			
			for(int j = 0; j < strOrig.length; j++)
			{
				if(i == j ||  i == idx[j] )
				{
					continue;
				}
				if(comp.equals(strOrig[j]))  
				{
					boolean findIdx = false;
					for(int z = 0; z < idx.length; z++)
					{
						if(j == idx[z] )
							findIdx = true;
					}
					if(findIdx == false)
						idx[cIdx] = j;
					cIdx += 1;
					
				}
			}
		}
		//System.out.println(Arrays.toString(idx));
		
		for(int i = 0; i < strOrig.length; i++)
		{
			boolean t = false;
			for(int j = 0; j < idx.length; j++)
			{
				if(i == idx[j])
				{
					t = true;
				}
			}
			
			if(t == false)
			{
				strDest[count] = strOrig[i];
				System.out.println(strOrig[i]);
			}
			
		}
	}
}

/* Result
horse
dog
cat
*/
