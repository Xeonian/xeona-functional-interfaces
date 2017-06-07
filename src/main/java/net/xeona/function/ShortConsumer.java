package net.xeona.function;

public interface ShortConsumer<X extends Throwable> {

	void consume(short value) throws X;

}
