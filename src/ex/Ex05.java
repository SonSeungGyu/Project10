package ex;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println("전화 상담 할당 방식을 선택하세요");
		System.out.println("1 : 한명씩 차레로 할당");
		System.out.println("2 : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("3 : 우선순위가 높은 고객 먼저 할당");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		Scheduler scheduler = null;
		
		if(num ==1) {
			scheduler = new RoundRobin();
		}else if(num == 2) {
			scheduler = new LeastJob();
		}else if(num == 3) {
			scheduler = new Prior();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		if(scheduler != null) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
		
		
	}
}

class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
	
}

class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 내기가 가장 적은 상담원에게 할당됩니다.");
	}
	
}

class Prior implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무스킬이 높은 상담원에게 우선적으로 배분합니다.");
	}
	
}
