import hr.sortingalgorithms.SelectionSort;

public class Driver
{

	public static void main(String[] args)
	{
		Integer unsortedArray[] = {5, 3, 2, 6, 7, 1, 9};

		System.out.println("Unsorted array: ");
		for (int index = 0; index < unsortedArray.length; index++)
			System.out.print(unsortedArray[index] + ", ");
		System.out.println("");

		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(unsortedArray);

		System.out.println("Sorted array: ");
		for (int index = 0; index < unsortedArray.length; index++)
			System.out.print(unsortedArray[index] + ", ");
		System.out.println("");
	}

}
