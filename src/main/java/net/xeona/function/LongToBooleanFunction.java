package net.xeona.function;

public interface LongToBooleanFunction<X extends Throwable> {

	boolean apply(long argument) throws X;

}
