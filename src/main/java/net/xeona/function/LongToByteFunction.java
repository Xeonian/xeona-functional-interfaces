package net.xeona.function;

public interface LongToByteFunction<X extends Throwable> {

	byte apply(long argument) throws X;

	static <X extends Throwable> LongToByteFunction<X> fromBoxedFunction(
			ToByteFunction<? super Long, ? extends X> function) {
		return primitiveLong -> function.apply(Long.valueOf(primitiveLong));
	}

}
