package homework02;
/*To. 개발자님
	월을 입력하면 해당 월이 몇일까지인지
	알려주는 프로그램을 작성해 주세요.
	단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
	출력문장 : "??월은 **일 까지 입니다."
 * */
import java.util.Scanner;
public class MonthEndDay {
	public static void main(String[] args) {
		String day="";
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("월을 입력해주세요.");
		int month = scan.nextInt();
		if(month==2) {
			day ="29일";
		}else if(month<=7) {
			if(month%2==0) {
				day ="30일";
			}else {
				day ="31일";
			}
		}else if(month>=8 && month<=12) {
			if(month%2==0) {
				day="31일";
			}else {
				day="30일";
			}
		}else {
			day="다시입력하세요.";
		}
		System.out.println(day);
		}
	}
}
