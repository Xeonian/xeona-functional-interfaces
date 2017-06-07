package net.xeona.function;

public interface ByteUnaryOperator<X extends Throwable> {

	byte apply(byte value) throws X;

}
