package study04;
import java.util.Scanner;
public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		while(true) {
			System.out.println("0.종료 1.BMI 2.이해못할문제 3.");
			switch(scan.nextInt()) {
			case 0 : System.out.println("종료"); 
				return;
			case 1 : System.out.println("BMI: 이름, 키, 몸무게 입력");
			String name = scan.next();
			double height = scan.nextDouble();
			double weight = scan.nextDouble();
			String result = student.getBmi(name, height, weight);
			System.out.println(result);
				break;
			
			case 2 : 
				name = scan.next();
				String addr = scan.next();
				int age = scan.nextInt();
				int balance = scan.nextInt();
				String credit = scan.next();
				result = student.getMomey(name, addr, age, balance, credit);
				System.out.println(result);
				//이름. 주소, 나이, 은행잔고, 신용도 입력
				// 결과가 뭘 넣든간에 1억 대출
				break;
			
			}
		}
	}
}
