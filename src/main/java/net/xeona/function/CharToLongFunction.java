package net.xeona.function;

public interface CharToLongFunction<X extends Throwable> {

	long apply(char argument) throws X;
	
}
