package net.xeona.function;

public interface FloatToDoubleFunction<X extends Throwable> {

	double apply(float argument) throws X;

}
