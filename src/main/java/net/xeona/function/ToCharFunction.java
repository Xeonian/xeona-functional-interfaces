package net.xeona.function;

public interface ToCharFunction<A, X extends Throwable> {

	char apply(A argument) throws X;

}
