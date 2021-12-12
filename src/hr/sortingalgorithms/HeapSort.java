package hr.sortingalgorithms;

import hr.sortingalgorithms.SortingAlgorithm;

public class HeapSort implements SortingAlgorithm {

	@SuppressWarnings("unchecked")
	public <T extends Comparable> void sort(T[] array)
	{
		for (int index = array.length/2 - 1; index >= 0; index--)
			heapify(array, array.length, index);

		for (int index = array.length - 1; index > 0; index--)
		{
			T temporary = array[0];
			array[0] = array[index];
			array[index] = temporary;

			heapify(array, index, 0);
		}
	}

	@SuppressWarnings("unchecked")
	private <T extends Comparable> void heapify(T[] array, int length, int index)
	{
		int largestIndex = index;
		int leftIndex = 2 * index + 1;
		int rightIndex = 2 * index + 2;

		if (leftIndex < length && array[leftIndex].compareTo(array[largestIndex]) > 0)
			largestIndex = leftIndex;

		if (rightIndex < length && array[rightIndex].compareTo(array[largestIndex]) > 0)
			largestIndex = rightIndex;

		if (largestIndex != index)
		{
			T temporary = array[index];
			array[index] = array[largestIndex];
			array[largestIndex] = temporary;

			heapify(array, length, largestIndex);
		}
	}

}
