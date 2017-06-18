package net.xeona.function;

public interface BooleanToDoubleFunction<X extends Throwable> {

	double apply(boolean value) throws X;

}
