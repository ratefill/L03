package by.epam.l03.homework;

/*¬ целочисленной последовательности есть нулевые элементы. —оздать массив из
номеров этих элементов.*/

public class HW02new_mass
{

	private static int[] array = { 0, 2, 5, 8, 0, 3, 4, 1, 1, 0, 0, 9 };// 12
																		// элементов

	public static void main(String[] args)
	{
		Firstway();
		Secondway();// лайфхак: как избежать второго сканировани€ не использу€
					// динамический массив
	}

	private static void Firstway()
	{
		int count = 0;
		int[] result;//

		int i = 0, j = 0;// итерационные переменные

		// определ€ем кол-во нулевых элементов
		for (i = 0; i < array.length; i++)
		{
			if (array[i] == 0)
			{
				count++;
			}
		}

		result = new int[count];

		// заполн€ем массив

		for (i = 0; i < array.length; i++)
		{
			if (array[i] == 0)
			{
				result[j] = i;
				j++;
			}
		}

		System.out.println("ѕервый способ решени€:");

		for (i = 0; i < count; i++)
		{
			System.out.println("result[" + i + "]=" + result[i] + "; ");
		}
	}

	private static void Secondway()
	{
		int count = 0;
		int[] result;//

		int i = 0;// итерационные переменные

		// определ€ем кол-во нулевых элементов и записываем их номера в начало
		// исходного массива
		for (i = 0; i < array.length; i++)
		{
			if (array[i] == 0)
			{
				array[count] = i;
				count++;
			}
		}

		result = new int[count];

		// заполн€ем итоговый массив данными из исходного массива
		// (не нужно сканировать весь исходный массив!)

		for (i = 0; i < count; i++)
		{
			result[i] = array[i];
		}
		
		System.out.println("¬торой способ решени€:");

		for (i = 0; i < count; i++)
		{
			System.out.println("result[" + i + "]=" + result[i] + "; ");
		}
	}

}
