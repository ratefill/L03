package by.epam.l03.example;

import java.util.Scanner;

public class Example03
{
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		int n = 10;
		String[] arStr = new String[n];

		String str = "";
		for (int i = 0; i < n; i++)
		{
			System.out.print("> ");
			if (sc.hasNextLine())
			{
				str = sc.nextLine();
				arStr[i] = str;
			}
		}
		for (int i = 0; i < arStr.length; i++)
		{
			for (int j = 0; j < arStr.length - 1; j++)
			{
				if (arStr[j].length() > arStr[j + 1].length())
				{
					String temp = arStr[j];
					arStr[j] = arStr[j + 1];
					arStr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arStr.length; i++)
		{
			System.out.println("-> " + arStr[i] + " length=" + arStr[i].length());
		}
	}
}
