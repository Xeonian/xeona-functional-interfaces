package net.xeona.function;

public interface DoubleToCharFunction<X extends Throwable> {

	char apply(double argument) throws X;

}
