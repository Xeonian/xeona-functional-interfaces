package net.xeona.function;

public interface BooleanToByteFunction<X extends Throwable> {

	byte apply(boolean value) throws X;

}
