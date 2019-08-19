package homework03;
import java.util.Scanner;
public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student std = new Student();
		String result ="";
		while(true) {
			System.out.println("0.종료 1.AC 2.BMI 3.How much 4.Join\n"
					+ "5.Leap Year 6.MonthEndDay 7.PassOrFail 8.Ranking\n"
					+ "9.ReportCard 10.ScoreCalc 11.Tax 12.TimeCalc\n");
			switch(scan.nextInt()) {
			case 0: System.out.println("종료");
			return;
			case 1: //ac 
				System.out.println("첫번째 값");
				int fir = scan.nextInt();
				System.out.println("두번째 값");
				int sec = scan.nextInt();
				System.out.println("사칙연산 선택");
				String symbol = scan.next();
				//------------------------------
				if(symbol.equals("/")) {
					result = std.getDivided(fir, sec);
				}else {
					result = std.getAc(fir, sec, symbol);
				}
				//-------------------------------
				System.out.println(result);
				break;
				
			case 2: //bmi
				System.out.println("이름");
				String name = scan.next();
				System.out.println("키");
				float height = scan.nextFloat();
				System.out.println("몸무게");
				float weight = scan.nextFloat();
				//-------------------------------------
				result = std.getBmi(name, height, weight);
				//-------------------------------------
				System.out.println(result);
				break;
			case 3: //how much
				System.out.println("얼마인지 입력");
				int price = scan.nextInt();
				System.out.println("개수입력");
				int amount = scan.nextInt();
				//-------------------------------------
				result = std.howMuch(price, amount);	
				System.out.println(result);
				//-------------------------------------
				while(true) {
				int ask = scan.nextInt();
				if(ask<=10) {
					result =std.getDcFinal(price, amount, ask);
					System.out.println(result);
					break;
				}else {
					result =std.notGetDc(price, amount, ask);
					System.out.println(result);
					}
				}				
				//-------------------------------------
			case 4: //join
				System.out.println("==============회원가입==============");
				String[] join = {"아이디: ","비밀번호: ","이름: ","생년월일(예)1980-01-01:",
						"성인여부(성인true,미성년false): ","키(소수점첫째자리까지): ","몸무게(소수점 첫째 자리까지): ","헐액형(A): "};
				String[] info = new String[8];
				for(int i=0; i<8; i++) {
					System.out.printf("%s",join[i]);
					info[i] = scan.next();
				}
				result = std.getJoin(info);
				System.out.println(result);
				break;
				//-------------------------------------
			case 5: //leap year
				
				break;
				//-------------------------------------
			case 6: //month-end-day
				
				break;
				//-------------------------------------
			case 7: //PassOrFamil
				
				break;
			case 8: //Ranking
				
				break;
			case 9: //ReportCard
				
				break;
			case 10: //ScoreCalc
				
				break;
			case 11: //Tax
				
				break;
			case 12: //TimeCalc
				
				break;
			}
		}
	}
}
