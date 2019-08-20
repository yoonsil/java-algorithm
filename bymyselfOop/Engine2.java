package bymyselfOop;
import java.util.Scanner;
public class Engine2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		while(true) {
			System.out.println("0.종료 1.회원가입 2.정보보기");
			switch(scan.nextInt()) {
			case 0: System.out.println("종료");
				return;
			case 1: 
				member = new Member();
				System.out.println("이름");
				member.setName(scan.next());
				System.out.println("ID");
				member.setId(scan.next());
				System.out.println("PW");
				member.setPw(scan.next());
				System.out.println("Email");
				member.setEmail(scan.next());
				break;
			case 2:
				System.out.println(member.toString());
				break;
			}
		}
	}
}
