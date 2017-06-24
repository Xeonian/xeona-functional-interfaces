package net.xeona.function;

import static java.util.Objects.requireNonNull;

public interface LongToFloatFunction<X extends Throwable> {

	float apply(long argument) throws X;

	static <X extends Throwable> LongToFloatFunction<X> fromBoxedFunction(
			ToFloatFunction<? super Long, ? extends X> function) {
		requireNonNull(function, "Function must not be null");
		return primitiveLong -> function.apply(Long.valueOf(primitiveLong));
	}

}
