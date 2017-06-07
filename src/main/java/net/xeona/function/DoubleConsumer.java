package net.xeona.function;

public interface DoubleConsumer<X extends Throwable> {

	void consume(double argument) throws X;

}
