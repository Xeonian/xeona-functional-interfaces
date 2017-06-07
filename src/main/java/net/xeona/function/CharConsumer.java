package net.xeona.function;

public interface CharConsumer<X extends Throwable> {

	void consume(char value) throws X;

}
