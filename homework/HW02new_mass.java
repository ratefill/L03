package by.epam.l03.homework;

/*� ������������� ������������������ ���� ������� ��������. ������� ������ ��
������� ���� ���������.*/

public class HW02new_mass
{

	private static int[] array = { 0, 2, 5, 8, 0, 3, 4, 1, 1, 0, 0, 9 };// 12
																		// ���������

	public static void main(String[] args)
	{
		Firstway();
		Secondway();// �������: ��� �������� ������� ������������ �� ���������
					// ������������ ������
	}

	private static void Firstway()
	{
		int count = 0;
		int[] result;//

		int i = 0, j = 0;// ������������ ����������

		// ���������� ���-�� ������� ���������
		for (i = 0; i < array.length; i++)
		{
			if (array[i] == 0)
			{
				count++;
			}
		}

		result = new int[count];

		// ��������� ������

		for (i = 0; i < array.length; i++)
		{
			if (array[i] == 0)
			{
				result[j] = i;
				j++;
			}
		}

		System.out.println("������ ������ �������:");

		for (i = 0; i < count; i++)
		{
			System.out.println("result[" + i + "]=" + result[i] + "; ");
		}
	}

	private static void Secondway()
	{
		int count = 0;
		int[] result;//

		int i = 0;// ������������ ����������

		// ���������� ���-�� ������� ��������� � ���������� �� ������ � ������
		// ��������� �������
		for (i = 0; i < array.length; i++)
		{
			if (array[i] == 0)
			{
				array[count] = i;
				count++;
			}
		}

		result = new int[count];

		// ��������� �������� ������ ������� �� ��������� �������
		// (�� ����� ����������� ���� �������� ������!)

		for (i = 0; i < count; i++)
		{
			result[i] = array[i];
		}
		
		System.out.println("������ ������ �������:");

		for (i = 0; i < count; i++)
		{
			System.out.println("result[" + i + "]=" + result[i] + "; ");
		}
	}

}
