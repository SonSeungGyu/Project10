package ex;

import main.Calc;

public class Ex02 {
	public static void main(String[] args) {
		Calc calc = new Calculator(); //부뫄입으로 변수를 형변환시킴
		
		System.out.println(calc.add(2,3));
		
		//calc.showInfo();// 에러, 자식의 메소드는 사용하지 못 함.
	}
}
