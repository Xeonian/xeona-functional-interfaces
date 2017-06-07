package net.xeona.function;

public interface DoubleToFloatFunction<X extends Throwable> {

	float apply(double argument) throws X;

}
