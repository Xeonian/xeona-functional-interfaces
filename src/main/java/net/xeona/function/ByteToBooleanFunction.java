package net.xeona.function;

public interface ByteToBooleanFunction<X extends Throwable> {

	boolean apply(byte value) throws X;

}
