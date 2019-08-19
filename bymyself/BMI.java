package bymyself;
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
public class BMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name ="";
		String result ="";
		float height = 0.0f;
		float weight = 0.0f;
		float bmi = 0.0f;
		float decimal = height/100;
		while(true) {
			System.out.println("이름을 입력하세요.");
			name = scan.next();
			System.out.println("키를 입력하세요.");
			height = scan.nextFloat();
			System.out.println("몸무게를 입력하세요.");
			weight = scan.nextFloat();
			bmi = weight /decimal*decimal;
			
			if(bmi>=30) {
				result ="고도비만";
			}else if(bmi>=25) {
				result ="비만";
			}else if(bmi>=23) {
				result ="경도비만";
			}else if(bmi>=18.5) {
				result ="정상";
			}else {
				result ="저체중";
			}
			
			System.out.printf("%s님 %s입니다.\n",name,result);
			
		}
	}
}	
