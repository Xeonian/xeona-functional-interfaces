package net.xeona.function;

public interface ByteFunction<R, X extends Throwable> {

	R apply(byte value) throws X;

}
