package net.xeona.function;

public interface LongConsumer<X extends Throwable> {

	void consume(long argument) throws X;

}
