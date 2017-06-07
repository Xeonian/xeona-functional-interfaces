package net.xeona.function;

public interface CharToFloatFunction<X extends Throwable> {

	float apply(char argument) throws X;
	
}
