package net.xeona.function;

public interface ShortToByteFunction<X extends Throwable> {

	byte apply(short argument) throws X;

}
