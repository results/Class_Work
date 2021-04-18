package pack.inheritance.functional.exercise;

@FunctionalInterface
public interface ICalcGeneric<T> {
	
	T compute(T val, T value);

}
