package net.xeona.function;

public interface LongToBooleanFunction<X extends Throwable> {

	boolean apply(long argument) throws X;

	static <X extends Throwable> LongToBooleanFunction<X> fromBoxedFunction(
			ToBooleanFunction<? super Long, ? extends X> boxedFunction) {
		return primitiveLong -> boxedFunction.apply(Long.valueOf(primitiveLong));
	}

}
