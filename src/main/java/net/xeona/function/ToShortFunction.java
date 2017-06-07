package net.xeona.function;

public interface ToShortFunction<A, X extends Throwable> {

	short apply(A argument) throws X;
	
}
