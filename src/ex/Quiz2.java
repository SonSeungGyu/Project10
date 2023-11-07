package ex;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		DBDriver db = null;
		if(num == 1) {
			db = new MySql();
		}else if(num == 2) {
			db = new Oracle();
		}else if(num == 3) {
			db = new Postgres();
		}else {
			System.out.println("잘못된 정보입니다.");
		}
		if(db != null)
		db.dbConnect();
		
	}
}

class MySql implements DBDriver{

	@Override
	public void dbConnect() {
		System.out.println("MySql DB에 연결합니다.");
	}
	
}

class Oracle implements DBDriver{

	@Override
	public void dbConnect() {
		System.out.println("Oracle DB에 연결합니다.");
	}
	
	
}

class Postgres implements DBDriver{

	@Override
	public void dbConnect() {
		System.out.println("Postgres DB에 연결합니다.");
	}
	
}
