package net.xeona.function;

public interface ToFloatFunction<A, X extends Throwable> {

	float apply(A argument) throws X;
	
}
