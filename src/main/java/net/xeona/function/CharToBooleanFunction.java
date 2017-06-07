package net.xeona.function;

public interface CharToBooleanFunction<X extends Throwable> {

	boolean apply(char value) throws X;

}
