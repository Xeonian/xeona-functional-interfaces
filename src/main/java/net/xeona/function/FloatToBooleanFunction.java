package net.xeona.function;

public interface FloatToBooleanFunction<X extends Throwable> {

	boolean apply(float argument) throws X;

}
