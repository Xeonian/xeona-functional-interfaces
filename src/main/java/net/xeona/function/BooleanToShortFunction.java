package net.xeona.function;

public interface BooleanToShortFunction<X extends Throwable> {

	short apply(byte value) throws X;

}
