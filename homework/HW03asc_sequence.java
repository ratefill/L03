package by.epam.l03.homework;

/*���� ������������������ �������������� ����� �1 �2 ,..., �n . 
��������, ����� �� ��� ������������.*/

public class HW03asc_sequence
{
	public static void main(String[] args)
	{
		double[] array1 = { 1, 2, 5, 18, 26, 27, 40, 100, 1000, 1001, 1002, 9999 };// 12 ���������
		double[] array2 = { 1, 2, 5, 18, 26, 27, 40, 100, 1000, 1001, 1002, 1000 };// 12 ���������
				
		check(array1);//12 ������ ������������ ���������
		check(array2);//����� ����������� � ���������� ��������� ���������
		
	}
	
	private static void check(double[] array)
	{
		boolean result=true;
		for (int i = 0; i < array.length-1; i++)
		{
			if (array[i] >= array[i+1])
			{
				result=false;
				break;
			}
		}		
		System.out.println(result);		
	}
}
