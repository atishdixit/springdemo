package singeleton;
 
public class DoubleCheckedLockingSingleton {
 
    // this field should be volatile to avoid half baked object creation
    private static DoubleCheckedLockingSingleton instance;   
 
    private DoubleCheckedLockingSingleton() 
    {
       // 10000 lines of initialization code
    }
 
    public static DoubleCheckedLockingSingleton getInstance() 
    {
        if (instance == null) 
        {
            synchronized (DoubleCheckedLockingSingleton.class) 
            {
                if (instance == null) 
                {
                    instance = new DoubleCheckedLockingSingleton();
                    System.out.println("Instance Created");
                }
            }
 
        }
        return instance;
    }
 
}