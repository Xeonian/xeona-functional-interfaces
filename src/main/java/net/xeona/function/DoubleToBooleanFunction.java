package net.xeona.function;

public interface DoubleToBooleanFunction<X extends Throwable> {

	boolean apply(double argument) throws X;

}
