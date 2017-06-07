package net.xeona.function;

public interface ShortProvider<X extends Throwable> {

	short get() throws X;

}
