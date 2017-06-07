package net.xeona.function;

public interface ToDoubleFunction<A, X extends Throwable> {

	double apply(A argument) throws X;

}
