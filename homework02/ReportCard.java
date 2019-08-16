package homework02;
/*To. 개발자님
	  성적표 프로그램 을 하나 개발해야 합니다.
	 교수는 학생과 국어, 영어, 수학점수만 입력하면
	 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
	 오더는 다음과 같이 화면에 출력하라고 합니다.
	 
	학생           국어        영어        수학        총점        평균        합격여부
	 =======================================================
	 홍길동     90       90      90     270      90       (장학생)
	
	 합격여부는 다음과 같다고 합니다.
	 평균이 90점 이상이면 장학생
	 70점 이상 90점미만 이면 합격
	 70미만이면 불합격이라고 하네요.
	 단) 평균에서 소수점이하는 절삭입니다.
 * */
import java.util.Scanner;
public class ReportCard {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//배열생성
		String[] subjects = {"이름","국어","영어","수학","총점","평균","합격여부"};
		String[] input = new String[7];
		//변수
		int scores =0;	
		String name =String.valueOf(input[0]);
		//이름입력
			System.out.printf("%s입력하세요.\n",subjects[0]);
			input[0] = scan.next();
		//점수입력+총점계산
		for(int i=1; i<=3; i++) {
			System.out.printf("%s입력하세요.\n",subjects[i]);
			input[i] = scan.next();
			scores += Integer.parseInt(input[i]);
			}		
		//평균계산
		int avg = scores/3; 
		input[5] = String.valueOf(avg);
		//index값 지정
		input[4] = String.valueOf(scores);
		input[6] = String.valueOf(avg);
		//결과출력
		for(int i=0; i<subjects.length; i++) {
			System.out.print("   "+subjects[i]+"    ");
		}
		System.out.print("\n======================================================\n");
		for(int i=0; i<input.length; i++) {
			System.out.print("  "+input[i]+"  ");
			}
		//합격여부출력
		if(70<=avg&&avg<90) {
			System.out.println("(합격)");
		}else if(90<=avg){
			System.out.println("(장학생)");
		}else {
			System.out.println("(불합격)");
		}
		
	}
}

