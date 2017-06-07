package net.xeona.function;

public interface FloatProvider<X extends Throwable> {

	float get() throws X;

}
