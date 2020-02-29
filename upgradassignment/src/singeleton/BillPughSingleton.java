package singeleton;
public class BillPughSingleton {
	
	//	Is there any way by which we can create singleton object lazily without faceing issue of multithreading 
    private BillPughSingleton(){}
     
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
     
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}