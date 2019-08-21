package study06.oop;
import javax.swing.JOptionPane;
public class Engine {
	public static void main(String[] args) {
		Member member = null;
		Service service = new Service();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.회원가입 2.정보보기 3.BMI 4.tax")){
			case "0": ;return;
			case "1": 
				member = new Member();
				member.setId(JOptionPane.showInputDialog("아이디"));
				member.setPw(JOptionPane.showInputDialog("비번"));				
				member.setName(JOptionPane.showInputDialog("이름"));
				member.setSsn(JOptionPane.showInputDialog("주민번호"));
				String height = JOptionPane.showInputDialog("키");
				member.setHeight(Double.parseDouble(height));
				String weight = JOptionPane.showInputDialog("몸무게");
				member.setWeight(Double.parseDouble(weight));
				member.setBlood(JOptionPane.showInputDialog("혈액형"));
				String kor = JOptionPane.showInputDialog("국어점수");
				member.setKor(Integer.parseInt(kor));
				String eng = JOptionPane.showInputDialog("영어점수");
				member.setEng(Integer.parseInt(eng));
				String math = JOptionPane.showInputDialog("수학점수");
				member.setMath(Integer.parseInt(math));				
				String tax = JOptionPane.showInputDialog("연봉");
				member.setTax(Integer.parseInt(tax));
				break;
			case "2":
				JOptionPane.showMessageDialog(null,""+member.toString());
				break;
			case "3": 
				JOptionPane.showMessageDialog(null,service.getBmi(member));
				break;
			case "4": 
				JOptionPane.showMessageDialog(null, service.getTax(member));
				break;
			}
		}
	}
}
