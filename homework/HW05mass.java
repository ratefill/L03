package by.epam.l03.homework;

/*������������ ���������� ������� ������� n �� ��������� ������� (n - ������)*/

public class HW05mass
{
	private static int n = 9; // ������ �������
	private static int[][] array = new int[n][n];

	public static void main(String[] args)
	{
		for (int i = 0; i < n; i++)
		{
			if (i % 2 == 0)
			{
				Line(array[i], 1, 1);
			}
			else
			{
				Line(array[i], n, -1);
			}
		}
		show();

	}

	// ��������� ������� num - ��������� �������, inc - ���������
	private static void Line(int[] arr, int num, int inc)
	{
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = num + i * inc;
		}
	}

	// ����� ������� �� �����
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
