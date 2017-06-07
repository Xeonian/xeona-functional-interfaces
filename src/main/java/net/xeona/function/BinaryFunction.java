package net.xeona.function;

public interface BinaryFunction<A, B, R, X extends Throwable> {

	R apply(A argument1, B argument2) throws X;
	
}
