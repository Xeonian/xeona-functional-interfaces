package net.xeona.function;

public interface DoubleFunction<R, X extends Throwable> {

	R apply(double argument) throws X;

}
