package net.xeona.function;

public interface LongConsumer<X extends Throwable> {

	void consume(long argument) throws X;

	default Consumer<Long, X> toBoxedConsumer() {
		return toBoxedConsumer(this);
	}

	public static <X extends Throwable> Consumer<Long, X> toBoxedConsumer(LongConsumer<? extends X> longConsumer) {
		return boxedLong -> longConsumer.consume(boxedLong.longValue());
	}

	public static <X extends Throwable> LongConsumer<X> fromBoxedConsumer(
			Consumer<? super Long, ? extends X> boxedLongConsumer) {
		return primitiveLong -> boxedLongConsumer.consume(Long.valueOf(primitiveLong));
	}

}
