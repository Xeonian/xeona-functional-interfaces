package net.xeona.function;

import static java.util.Objects.requireNonNull;

public interface LongUnaryOperator<X extends Throwable> {

	long apply(long argument) throws X;

	static <X extends Throwable> LongUnaryOperator<X> fromBoxedFunction(
			ToLongFunction<? super Long, ? extends X> function) {
		requireNonNull(function, "Function must not be null");
		return primitiveLong -> function.apply(Long.valueOf(primitiveLong));
	}

}
