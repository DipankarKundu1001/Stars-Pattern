package org.patern.Stars;

import java.util.Scanner;

/*
				*       *
				**     **
				***   ***
				**** ****
				*********
				**** ****
				***   ***
				**     **
				*       *

 */
public class Pattern3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of lines :- ");
		int n = sc.nextInt();
		sc.close();
		
		printPattern(n);
	}

	private static void printPattern(int n) 
	{
		for(int i = 1; i <= (2*n-1); i++)
		{
			if(i <= n)
			{
				for(int j = 1; j <= (2*n-1); j++)
				{
					if(i >= j || j >= (2*n-i))
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			else
			{
				for(int j = 1; j <= (2*n-1); j++)
				{
					if(i <= j || j <= (2*n-i))
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
