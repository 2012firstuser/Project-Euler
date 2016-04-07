
public class Problem2 {
	public static void main(String[] args)
	{
		int previous = 1;
		int term = 1;
		int sum = 0;
		int temp;
		while(term < 4000000)
		{
			if(term%2 == 0)
				sum+= term;
			System.out.println(term);
			temp = term;
			term = previous + term;
			previous = temp;			
		}
		System.out.println(sum);
		
	}
}
