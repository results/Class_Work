package pack.inheritance.functional;

public class CompareToDemo {

	public static void main(String[] args) {
		ICompare<Integer> comparer = (Integer x,Integer y) -> (x > y ? x : y);	
		System.out.println("largest value is: "+comparer.compare(234243, 32489742));
	}

}
