package by.epam.l03.homework;

import java.util.Random;

/*Â ìàññèâ A [N] çàíåñåíû íàòóðàëüíûå ÷èñëà. Íàéòè ñóììó òåõ ýëåìåíòîâ, 
êîòîðûå êðàòíû äàííîìó Ê*/

public class HW01find_sum
{
	public static void main(String[] args)
	{
		final int N = 10; // ðàçìåð ìàññèâà
		final int K = 2; // ÷èñëî äëÿ ïðîâåðêè íàêðàòíîñòü

		int sum = 0;

		int[] array = new int[N];

		// çàïîëíåíèå ìàññèâà ñëó÷àéíûìè ÷èñëàìè
		Random rand = new Random(100);
		for (int i = 0; i < array.length; i++)
		{
			array[i] = rand.nextInt(10);
		}

		// ñóììà òåõ ýëåìåíòîâ, êîòîðûå êðàòíû Ê
		for (int i = 0; i < array.length; i++)// решение всех подзадач всегда следует оформлять отдельными методами
		{
			if (array[i] % K == 0)
			{
				sum += array[i];
			}
		}
		System.out.println("Ñóììà, ýëåìåíòîâ êðàòíûõ Ê, ðîâíà "+ sum);
	}
}
