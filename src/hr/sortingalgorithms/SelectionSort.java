package hr.sortingalgorithms;

import hr.sortingalgorithms.SortingAlgorithm;

import java.lang.Comparable;

public class SelectionSort implements SortingAlgorithm
{

	@SuppressWarnings("unchecked")
	public <T extends Comparable> void sort(T array[])
	{
		for (int i = 0; i < array.length - 1; i++)
		{
			T minimumValue = array[array.length - 1];
			int minimumIndex = array.length - 1;

			for (int j = i; j < array.length; j++)
			{
				if (array[j].compareTo(minimumValue) < 0)
				{
					minimumValue = array[j];
					minimumIndex = j;
				}
			}

			T temp = array[i];
			array[i] = array[minimumIndex];
			array[minimumIndex] = temp;
		}
	}

}
