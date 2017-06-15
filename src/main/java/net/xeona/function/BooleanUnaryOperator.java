package net.xeona.function;

public interface BooleanUnaryOperator<X extends Throwable> {

	boolean apply(boolean value) throws X;

}
