package net.xeona.function;

public interface DoubleToLongFunction<X extends Throwable> {

	long apply(double argument) throws X;
	
}
