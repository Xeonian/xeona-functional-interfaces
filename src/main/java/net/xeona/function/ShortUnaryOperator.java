package net.xeona.function;

public interface ShortUnaryOperator<X extends Throwable> {

	short apply(short argument) throws X;

}
