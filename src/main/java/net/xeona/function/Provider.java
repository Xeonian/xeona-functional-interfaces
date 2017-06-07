package net.xeona.function;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * A {@link FunctionalInterface} that provides values.
 * <p />
 * To be used as an alternative to {@link Supplier}, allowing checked exceptions to be thrown within implementations.
 * 
 * @param <T>
 *            The type returned by this provider
 * @param <X>
 *            The {@link Throwable} which may be thrown by invoking this provider
 */
@FunctionalInterface
public interface Provider<T, X extends Throwable> {

	/**
	 * 
	 * 
	 * @return
	 * @throws X
	 */
	T get() throws X;

	static <T> Provider<T, RuntimeException> fromSupplier(Supplier<? extends T> supplier) {
		return () -> supplier.get();
	}

	static <T> Supplier<T> toSupplier(Provider<? extends T, ? extends RuntimeException> provider) {
		return () -> provider.get();
	}

	static <T> Provider<T, Exception> fromCallable(Callable<? extends T> callable) {
		return () -> callable.call();
	}

	static <T> Callable<T> toCallable(Provider<? extends T, ? extends Exception> provider) {
		return () -> provider.get();
	}

}
