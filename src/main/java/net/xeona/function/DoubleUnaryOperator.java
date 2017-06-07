package net.xeona.function;

public interface DoubleUnaryOperator<X extends Throwable> {

	double apply(double argument) throws X;

}
