package net.xeona.function;

public interface DoubleProvider<X extends Throwable> {

	double get() throws X;

}
