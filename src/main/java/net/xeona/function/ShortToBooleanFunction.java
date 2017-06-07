package net.xeona.function;

public interface ShortToBooleanFunction<X extends Throwable> {

	boolean apply(short argument) throws X;

}
