package study03;
import java.util.Scanner;
public class Student {
//BMI /ranking/ how much/report card
	public String getBmi(String get[]){
		//String[] ask = {"이름","키 (cm)","몸무게 (kg)"};
		//인덱스 타입변환
		float height = Float.parseFloat(get[1]);
		float weight = Float.parseFloat(get[2]);
		//계산
		float bmi =weight/((height/100)*(height/100));
		String result ="";
		
		if(bmi>=30) {
			result = "고도비만";
		}else if(bmi>=25) {
			result ="비만";
		}else if(bmi>=23) {
			result ="과체중";
		}else if(bmi>=18.5){
			result="정상";
		}else {
			result="저체중";
		}
		//출력
		
		return String.format("%s의 bmi는 %s 입니다.",get[0],result);
	}
	
	public String getRanking(float[]time) {
		Scanner scan = new Scanner(System.in);
		String fir = "";
		String sec ="";
		String thi = "";	
		String[] name = {"A","B","C"};
		//순서정하기
		for(int i = 0; i<time.length; i++) {
			if(time[0]<time[1] && time[1]<time[2] && time[0]<time[2]){
				fir = String.format("1등 : A선수 (%.1f초)",time[0]);
				sec = String.format("2등 : B선수 (%.1f초)",time[1]);
				thi = String.format("3등 : C선수 (%.1f초)",time[2]);
			}else if(time[2]<time[0] && time[2]<time[1] && time[0]<time[1]) {
				fir = String.format("1등 : C선수 (%.1f초)",time[2]);
				sec = String.format("2등 : A선수 (%.1f초)",time[0]);
				thi = String.format("3등 : B선수 (%.1f초)",time[1]);
			}else if(time[1]<time[2] && time[1]<time[0] && time[2]<time[0]) {
				fir = String.format("1등 : B선수 (%.1f초)",time[1]);
				sec = String.format("2등 : C선수 (%.1f초)",time[2]);
				thi = String.format("3등 : A선수 (%.1f초)",time[0]);				
			}
		}
		System.out.printf("%s\n",fir);
		System.out.printf("%s\n",sec);
		System.out.printf("%s\n",thi);	
		
		return "등수를 계산중";
	}
	
	public void howMuch(){
		Scanner scan = new Scanner(System.in);
		System.out.print("얼마 입니까?: ");
		int price = scan.nextInt();
		System.out.printf("%d원 입니다.\n몇개 드릴까요?: ",price);
		int amount = scan.nextInt();
		int total = price * amount;  
		//출력
		System.out.printf("%d개 주세요.\n총금액은 %d 입니"
				+ "다.\n",amount,total);
		while(true) {
			System.out.println("비싸요, ___%만 깎아 주세요.");
			int ask = scan.nextInt();
			int dc = total/ask;
			int result = total-dc;
			if(ask<=10) {
				System.out.printf("그럼 %d만 주세요.",result);
				return;
			}else {
				System.out.println("죄송합니다.10%이상은 깍아드리기 힘들어요.");
			}
		}
	}
	
	public void reportCard() {
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
