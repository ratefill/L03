package by.epam.l03.homework;

/*ƒана последовательность натуральных чисел а1 , а2 ,..., аn . —оздать массив из
четных чисел этой последовательности. ≈сли таких чисел нет, то вывести
сообщение об этом факте.*/

public class HW04even
{

	private static int[] array = { 7, 2, 5, 8, 12, 3, 4, 1, 1, 2, 16, 9 };// 12
																			// элементов
	private static int[] array2 = { 7, 3, 5, 3, 1, 3, 9, 1, 1, 5, 17, 9 };// 12
																			// элементов

	public static void main(String[] args)
	{
		Calc(array);
		Calc(array2);
	}

	private static void Calc(int[] arr)
	{
		int count = 0;
		int[] result;//

		// определ€ем кол-во четных элементов и записываем их в начало
		// исходного массива
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{
				arr[count] = arr[i];
				count++;
			}
		}
		
		System.out.print("–езультат: ");
		if (count > 0)
		{
			result = new int[count];

			// заполн€ем итоговый массив данными из исходного массива
			// (не нужно сканировать весь исходный массив!)

			for (int i = 0; i < count; i++)
			{
				result[i] = array[i];
			}
			
			//выводим результат на экран
			for (int i = 0; i < count; i++)
			{
				System.out.print(result[i] + "; ");
			}
		}
		else
		{
			System.out.println("ћассив не содерит четных чисел");
		}
		System.out.println();
	}
}
