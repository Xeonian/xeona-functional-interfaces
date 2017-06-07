package net.xeona.function;

public interface IntToLongFunction<X extends Throwable> {

	long apply(int value) throws X;

}
