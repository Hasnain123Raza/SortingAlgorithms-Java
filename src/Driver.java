import hr.sortingalgorithms.*;

import java.util.Random;

public class Driver
{
	private static Random random = new Random();

	public static void main(String[] args)
	{
		SelectionSort selectionSort = new SelectionSort();
		testSortingAlgorithm(selectionSort);
	}

	public static <T extends SortingAlgorithm> void testSortingAlgorithm(T sortingAlgorithm)
	{
		int sortingArrayLengths[] = {1, 2, 10};

		for (int index = 0; index < sortingArrayLengths.length; index++)
		{
			Integer array[] = generateRandomArray(sortingArrayLengths[index]);
			
			System.out.println("Unsorted array: ");
			printArray(array);

			sortingAlgorithm.sort(array);

			System.out.println("Sorted array: ");
			printArray(array);

			if (isSortedAscending(array))
				System.out.println("[SUCCESS] SORTED");
			else
				System.out.println("[FAILED] NOT SORTED");
		}
	}

	public static <T extends Comparable> boolean isSortedAscending(T array[])
	{
		if (array.length == 1)
			return true;

		for (int index = 0; index < array.length - 1; index++)
			if (array[index].compareTo(array[index + 1]) > 0)
				return false;
		return true;
	}

	public static <T> void printArray(T array[])
	{
		for (int index = 0; index < array.length; index++)
			System.out.print(array[index] + ", ");
		System.out.println("");
	}

	public static Integer[] generateRandomArray(int length)
	{
		Integer array[] = new Integer[length];
		
		for (int counter = 0; counter < length; counter++)
			array[counter] = (Integer)random.nextInt(100);

		return array;
	}
}
