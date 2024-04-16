package main;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		System.out.println("드라이버를 선택하세요.");
		System.out.println("1 : mysql");
		System.out.println("2 : oracle");
		System.out.println("3 : postgres");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		DBDriver driver = null;
		
		if (num == 1) {
			driver = new MySqlBDriver(); 
		} else if (num == 2) {
			driver = new OracleDBDriver();
		} else if (num == 3) {
			driver = new PostgresDBDriver();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		if (driver != null) {
			
			driver.driver();
		}
		
	}

}

class MySqlBDriver implements DBDriver {

	@Override
	public void driver() {
		System.out.println("MySql DB에 연결합니다.");
	}
}

class OracleDBDriver implements DBDriver {

	@Override
	public void driver() {
		System.out.println("Oracle DB에 연결합니다.");
	}
}

class PostgresDBDriver implements DBDriver {

	@Override
	public void driver() {
		System.out.println("Postgres DB에 연결합니다.");
	}
}


