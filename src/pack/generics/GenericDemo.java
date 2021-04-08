package pack.generics;

public class GenericDemo <datatype> {
	
	private datatype a;
	
	public GenericDemo(datatype a) {
		this.a = a;
	}
	
	public void setValue(datatype b) {
		this.a = b;
	}
	
	public datatype GetField() {
		return a;
	}
	

}
