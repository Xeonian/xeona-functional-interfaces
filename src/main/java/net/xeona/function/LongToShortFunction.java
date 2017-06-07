package net.xeona.function;

public interface LongToShortFunction<X extends Throwable> {

	short apply(long argument) throws X;

}
