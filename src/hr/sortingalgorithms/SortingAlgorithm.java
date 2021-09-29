package hr.sortingalgorithms;

import java.lang.Comparable;

public interface SortingAlgorithm
{

	public <T extends Comparable> void sort(T[] array);

}
