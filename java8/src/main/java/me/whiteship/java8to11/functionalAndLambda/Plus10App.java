package me.whiteship.java8to11.functionalAndLambda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Plus10App {
	public static void main(String[] args) {
		Plus10 plus10 = new Plus10();
		System.out.println(plus10.apply(1));

		Function<Integer,Integer> plus20 = (i) -> i+20;
		System.out.println(plus20.apply(1));

		Function<Integer, Integer> multiply2 = (i) -> i*2;
		System.out.println(multiply2.apply(1));

		//multiply2 이후 결과값을 plus10 의 입력값으로 사용
		Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
		System.out.println(multiply2AndPlus10.apply(2));

		//plus10 이후 결과값을 multiply2 의 입력값으로 사용
		Function<Integer, Integer> plus10AndMultiply2 = plus10.andThen(multiply2);
		System.out.println(plus10AndMultiply2.apply(2));

		Supplier<Integer> get10 = () -> 10;

		Predicate<String> startsWithMinseok = (s) -> s.startsWith("minseok");
		Predicate<Integer> isEven = (i) -> i%2==0;


		UnaryOperator<Integer> unaryplus10 = (i)->i+10;

	}
}
