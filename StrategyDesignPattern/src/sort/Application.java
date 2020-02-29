package sort;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		SortStrategy sortStrategy = new BubbleSort();
		
		SortContext context =  new SortContext(sortStrategy);
		Integer[] sortedList = (Integer[]) context.sort(new Integer[] {9,8,1,5,7,6,2});
		Arrays.asList(sortedList).forEach(System.out::println);
	}

}
