package net.xeona.function;

public interface BooleanProvider<X extends Throwable> {

	boolean get() throws X;

}
