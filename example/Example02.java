package by.epam.l03.example;

import java.util.Random;

public class Example02
{
	public static void main(String[] args)
	{
		final int n = 10;
		int[] mas = new int[n];
		int[][] matric = new int[10][10];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++)
		{
			mas[i] = rand.nextInt(10);
		}
		System.out.println("Masiv: ");
		for (int i = 0; i < mas.length; i++)
		{
			System.out.print(mas[i] + " ");
		}
		for (int i = 0; i < matric.length; i++)
		{
			for (int j = 0; j < matric[i].length; j++)
			{
				matric[i][j] = (int) Math.pow(mas[j], i);
			}
		}
		System.out.println("\nMatrica: ");
		for (int[] i : matric)
		{
			for (int j : i)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
