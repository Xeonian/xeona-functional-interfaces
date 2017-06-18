package net.xeona.function;

public interface BooleanToShortFunction<X extends Throwable> {

	short apply(boolean value) throws X;

}
