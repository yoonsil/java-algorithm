package homework02;
/*To. 개발자님
	연도를 넣으면 윤년인지 아닌지를 판단하는 프로그램이 필요합니다.
	입력창에 2000 이라고 넣으면 2000년은 윤년입니다. 이렇게 출력하는 어플 말입니다.
	로직은 아래와 같다고 하니 참조하시구요. 부탁드립니다.
	
	연도를 4로 나눈값이 0 이라면 윤년일 수 있다.
	그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
	2000년은 4로 나눈값이 0 이라서 윤년일 수 있는데..
	다시 '이 값이 100으로 나눠' 떨어지면 '평년'이다.
	평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
	예시) 2000년 과 2016 년을 입력하면 윤년으로 나옴
 * */
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result ="";
		System.out.println("연도를 입력하세요.");
		int year = scan.nextInt();
		if(year%4==0){
			result ="윤년";
			if(year%100==0) {
				result ="평년";
				if(year%400==0) {
					result ="윤년";
				}else {
					result ="평년";
				}
			}else {
				result ="윤년";
			}
		}else{
			result ="평년";
		}
		System.out.println(result);
	}
}
