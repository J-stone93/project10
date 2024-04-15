package main;

public interface Calc {
	
	int ERROR = -9999; // 계산 오류시 사용할 에러코드
	
	int add(int num1, int num2); // 더하기
	
	int substract(int num1, int num2); // 빼기
	
	int times(int num1, int num2); // 곱하기
	
	int divide(int num1, int num2); // 나누기
	
}
