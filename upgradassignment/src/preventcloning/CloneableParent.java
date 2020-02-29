package preventcloning;








public class CloneableParent implements Cloneable{



	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
