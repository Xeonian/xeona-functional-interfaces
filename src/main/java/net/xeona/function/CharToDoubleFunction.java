package net.xeona.function;

public interface CharToDoubleFunction<X extends Throwable> {

	double apply(char value) throws X;
	
}
