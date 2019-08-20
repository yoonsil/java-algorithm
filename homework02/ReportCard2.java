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
public class ReportCard2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result ="";
		System.out.println("이름");
		String name = scan.next();
		System.out.println("국어");
		int kor = scan.nextInt();
		System.out.println("영어");
		int eng = scan.nextInt();
		System.out.println("수학");
		int math = scan.nextInt();
		int scores =kor+eng+math;	
		int avg = scores/3; 
		//합격여부출력
		if(70<=avg&&avg<90) {
			result ="(합격)";
		}else if(90<=avg){
			result ="(장학생)";
		}else {
			result ="(불합격";
		}
		System.out.println("이름            국어            영어            수학            총점          평균             결과");
		System.out.print("\n======================================================\n");
		System.out.printf("  %s    %d    %d     %d      %d      %d      %s",name,kor,eng,math,scores,avg,result);
		
	}
}

