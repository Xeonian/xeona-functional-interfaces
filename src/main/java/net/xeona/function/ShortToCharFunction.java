package net.xeona.function;

public interface ShortToCharFunction<X extends Throwable> {

	char apply(short argument) throws X;

}
