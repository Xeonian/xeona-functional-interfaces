package net.xeona.function;

public interface FloatToByteFunction<X extends Throwable> {

	byte apply(float argument) throws X;

}
