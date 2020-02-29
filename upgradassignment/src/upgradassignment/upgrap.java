package upgradassignment;

public class upgrap {

	public static void main(String[] args) {
	
		System.out.println("Singleton testing......");
		AppContext appContext1 = AppContext.getAppContext();
		AppContext appContext2 = AppContext.getAppContext();
		
		System.out.println(appContext1);
		System.out.println(appContext2);
		
		System.out.println(appContext1.hashCode());
		System.out.println(appContext2.hashCode());
		
		System.out.println(appContext2.equals(appContext1));
		
			
//		for(int i = 1; i< 500; i++) {
//			new Thread(()->{
//				
//				System.out.println(AppContext.getAppContext().hashCode());
//			
//			}).start();;
//		}
		
		
		
		
	}
}
