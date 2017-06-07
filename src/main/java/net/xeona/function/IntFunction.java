package net.xeona.function;

public interface IntFunction<T, X extends Throwable> {
	
	T apply(int value) throws X;

}
