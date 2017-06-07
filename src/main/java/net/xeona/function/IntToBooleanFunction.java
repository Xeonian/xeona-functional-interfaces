package net.xeona.function;

public interface IntToBooleanFunction<X extends Throwable> {

	boolean apply(int value) throws X;

}
