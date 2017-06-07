package net.xeona.function;

import java.util.function.IntSupplier;

public interface IntProvider<X extends Throwable> {

	int get() throws X;

	static IntProvider<RuntimeException> fromIntSupplier(IntSupplier intSupplier) {
		return () -> intSupplier.getAsInt();
	}

	static IntSupplier toIntSupplier(IntProvider<? extends RuntimeException> intProvider) {
		return () -> intProvider.get();
	}

}
