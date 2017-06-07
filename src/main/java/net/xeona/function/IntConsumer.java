package net.xeona.function;

public interface IntConsumer<X extends Throwable> {

	void consume(int value) throws X;

}
