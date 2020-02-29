package search;

public class Application {

	public static void main(String[] args) {
		SearchStrategy searchStrategy = new BinarySearch();
		SearchContext context = new SearchContext(searchStrategy);
		
		System.out.println(context.search(new Integer[]{5,6,7,8}, 
				new Integer(6)));
		
		searchStrategy = new LinearSearch();
		context.setSearchStrategy(searchStrategy);
		
		System.out.println(context.search(new Integer[]{5,6,7,8}, 
				new Integer(6)));
		
	}

}
