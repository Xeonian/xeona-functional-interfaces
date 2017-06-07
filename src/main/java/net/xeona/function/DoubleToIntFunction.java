package net.xeona.function;

public interface DoubleToIntFunction<X extends Throwable> {

	int apply(double argument) throws X;

}
