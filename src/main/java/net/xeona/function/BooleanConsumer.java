package net.xeona.function;

public interface BooleanConsumer<X extends Throwable> {

	void consume(boolean value) throws X;

}
