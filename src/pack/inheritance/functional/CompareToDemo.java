package pack.inheritance.functional;

public class CompareToDemo {

	public static void main(String[] args) {
		String compare = "clifford";
		String to = "dog";
		ICompare<String> comparer = (String x,String y) -> {
			return "The Strings are "+(x.equalsIgnoreCase(y) ? "the same." : "different.");	
		};
		System.out.println(comparer.compare(compare, to));
	}

}
