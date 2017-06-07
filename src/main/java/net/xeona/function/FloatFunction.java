package net.xeona.function;

public interface FloatFunction<R, X extends Throwable> {

	R apply(float argument) throws X;

}
