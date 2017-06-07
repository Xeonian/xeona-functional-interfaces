package net.xeona.function;

public interface FloatUnaryOperator<X extends Throwable> {

	float apply(float argument) throws X;

}
