package net.xeona.function;

public interface LongToFloatFunction<X extends Throwable> {

	float apply(long argument) throws X;

}
