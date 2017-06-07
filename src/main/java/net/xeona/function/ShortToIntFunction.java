package net.xeona.function;

public interface ShortToIntFunction<X extends Throwable> {

	int apply(short argument) throws X;

}
