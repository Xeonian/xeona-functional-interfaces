package net.xeona.function;

public interface IntUnaryOperator<X extends Throwable> {

	int apply(int value) throws X;

}
