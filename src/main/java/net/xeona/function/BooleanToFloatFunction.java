package net.xeona.function;

public interface BooleanToFloatFunction<X extends Throwable> {

	float apply(boolean value) throws X;

}
