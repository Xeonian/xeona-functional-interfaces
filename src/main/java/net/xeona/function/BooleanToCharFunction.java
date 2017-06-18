package net.xeona.function;

public interface BooleanToCharFunction<X extends Throwable> {

	char apply(boolean value) throws X;

}
