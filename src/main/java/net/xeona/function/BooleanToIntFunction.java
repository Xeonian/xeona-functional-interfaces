package net.xeona.function;

public interface BooleanToIntFunction<X extends Throwable> {

	int apply(boolean value) throws X;

}
