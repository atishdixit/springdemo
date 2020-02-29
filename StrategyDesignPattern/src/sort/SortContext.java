package sort;

public class SortContext {

	private SortStrategy strategy;

	
	public SortContext(SortStrategy strategy) {
		super();
		this.strategy = strategy;
	}

	public SortStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(SortStrategy strategy) {
		this.strategy = strategy;
	}

	public Number[] sort(Number list[]) {
		return strategy.sort(list);
	}
	
}
