package sort;

import java.util.Arrays;

public class QuickSort implements SortStrategy {

	@Override
	public Number[] sort(Number[] list) {
		System.out.println("Quick Sort");
		 Arrays.sort(list);
		 return list;
	}

}
