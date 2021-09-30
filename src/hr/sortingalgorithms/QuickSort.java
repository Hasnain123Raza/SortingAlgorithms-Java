package hr.sortingalgorithms;

import hr.sortingalgorithms.SortingAlgorithm;

import java.lang.Comparable;

public class QuickSort implements SortingAlgorithm
{
    public <T extends Comparable> void sort(T[] array)
    {
        int low = 0;
        int high = array.length-1;
        quickSort(array, low, high);

    }

    private <T extends Comparable> void quickSort(T[] array, int low, int high)
    {
        if (low < high)
        {
            int PartitionIndex = partition(array, low, high);

            quickSort(array, low, PartitionIndex-1);
            quickSort(array, PartitionIndex+1, high);
        }
    }

    private <T extends Comparable> int partition(T[] array, int low, int high)
    {
        int i = (low-1);
        for (int j = low; j <= high-1; j++)
        {
            if (array[j].compareTo(array[high]) <= 0)
            {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }

    private <T extends Comparable> void swap(T[] array, int i, int j)
    {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
