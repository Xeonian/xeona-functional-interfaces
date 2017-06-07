package net.xeona.function;

public interface FloatToIntFunction<X extends Throwable> {

	int apply(float argument) throws X;

}
