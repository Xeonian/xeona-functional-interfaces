package net.xeona.function;

public interface LongToCharFunction<X extends Throwable> {

	char apply(long argument) throws X;

	public static <X extends Throwable> LongToCharFunction<X> fromBoxedFunction(
			ToCharFunction<? super Long, ? extends X> function) {
		return primitiveLong -> function.apply(Long.valueOf(primitiveLong));
	}

}
