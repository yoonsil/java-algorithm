package study06.oop;

public class Service {
	
	public String getBmi(Member member) {
		String result ="";
		String name = member.getName(); //lv
		double height = member.getHeight();
		double weight = member.getWeight();
		double bmi = weight/((height/100)*(height/100));
		if(bmi>=30) {
			result ="고도비만";
		}else if(bmi>=25) {
			result ="비만";
		}else if(bmi>=23) {
			result ="과체중";
		}else if(bmi>=18.5) {
			result ="정상";
		}else {
			result ="저체중";
		}
		
		return String.format("%s님:%.1f(%s)", name,bmi,result);
	}
	public String getReportCard(Member member) {
		String result ="";
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		int total = kor+eng+math;
		int avg = total/3;
		if(70<=avg&&avg<90) {
			result ="(합격)";
		}else if(90<=avg){
			result ="(장학생)";
		}else {
			result ="(불합격)";
		}
		
		
		return String.format("총합:%d\n평균:%d\n결과:%s", total,avg,result);
	}
	public String getTax(Member member) {
		String result="";
		int tax = member.getTax();
		String name = member.getName();
		int multi =10000;
		double deduction = 0.097;
		double taxfinal = (tax*multi)*deduction;
		return String.format("연봉 %d0,000 받으시는 %s님 "
				+ "납부할 세금은 %.0f원 입니다.",tax,name,taxfinal);
	}
}
