package homework02;
/*
 * 얼마에요?
	> 스캐너입력값 > 100
	100원 입니다.
	몇개 드릴까요?
	> 스캐너입력값 > 5
	5개 주세요
	총 금액은 500원 입니다
	비싸요, 10% 깎아주세요.
	그럼 450원만 주세요"
	
	[참고] 깍아주는 공식
	int dc = total / 10;
	total = total - dc;
	
 */
import java.util.Scanner;
public class HowMuch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("얼마 입니까?");
		int price = scan.nextInt();
		System.out.printf("%d원 입니다.\n몇개 드릴까요?",price);
		int amount = scan.nextInt();
		int total = price * amount;  
		int total2 = total;
		//출력
		System.out.printf("%d개 주세요.\n총금액은 %d 입니다.\n",amount,total);
		System.out.println("비싸요, 10%만 깎아 주세요.");
		
	}
}
