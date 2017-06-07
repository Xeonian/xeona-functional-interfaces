package net.xeona.function;

public interface VoidFunction<X extends Throwable> {

	void apply() throws X;

}
