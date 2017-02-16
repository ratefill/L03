package by.epam.l03.example;

import java.util.Scanner;

public class WithArray02
{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		double[] ar = new double[10];
		
		for (int i = 0; i < ar.length; i++)
		{
			System.out.print("ar[" + i + "]=>");
			ar[i] = sc.nextDouble();
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++)
		{
			System.out.println(">arr[" + i + "]=" + ar[i]);
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++)
		{
			System.out.print("arr[" + i + "]=" + ar[i] + "; ");
		}
		System.out.println();
	}
}