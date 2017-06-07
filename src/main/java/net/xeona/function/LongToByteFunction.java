package net.xeona.function;

public interface LongToByteFunction<X extends Throwable> {

	byte apply(long argument) throws X;

}
