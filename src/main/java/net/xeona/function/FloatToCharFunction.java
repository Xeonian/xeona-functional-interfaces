package net.xeona.function;

public interface FloatToCharFunction<X extends Throwable> {

	char apply(float argument) throws X;

}
