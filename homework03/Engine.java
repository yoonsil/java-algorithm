package homework03;
import java.util.Scanner;
public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student std = new Student();
		String result ="";
		while(true) {
			System.out.println("0.종료\n1.AC\n2.BMI\n3.How much\n4.Join\n"
					+ "5.Leap Year\n6.MonthEndDay \n7.PassOrFail \n8.Ranking\n"
					+ "9.ReportCard\n10.ScoreCalc \n11.Tax \n12.TimeCalc\n");
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
			case 4: //join (****)
				System.out.println("==============회원가입==============");
				System.out.println("아이디");
				String id = scan.next();
				System.out.println("비번");
				String pw = scan.next();
				System.out.println("이름");
				name = scan.next();
				System.out.println("생일");
				String birth = scan.next();
				System.out.println("성인 true, 미성년 false");
				String adult = scan.next();
				System.out.println("키");
				height = scan.nextFloat();
				System.out.println("몸무게");
				weight = scan.nextFloat();
				System.out.println("혈액형");
				String blood = scan.next();
				
				result = std.getJoin(id, pw, name, birth, adult, height, weight, blood);
				System.out.println(result);
				break;
				//-------------------------------------
			case 5: //leap year
				System.out.println("연도를 입력하세요.");
				int year = scan.nextInt();
				result = std.getFeb(year);
				System.out.println(result);
				break;
				//-------------------------------------
			case 6: //month-end-day
				System.out.println("월을 입력하세요.");
				int month=scan.nextInt();
				result = std.getLastday(month);
				System.out.println(result);
				break;
				//-------------------------------------
			case 7: //PassOrFail
				String[] subjects2 = {"이름","국어","영어","수학","총점","평균","합격여부"};
				String[] input = new String[7];
				System.out.printf("%s 입력하세요.",subjects2[0]);
				input[0] = scan.next();
				for(int i =1; i<=3; i++) {
					System.out.printf("%s 입력하세요\n",subjects2[i]);
					input[i] = scan.next();
				}
				result = std.getReportCard(input);
				System.out.println("이름          국어          영어           수학          총점           평균          합격여부");
				System.out.println(result);
				break;
			case 8: //Ranking
				System.out.println("A선수 기록");
				float A = scan.nextFloat();
				System.out.println("B선수 기록");				
				float B = scan.nextFloat();
				System.out.println("C선수 기록");
				float C = scan.nextFloat();
				result = std.getRanking(A, B, C);
				System.out.println(result);
				
				//array
				break;
			case 9: //ReportCard
				String[] subjects = {"이름","국어","영어","수학","총점","평균","합격여부"};
				input = new String[7];
				System.out.printf("%s 입력하세요.",subjects[0]);
				input[0] = scan.next();
				for(int i =1; i<=3; i++) {
					System.out.printf("%s 입력하세요\n",subjects[i]);
					input[i] = scan.next();
				}
				result = std.getReportCard(input);
				System.out.println("이름        국어        영어         수학        총점        평균       합격여부");
				System.out.println(result);
				break;
			case 10: //ScoreCalc
				
				break;
			case 11: //Tax
				System.out.println("이름입력");
				name = scan.next();
				System.out.println("연봉입력 (4자리 ex)3000만원)");
				int annual = scan.nextInt();
				result = std.getTax(name, annual);
				System.out.println(result);
				break;
			case 12: //TimeCalc
				System.out.println("시간입력");
				int time = scan.nextInt();
				result = std.getTime(time);
				System.out.println(result);
				break;
			}
		}
	}
}
