package net.xeona.function;

import java.util.Objects;

public interface LongToDoubleFunction<X extends Throwable> {

	double apply(long argument) throws X;

	static <X extends Throwable> LongToDoubleFunction<X> fromUnboxedFunction(
			ToDoubleFunction<? super Long, ? extends X> function) {
		Objects.requireNonNull(function, "Function must not be null");
		return primitiveLong -> function.apply(Long.valueOf(primitiveLong));
	}

}
