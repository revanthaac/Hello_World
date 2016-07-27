package Practice;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public  class StudentGrade_Compare_constructor implements Comparator<Object> {

	public int compare(StudentList_Constructor o1, StudentList_Constructor o2) {

		// descending order (ascending order would be:
		// o1.getGrade()-o2.getGrade())
		return (o2.getGrade() - o1.getGrade());
	}

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Comparator<Object> reversed() {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Object> thenComparing(Comparator<? super Object> other) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U> Comparator<Object> thenComparing(
			Function<? super Object, ? extends U> keyExtractor,
			Comparator<? super U> keyComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	public <U extends Comparable<? super U>> Comparator<Object> thenComparing(
			Function<? super Object, ? extends U> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Object> thenComparingInt(
			ToIntFunction<? super Object> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Object> thenComparingLong(
			ToLongFunction<? super Object> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Comparator<Object> thenComparingDouble(
			ToDoubleFunction<? super Object> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsFirst(Comparator<? super T> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> nullsLast(Comparator<? super T> comparator) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T, U> Comparator<T> comparing(
			Function<? super T, ? extends U> keyExtractor,
			Comparator<? super U> keyComparator) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
			Function<? super T, ? extends U> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingInt(
			ToIntFunction<? super T> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingLong(
			ToLongFunction<? super T> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> Comparator<T> comparingDouble(
			ToDoubleFunction<? super T> keyExtractor) {
		// TODO Auto-generated method stub
		return null;
	}

}
