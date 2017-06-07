package net.xeona.function;

public interface ByteConsumer<X extends Throwable> {

	void consume(byte value) throws X;

}
