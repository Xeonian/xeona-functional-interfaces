package net.xeona.function;

public interface DoubleToByteFunction<X extends Throwable> {

	byte apply(double argument) throws X;

}
