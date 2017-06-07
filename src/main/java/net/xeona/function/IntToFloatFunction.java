package net.xeona.function;

public interface IntToFloatFunction<X extends Throwable> {

	float apply(int value) throws X;

}
