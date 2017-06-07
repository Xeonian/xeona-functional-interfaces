package net.xeona.function;

public interface LongToDoubleFunction<X extends Throwable> {

	double apply(long argument) throws X;

}
