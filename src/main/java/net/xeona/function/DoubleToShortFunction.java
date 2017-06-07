package net.xeona.function;

public interface DoubleToShortFunction<X extends Throwable> {

	short apply(double argument) throws X;

}
