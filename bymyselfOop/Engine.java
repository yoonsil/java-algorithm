package bymyselfOop;
import java.util.Scanner;
public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println("0.종료 1.회원가입 2.회원정보보기 3.계산기 4.세금계산기");
			switch(scan.nextInt()) {
			case 0: return;
			case 1:
				member = new Member();
				System.out.println("ID");
				member.setId(scan.next());
				System.out.println("Name");
				member.setName(scan.next());
				System.out.println("Password");
				member.setPw(scan.next());
				System.out.println("Email");
				member.setEmail(scan.next());
				System.out.println("연봉");
				member.setIncome(scan.nextInt());
				break;
			case 2:
				System.out.println(member.toString());
				break;
			case 3:
				member = new Member();
				System.out.println("첫번째 수 ");
				member.setFir(scan.nextInt());
				System.out.println("두번째 수");
				member.setSec(scan.nextInt());
				System.out.println("사칙연산중 하나(+, -, /, x)");
				member.setSymbol(scan.next());
				System.out.println(service.getAc(member));
				break;
			case 4:
				System.out.println(service.getTax(member));
				break;
			}
		}
	}
}
