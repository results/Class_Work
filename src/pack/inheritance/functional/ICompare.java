package pack.inheritance.functional;

@FunctionalInterface
public interface ICompare<T> {

		T compare(T compare, T to);
}
