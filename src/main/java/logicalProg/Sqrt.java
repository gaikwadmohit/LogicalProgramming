package logicalProg;

import java.util.Scanner;

public class Sqrt {
	

	public static void main(String[] args)  {

			Scanner s = new Scanner(System.in);
			System.out.println("enter no to find square root");
			double c = s.nextDouble();
			System.out.println("square root is " + Math.sqrt(c));
			s.close();

		}

	}
