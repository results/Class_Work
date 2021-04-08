package pack.generics;

public class GenericMulti<datatype,datatypeTwo> {

	datatype valOne;
	datatypeTwo valTwo;
	
	public GenericMulti(datatype valOne, datatypeTwo valTwo) {
		this.valOne = valOne;
		this.valTwo = valTwo;
	}
	
	public datatype getValOne() {
		return valOne;
	}

	public void setValOne(datatype valOne) {
		this.valOne = valOne;
	}

	public datatypeTwo getValTwo() {
		return valTwo;
	}

	public void setValTwo(datatypeTwo valTwo) {
		this.valTwo = valTwo;
	}
	
	
	
}
