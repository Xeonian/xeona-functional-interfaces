package net.xeona.function;

public interface BooleanFunction<T, X extends Throwable> {

	T apply(boolean value) throws X;

}
