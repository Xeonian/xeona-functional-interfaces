package net.xeona.function;

public interface IntToByteFunction<X extends Throwable> {

	byte apply(int value) throws X;

}
