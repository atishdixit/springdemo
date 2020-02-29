package upgradassignment;

import java.util.HashMap;
import java.util.Map;

public class AppContext {

    private static AppContext appCtx;
    private Map<String, Object> appCtxData;

    private AppContext() {
        appCtxData = new HashMap<>();
    }

  
    public static AppContext getAppContext() {
            if (appCtx == null) {
                synchronized (AppContext.class) {
                    if (appCtx == null) {
                       appCtx = new AppContext();
                    }
                }
            }
        
        return appCtx;       
    }
        
    public Object getData(String key){
        return this.appCtxData.get(key);
    }
    
    public void setData(String key, Object value){
         this.appCtxData.put(key, value);
    }

	@Override
	public String toString() {
		return "AppContext [appCtxData=" + appCtxData + "]";
	} 
}
