package by.epam.l03.homework;

import java.util.Random;

/*� ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, 
������� ������ ������� �*/

public class HW01find_sum
{
	public static void main(String[] args)
	{
		final int N = 10; // ������ �������
		final int K = 2; // ����� ��� �������� �����������

		int sum = 0;

		int[] array = new int[N];

		// ���������� ������� ���������� �������
		Random rand = new Random(100);
		for (int i = 0; i < array.length; i++)
		{
			array[i] = rand.nextInt(10);
		}

		// ����� ��� ���������, ������� ������ �
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] % K == 0)
			{
				sum += array[i];
			}
		}
		System.out.println("�����, ��������� ������� �, ����� "+ sum);
	}
}
