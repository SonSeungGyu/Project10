package main;

public interface Calc {
	//자동으로 상수로 인식
	int ERROR = -9999;//계산시 오류가 났을 때 사용할 에러코드
	
	//abstract 생략해도 자동으로 추상메소드로 인식
	int add(int num1, int num2);//더하기 메소드
	
	int substract(int num1, int num2);//빼기 메소드
	
	int times(int num1, int num2);//곱하기 메소드
	
	int divide(int num1, int num2);//나누기 메소드
}
