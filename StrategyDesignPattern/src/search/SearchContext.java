package search;

public class SearchContext {
	private SearchStrategy searchStrategy;

	public SearchContext(SearchStrategy searchStrategy) {
		super();
		this.searchStrategy = searchStrategy;
	}
	
	public Number search(Number list[], Number number) {
		return searchStrategy.search(list, number);
	}

	public void setSearchStrategy(SearchStrategy searchStrategy) {
		this.searchStrategy = searchStrategy;
	}
	
	
	
}
