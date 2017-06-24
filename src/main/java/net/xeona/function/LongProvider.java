package net.xeona.function;

public interface LongProvider<X extends Throwable> {

	long get() throws X;

	default Provider<Long, X> toBoxedProvider() {
		return toBoxedProvider(this);
	}

	static <X extends Throwable> Provider<Long, X> toBoxedProvider(LongProvider<? extends X> longProvider) {
		return () -> Long.valueOf(longProvider.get());
	}

	static <X extends Throwable> LongProvider<X> fromBoxedProvider(
			Provider<? extends Long, ? extends X> boxedLongProvider) {
		return () -> boxedLongProvider.get().longValue();
	}

}
