package net.xeona.function;

public interface ToLongFunction<A, X extends Throwable> {

	long apply(A argument) throws X;
	
}
