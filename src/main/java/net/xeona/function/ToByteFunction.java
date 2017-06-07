package net.xeona.function;

public interface ToByteFunction<A, X extends Throwable> {

	byte apply(A argument) throws X;
	
}
