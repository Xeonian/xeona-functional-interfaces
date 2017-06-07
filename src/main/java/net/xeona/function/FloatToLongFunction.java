package net.xeona.function;

public interface FloatToLongFunction<X extends Throwable> {

	long apply(float argument) throws X;

}
