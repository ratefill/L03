package by.epam.l03.homework;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/

public class HW06mass
{
	private static int n=9;
	private static int array[][]=new int[n][n];
	
	public static void main(String[] args)
	{
		SetToOne(0,0,0,1);//1-а линия
		SetToOne(n-1,0,0,1);//Последняя линия
		SetToOne(0,0,1,0);//1-ый столбец
		SetToOne(0,n-1,1,0);//последний столбец		
		show();
	}
	
	
	
//установка 1 для строк или столбцов; 
//ai - номер строки, 
//bj номер столбца;
//inc_i - Инкремент для строк
//inc_j - Инкремент для столбцов
	private static void SetToOne(int ai, int bj, int inc_i, int inc_j)
	{
		int i;
		int j;

		for (i = 0, j = 0; i < array.length && j < array[i].length; i += inc_i, j += inc_j)
		{
			array[i+ai][j+bj]=1;
		}
	}
	
	// вывод массива на экран
	private static void show()
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}	
}
