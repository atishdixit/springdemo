package sort;

import java.util.Arrays;

public class BubbleSort implements SortStrategy {

	@Override
	public Number[] sort(Number[] list) {
		System.out.println("Bubbel Sort");
		 Arrays.sort(list);
		 return list;
	}

}
