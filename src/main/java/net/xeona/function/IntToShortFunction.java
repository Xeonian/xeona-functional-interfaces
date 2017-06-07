package net.xeona.function;

public interface IntToShortFunction<X extends Throwable> {

	short apply(int value) throws X;

}
