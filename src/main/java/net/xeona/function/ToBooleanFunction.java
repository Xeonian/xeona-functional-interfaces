package net.xeona.function;

import java.util.Objects;
import java.util.function.Predicate;

public interface ToBooleanFunction<A, X extends Throwable> {

	boolean apply(A argument) throws X;

	@SafeVarargs
	static <A, X extends Throwable> ToBooleanFunction<A, X> union(
			ToBooleanFunction<? super A, ? extends X>... toBooleanFunctions) {
		return argument -> {
			for (ToBooleanFunction<? super A, ? extends X> toBooleanFunction : toBooleanFunctions) {
				if (toBooleanFunction.apply(argument)) {
					return true;
				}
			}
			return false;
		};
	}

	@SafeVarargs
	static <A, X extends Throwable> ToBooleanFunction<A, X> intersect(
			ToBooleanFunction<? super A, ? extends X>... toBooleanFunctions) {
		return argument -> {
			for (ToBooleanFunction<? super A, ? extends X> toBooleanFunction : toBooleanFunctions) {
				if (!toBooleanFunction.apply(argument)) {
					return false;
				}
			}
			return true;
		};
	}

	static <A, X extends Throwable> ToBooleanFunction<A, X> negate(
			ToBooleanFunction<? super A, ? extends X> toBooleanFunction) {
		return argument -> !toBooleanFunction.apply(argument);
	}

	static <T> ToBooleanFunction<T, RuntimeException> isEqual(T equalTo) {
		return equalTo != null ? argument -> equalTo.equals(argument) : Objects::isNull;
	}

	static <A> ToBooleanFunction<A, RuntimeException> fromPredicate(Predicate<? super A> predicate) {
		return predicate::test;
	}

	static <A> Predicate<A> toPredicate(ToBooleanFunction<? super A, ? extends RuntimeException> toBooleanFunction) {
		return toBooleanFunction::apply;
	}

}
