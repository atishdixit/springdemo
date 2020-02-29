package search;

import java.util.Arrays;

public class BinarySearch implements SearchStrategy {

	@Override
	public Number search(Number[] list, Number number) {
		return Arrays.binarySearch(list , number);
		
	}

}
