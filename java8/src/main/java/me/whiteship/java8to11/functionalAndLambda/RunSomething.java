package me.whiteship.java8to11.functionalAndLambda;

@FunctionalInterface
public interface RunSomething {

	//추상 메서드가 오직 1개 -> functional interface
	int doIt(int number);

	// void doIt(); -> 추상 메서드 2개 들어오면 @FunctionalInteface 가 컴파일 에러를 발생시킴

	static void printName() {
		System.out.println("minseok");
	}

	default void printAge() {
		System.out.println("25");
	}


}
