package net.xeona.function;

public interface FloatConsumer<X extends Throwable> {

	void consume(float argument) throws X;

}
