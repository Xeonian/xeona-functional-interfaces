package net.xeona.function;

public interface BooleanToLongFunction<X extends Throwable> {

	long apply(boolean value) throws X;

}
