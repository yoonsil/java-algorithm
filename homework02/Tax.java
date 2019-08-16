package homework02;
/*To 개발자님
	클라이언트에서 프로그램 개발 요청이 왔습니다.
	이름과 연봉을 입력받아서
	연봉 ***만원을 받으시는 XXX님께서 납부할 세금은 ???만원입니다.
	로 출력하는 프로그램을 만들어 주세요.
	단) 세율이 정책이 바뀔 때 마다 변하니,
	관리자가 쉽게 적용가능하도록 만들어 주세요.
	현재는 세율이 9.7(0,097)프로라고 합니다.
 * */
import java.util.Scanner;
public class Tax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
			String name = scan.next();
		System.out.println("연봉을 입력하세요.(4자리 ex)2800, 3000)");
			int annual = scan.nextInt();
			int multi = 10000;
			float deduction = 0.097f;
			double tax = (annual*multi)*deduction;
		System.out.println(String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.0f원 입니다.", annual,name,tax));
		}
}
