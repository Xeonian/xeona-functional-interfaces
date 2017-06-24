package net.xeona.function;

import java.util.Objects;

public interface LongToShortFunction<X extends Throwable> {

	short apply(long argument) throws X;

	static <X extends Throwable> LongToShortFunction<X> fromBoxedFunction(
			ToShortFunction<? super Long, ? extends X> function) {
		Objects.requireNonNull(function, "Function must not be null");
		return primitiveLong -> function.apply(Long.valueOf(primitiveLong));
	}

}
