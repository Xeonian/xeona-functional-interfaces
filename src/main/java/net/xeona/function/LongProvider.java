package net.xeona.function;

public interface LongProvider<X extends Throwable> {

	long get() throws X;

}
