package logicalProg;

import java.util.Scanner;

public class Fibonacci {

	
	
			public static void main(String[] args) {
				int a,b;
				Scanner s=new Scanner(System.in);
				System.out.println("Enter value of a and b for fabinacci series");
				a=s.nextInt();
				b=s.nextInt();
				int n=10;
				
				int c;
				System.out.println("Enter no of times series get run");
				n=s.nextInt();
				for(int i=0;i<=n;i++)
				{
					c=a+b;
					System.out.print(c+ "  ");
					a=b;
					b=c;		
				}
			
			
			}
		}