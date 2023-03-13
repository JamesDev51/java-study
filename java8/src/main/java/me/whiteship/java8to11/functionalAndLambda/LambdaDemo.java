package me.whiteship.java8to11.functionalAndLambda;

public class LambdaDemo {

	public static void main(String[] args) {

		// //익명 내부 클래스 anonymous inner class
		// RunSomething runSomething = new RunSomething() {
		// 	@Override
		// 	public void doIt() {
		// 		System.out.println("Hello");
		// 	}
		// };

		//함수형 인터페이스를 람다식으로 표현
		//한 줄은 중괄호 없이 표현
		RunSomething runSomething = (number) -> number+10;
		System.out.println(runSomething.doIt(1));
		System.out.println(runSomething.doIt(1));

		//(함수형 프로그래밍)
		//입력 받은 값이 동일한 경우 결과 값이 같아야 한다.
		//외부 변수 사용 x (final 만 가능)


		//두 줄 이상은 중괄호 필요
		// RunSomething runSomething1 = () -> {
		// 	System.out.println("Hello");
		// 	System.out.println("Minseok");
		// };
	}
}
