package main;

public class Ex3 {

	public static void main(String[] args) {

		Calc calc = new NewCalculator();
		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 20));
		
	}

}

// 새로운 버전의 계산기
class NewCalculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	// 곱하는 수가 0 또는 음수라면 에러코드 반환
	@Override
	public int times(int num1, int num2) {
		if (num2 > 0) {
			return num1 * num2;
		} else {
			return Calc.ERROR; // 인터페이스인 ERROR는 스택틱이고 인터페이스이기 때문에 부모클래스에 .찍고 바로 사용가능
		}
	}

	// 첫번째 숫자가 두번째 숫자보다 더 작으면 에러코드 반환
	@Override
	public int divide(int num1, int num2) {
		if (num1 > num2) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}
	}

}
