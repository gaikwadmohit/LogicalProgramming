package logicalProg;

import java.util.Scanner;

public class PerfectNum {
	
		public static void main(String[] args) {
			
			int n,sum=0;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter any number");
			n=s.nextInt();
			
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
	if(n==sum)

		System.out.println("Number is perfect with sum "+ sum);
	else
		System.out.println("Number is not perfect");
		}

	}


