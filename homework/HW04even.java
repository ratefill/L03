package by.epam.l03.homework;

/*���� ������������������ ����������� ����� �1 , �2 ,..., �n . ������� ������ ��
������ ����� ���� ������������������. ���� ����� ����� ���, �� �������
��������� �� ���� �����.*/

public class HW04even
{

	private static int[] array = { 7, 2, 5, 8, 12, 3, 4, 1, 1, 2, 16, 9 };// 12
																			// ���������
	private static int[] array2 = { 7, 3, 5, 3, 1, 3, 9, 1, 1, 5, 17, 9 };// 12
																			// ���������

	public static void main(String[] args)
	{
		Calc(array);
		Calc(array2);
	}

	private static void Calc(int[] arr)
	{
		int count = 0;
		int[] result;//

		// ���������� ���-�� ������ ��������� � ���������� �� � ������
		// ��������� �������
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{
				arr[count] = arr[i];
				count++;
			}
		}
		
		System.out.print("���������: ");
		if (count > 0)
		{
			result = new int[count];

			// ��������� �������� ������ ������� �� ��������� �������
			// (�� ����� ����������� ���� �������� ������!)

			for (int i = 0; i < count; i++)
			{
				result[i] = array[i];
			}
			
			//������� ��������� �� �����
			for (int i = 0; i < count; i++)
			{
				System.out.print(result[i] + "; ");
			}
		}
		else
		{
			System.out.println("������ �� ������� ������ �����");
		}
		System.out.println();
	}
}
