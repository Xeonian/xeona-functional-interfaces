package net.xeona.function;

public interface CharProvider<X extends Throwable> {

	char get() throws X;

}
