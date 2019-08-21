package bymyself03;
import java.util.Scanner;
public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		while(true) {
			System.out.println("0.종료  1.회원가입  2.가입정보");
			switch(scan.nextInt()) {
			case 0: return;
			case 1: 
				member = new Member();
				System.out.println("이름");
				member.setName(scan.next());
				System.out.println("나이");
				member.setAge(scan.next());
				System.out.println("아이디");
				member.setId(scan.next());
				System.out.println("비밀번호");
				member.setPw(scan.next());
				System.out.println("이메일");
				member.setEmail(scan.next());
				break;
			case 2: 
				System.out.println(member.toString());
				break;
			}
		}
	}
}
