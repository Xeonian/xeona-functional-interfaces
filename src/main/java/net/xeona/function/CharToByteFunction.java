package net.xeona.function;

public interface CharToByteFunction<X extends Throwable> {

	byte apply(char value) throws X;

}
