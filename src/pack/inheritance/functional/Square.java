package pack.inheritance.functional;

public class Square implements ICalculate{

	@Override
	public int calculate() {
		return (int) Math.pow(100, 2);
	}

}
