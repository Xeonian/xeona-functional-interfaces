package net.xeona.function;

public interface Function<A, R, X extends Throwable> {

	R apply(A argument) throws X;
	
	static <A, R> Function<A, R, RuntimeException> fromFunction(java.util.function.Function<? super A, ? extends R> function) {
		return argument -> function.apply(argument);
	}
	
	static <A, R> java.util.function.Function<A, R> toFunction(Function<? super A, ? extends R, ? extends RuntimeException> function) {
		return argument -> function.apply(argument);
	}
	
	static <T> Function<T, T, RuntimeException> identity() {
		return argument -> argument;
	}
	
}
