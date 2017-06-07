package net.xeona.function;

public interface IntToCharFunction<X extends Throwable> {

	char apply(int value) throws X;

}
