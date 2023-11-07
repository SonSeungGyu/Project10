package ex;

import main.Calc;

public class Quiz1 {
	public static void main(String[] args) {
		Calc calc = new Calculator();
		if(calc instanceof Calculator) {
		Calculator cal = (Calculator)calc;
		
		cal.showInfo();
		}
	}
}
