package net.xeona.function;

import static java.util.Objects.requireNonNull;

public interface LongFunction<R, X extends Throwable> {

	R apply(long argument) throws X;

	static <R, X extends Throwable> LongFunction<R, X> fromBoxedFunction(
			Function<? super Long, ? extends R, ? extends X> function) {
		requireNonNull(function, "Function must not be null");
		return primitiveLong -> function.apply(Long.valueOf(primitiveLong));
	}

}
