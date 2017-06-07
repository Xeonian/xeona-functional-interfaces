package net.xeona.function;

public interface CharToIntFunction<X extends Throwable> {

	int apply(char function) throws X;

}
