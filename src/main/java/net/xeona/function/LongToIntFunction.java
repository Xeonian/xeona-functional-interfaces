package net.xeona.function;

public interface LongToIntFunction<X extends Throwable> {

	int apply(long argument) throws X;

}
