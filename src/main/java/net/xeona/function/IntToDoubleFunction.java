package net.xeona.function;

public interface IntToDoubleFunction<X extends Throwable> {

	double apply(int value) throws X;

}
