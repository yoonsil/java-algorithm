package homework02;
/* To. 개발자님
	사람의 이름을 입력하고, 몸무게 , 키를 입력하면
	해당 사람의 상태가 비만인지 저체중인지 알려주는 BMI 지수 측정하는 프로그램을 만들어 주세요.
	BMI 구하는 공식은 아래와 같아요. 더 궁금하면 여기를 클릭하세요.
	       BMI = x KG / (y M * y M)
	
	Example for 175 cm height and 70 kg weight:
	BMI = 70 / (1.75 * 1.75) = 22.86
	
	(bmi > 30.0) 고도비만
	(bmi > 25.0) 비만
	(bmi > 23.0) 과체중
	(bmi > 18.5) 정상
	저체중
	       이랍니다.
 * */
import java.util.Scanner;
public class BMI2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름입력");
		String name =scan.next();
		System.out.println("키입력");
		float height = scan.nextFloat();
		System.out.println("몸무게 입력");
		float weight = scan.nextFloat();
		//인덱스 타입변환
		
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
		System.out.printf("%.1f (%s)",bmi,result);
		
		
	}
}
