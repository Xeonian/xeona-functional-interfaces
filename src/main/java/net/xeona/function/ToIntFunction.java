package net.xeona.function;

public interface ToIntFunction<A, X extends Throwable> {
	
	int apply(A argument) throws X;

}
