package pack.inheritance.functional;

public class SquareMain {

	public static void main(String[] args) {
		int x = 4;
		int power = 2;
		ICalculate sq = () -> {
			return (int) Math.pow(x, power);
		};
		System.out.println(sq.calculate());
	}

}
