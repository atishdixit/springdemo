package search;

import java.util.Arrays;

public class LinearSearch implements SearchStrategy {

	@Override
	public Number search(Number[] list, Number number) {
		return Arrays
				.asList(list)
				.stream()
				.filter(x->x.equals(number))
				.findAny()
				.get();
	}

}
