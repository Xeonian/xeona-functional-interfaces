package net.xeona.function;

public interface ByteToIntFunction<X extends Throwable> {

	int apply(byte value) throws X;

}
