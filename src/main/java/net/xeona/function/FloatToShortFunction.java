package net.xeona.function;

public interface FloatToShortFunction<X extends Throwable> {

	short apply(float argument) throws X;

}
