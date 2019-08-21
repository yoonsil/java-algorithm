package homework04_member;

import javax.swing.JOptionPane;

public class MemberService {
	public String getBmi(Member member) {
	String name = member.getName();
	String result ="";
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
	return String.format("%s님 %.1f(%s)",name,bmi,result);
	}
	
	public String getTax(Member member) {
	int salary = member.getSalary();
	double deduction = 0.097;
	int annual =10000;
	double total = (salary*annual)*deduction;
	return String.format("납부할 세금은 %.0f입니다.", total);
	}
}
