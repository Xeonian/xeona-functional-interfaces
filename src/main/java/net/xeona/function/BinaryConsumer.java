package net.xeona.function;

public interface BinaryConsumer<T, U, X extends Throwable> {

	void consume(T value1, U value2) throws X;
	
}
