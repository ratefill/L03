package by.epam.l03.example;

import java.util.Scanner;

public class Example01
{
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		String num = "";
		//char[] achNum;
		char curSymbol;		
		System.out.print("������� �����: ");
		if (sc.hasNextLine())
			num = sc.nextLine();
		StringBuffer strBuf = new StringBuffer(num);
		strBuf.reverse();
		num = null;
		for (int i = strBuf.length() - 1; i >= 0; i--)
		{
			curSymbol = strBuf.charAt(i);
			switch (i)
			{
			case 2: // �����
				printSotni(curSymbol);
				break;
			case 1:// �������
				if (curSymbol != '1')
					printDeciatk(curSymbol);
				else
				{
					i--;
					curSymbol = strBuf.charAt(i);
					printDeciatkWithEdinic(curSymbol);
				}
				break;
			case 0:// �������
				printEdinic(curSymbol);
				break;
			default:
				System.out.println("����� ����� ��������� ���� ���������.");
				return;
			}
		}
	}

	public static void printEdinic(char i)
	{// �������� �������� ������
		switch (i)
		{
		case '1':
			System.out.print("���� ");
			break;
		case '2':
			System.out.print("��� ");
			break;
		case '3':
			System.out.print("��� ");
			break;
		case '4':
			System.out.print("������ ");
			break;
		case '5':
			System.out.print("���� ");
			break;
		case '6':
			System.out.print("����� ");
			break;
		case '7':
			System.out.print("���� ");
			break;
		case '8':
			System.out.print("������ ");
			break;
		case '9':
			System.out.print("������ ");
			break;
		}
	}

	// �������� �������� ��������
	public static void printDeciatk(char i)
	{
		switch (i)
		{
		case '1':
			System.out.print("������ ");
			break;
		case '2':
			System.out.print("�������� ");
			break;
		case '3':
			System.out.print("�������� ");
			break;
		case '4':
			System.out.print("����� ");
			break;
		case '5':
			System.out.print("��������� ");
			break;
		case '6':
			System.out.print("���������� ");
			break;
		case '7':
			System.out.print("��������� ");
			break;
		case '8':
			System.out.print("����������� ");
			break;
		case '9':
			System.out.print("��������� ");
			break;
		}
	}

	public static void printDeciatkWithEdinic(char i)
	{
		switch (i)
		{
		case '0':
			System.out.print("������ ");
			break;
		case '1':
			System.out.print("����������� ");
			break;
		case '2':
			System.out.print("���������� ");
			break;
		case '3':
			System.out.print("���������� ");
			break;
		case '4':
			System.out.print("������������ ");
			break;
		case '5':
			System.out.print("���������� ");
			break;
		case '6':
			System.out.print("����������� ");
			break;
		case '7':
			System.out.print("���������� ");
			break;
		case '8':
			System.out.print("������������ ");
			break;
		case '9':
			System.out.print("������������ ");
			break;
		}
	}

	// �������� �����
	public static void printSotni(char i)
	{
		switch (i)
		{
		case '1':
			System.out.print("��� ");
			break;
		case '2':
			System.out.print("������ ");
			break;
		case '3':
			System.out.print("������ ");
			break;
		case '4':
			System.out.print("��������� ");
			break;
		case '5':
			System.out.print("������� ");
			break;
		case '6':
			System.out.print("�������� ");
			break;
		case '7':
			System.out.print("������� ");
			break;
		case '8':
			System.out.print("��������� ");
			break;
		case '9':
			System.out.print("��������� ");
			break;
		}
	}
}