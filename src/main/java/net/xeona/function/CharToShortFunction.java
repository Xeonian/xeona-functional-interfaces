package net.xeona.function;

public interface CharToShortFunction<X extends Throwable> {

	short apply(char argument) throws X;
	
}
