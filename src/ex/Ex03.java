package ex;

import main.Calc;

public class Ex03 {
	public static void main(String[] args) {
		
		Calc calc = new NewCalculator();
		
		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 20));
	}
}

//새로운 버전의 계산기 클래스
class NewCalculator implements Calc {

	@Override
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		if (num2 <= 0) {
			return Calc.ERROR;
		}
		return num1 * num2;
	}
	
	//첫번째 숫자가 두번째 숫자보다 더 작을 경우 에러코드 반환
	@Override
	public int divide(int num1, int num2) {
		if (num1 < num2) {
			return Calc.ERROR;
		}
		return num1 / num2;
	} // 인터페이스 상속받기

}
