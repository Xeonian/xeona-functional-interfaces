package net.xeona.function;

public interface LongUnaryOperator<X extends Throwable> {

	long apply(long argument) throws X;

}
