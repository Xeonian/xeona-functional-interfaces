package net.xeona.function;

public interface ByteProvider<X extends Throwable> {

	byte get() throws X;

}
