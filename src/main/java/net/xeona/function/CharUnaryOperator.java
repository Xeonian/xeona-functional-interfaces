package net.xeona.function;

public interface CharUnaryOperator<X extends Throwable> {

	char apply(char value) throws X;

}
