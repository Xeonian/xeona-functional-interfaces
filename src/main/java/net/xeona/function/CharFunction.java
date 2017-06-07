package net.xeona.function;

public interface CharFunction<R, X extends Throwable> {

	R apply(char value) throws X;

}
