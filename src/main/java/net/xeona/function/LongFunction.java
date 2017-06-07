package net.xeona.function;

public interface LongFunction<R, X extends Throwable> {

	R apply(long argument) throws X;

}
