package net.xeona.function;

import static java.util.Objects.requireNonNull;

public interface LongToIntFunction<X extends Throwable> {

	int apply(long argument) throws X;

	static <X extends Throwable> LongToIntFunction<X> fromBoxedFunction(
			ToIntFunction<? super Long, ? extends X> function) {
		requireNonNull(function, "Function must not be null");
		return primitiveLong -> function.apply(Long.valueOf(primitiveLong));
	}

}
