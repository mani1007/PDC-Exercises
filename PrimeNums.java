package pdcassessment;

import java.util.Scanner;

public class PrimeNums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter a number for Range1:");
		
		int range1 = sc.nextInt();
		
		System.out.println("Enter a number for Range2:");
		
		int range2 = sc.nextInt();
		
		PrimeNums pn = new PrimeNums();
		
		pn.prime(range1,range2);
		
		sc.close();

	}

	void prime(int range1, int range2) {
		
		for (int i=range1;i<=range2;i++)
		{
			int flag = 1;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println(i);
		}
		
	}

}
