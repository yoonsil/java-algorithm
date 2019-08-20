package study05.oop;
import java.util.Scanner;
public class Engine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println("0.종료 1.회원가입 2.정보보기 3.아이디찾기 4.BMI\n"
					+ "5.Report Card 6.tax\n");
			switch(scan.nextInt()){
			case 0: System.out.println("종료");return;
			case 1: 
				member = new Member();
				System.out.println("아이디");
				member.setId(scan.next());
				System.out.println("비번");
				member.setPw(scan.next());
				System.out.println("이름");
				member.setName(scan.next());
				System.out.println("주민번호");
				member.setSsn(scan.next());
				System.out.println("키");
				member.setHeight(scan.nextDouble());
				System.out.println("몸무게");
				member.setWeight(scan.nextDouble());
				System.out.println("혈액형");
				member.setBlood(scan.next());
				System.out.println("국어점수");
				member.setKor(scan.nextInt());
				System.out.println("영어점수");
				member.setEng(scan.nextInt());
				System.out.println("수학점수");
				member.setMath(scan.nextInt());				
				System.out.println("연봉(4자리 입력 ex.3000)");
				member.setTax(scan.nextInt());
				break;
			case 2: 
				System.out.println(member.toString());
				break;
			case 3: 
				System.out.println("아이디, 이름을 입력하면 비번, 주민번호 확인가능");
				String searchName = scan.next();
				String searchId = scan.next();
				if(searchName.equals(member.getId())&&searchId.equals(member.getName())) {
					System.out.printf("찾는 아이디: %s\n"
							+ "주민번호: %s\n",member.getId(),member.getSsn());
				}else {
					System.out.println("찾는 아이디가 업습니다.");
				}
				break;
			case 4: 
				System.out.println("BMI구하기");
				System.out.println(service.getBmi(member));
				break;
			case 5:
				System.out.println("Report card");
				System.out.println(service.getReportCard(member));
				break;
			case 6: 
				System.out.println("Tax");
				System.out.println(service.getTax(member));
				break;
			}
		}
	}
}
