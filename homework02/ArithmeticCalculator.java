package homework02;
/*To. 개발자님
	프로그램을 하나 개발해야 합니다.
	교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
	복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
	몫과 나머지값으로 출력하면 된답니다.
	출력결과물은 예를 들어
	5 + 5 = 10
	2 - 7 = -5
	이렇게 되고,
	10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
	그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
 */
import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result =0;
		//입력
		System.out.println("첫번째 수를 입력하세요.");
		int fir = scan.nextInt();
		System.out.println("두번쩨 수를 입력하세요.");
		int sec = scan.nextInt();
		System.out.println("사칙연산(+,-,x,/)중 하나를 선택하세요.");
		String symbol = scan.next();
		//계산
		switch(symbol) {
		case "+" :result =fir+sec; break;
		case "-" :result =fir-sec; break;
		case "x" :result =fir*sec; break;
		case "/" :result =fir/sec; break;
		}
		if(symbol.equals("/")) {
			System.out.printf("%d %s %d = %d[%d]",fir,symbol,sec,result,fir%sec);						
		}else {
			System.out.printf("%d %s %d = %d",fir,symbol,sec,result);			
		}
		//출력
	}
}
