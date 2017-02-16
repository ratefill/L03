package by.epam.l03.example;

public class Array02
{
	public static void main(String[] args)
	{
		int i;
		int ar2_2[][] = new int[4][];
		for (i = 0; i < ar2_2.length; i++)
		{
			ar2_2[i] = new int[(int) (Math.random() * 100)];
		}
		System.out.println("Количество строк = " + ar2_2.length);
		for (i = 0; i < ar2_2.length; i++)
		{
			System.out.println("Количество элементов в " + i + "-й строке = " + ar2_2[i].length);
		}
	}
}
