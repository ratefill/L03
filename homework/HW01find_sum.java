package by.epam.l03.homework;

import java.util.Random;

/*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, 
которые кратны данному К*/

public class HW01find_sum
{
	public static void main(String[] args)
	{
		final int N = 10; // размер массива
		final int K = 2; // число для проверки накратность

		int sum = 0;

		int[] array = new int[N];

		// заполнение массива случайными числами
		Random rand = new Random(100);
		for (int i = 0; i < array.length; i++)
		{
			array[i] = rand.nextInt(10);
		}

		// сумма тех элементов, которые кратны К
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % K == 0)
			{
				sum += array[i];
			}
		}
		System.out.println("Сумма, элементов кратных К, ровна "+ sum);
	}
}
