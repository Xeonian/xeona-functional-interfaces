package net.xeona.function;

public interface Consumer<T, X extends Throwable> {

	void consume(T value) throws X;

	static <T> Consumer<T, RuntimeException> fromConsumer(java.util.function.Consumer<? super T> consumer) {
		return value -> consumer.accept(value);
	}

	static <T> java.util.function.Consumer<T> toConsumer(Consumer<? super T, ? extends RuntimeException> consumer) {
		return value -> consumer.consume(value);
	}

}
