package homework04_member;
import javax.swing.JOptionPane;;
public class MemberController {
	public static void main(String[] args) {
		MemberService ms = new MemberService();
		Member member = null;
		while(true) {
		switch(JOptionPane.showInputDialog("0.종료 1.회원정보 2.정보보기 3.BMI 4.Tax")) {
		case "0": JOptionPane.showMessageDialog(null, "종료"); 
			return;
		case "1": 
			member = new Member();
			member.setId(JOptionPane.showInputDialog("아이디"));
			member.setPw(JOptionPane.showInputDialog("비번"));
			member.setName(JOptionPane.showInputDialog("이름"));
			member.setSsn(JOptionPane.showInputDialog("주민번호"));
			member.setBlood(JOptionPane.showInputDialog("혈액형"));
			String height = JOptionPane.showInputDialog("키");
			member.setHeight(Double.parseDouble(height));
			String weight = JOptionPane.showInputDialog("몸무게");
			member.setWeight(Double.parseDouble(weight));
			String salary = JOptionPane.showInputDialog("연금");
			member.setSalary(Integer.parseInt(salary));
			break;
		case "2": 
			JOptionPane.showMessageDialog(null,member.toString());
			break;
		case "3": 
			JOptionPane.showMessageDialog(null,ms.getBmi(member));
			break;
		case "4":
			JOptionPane.showMessageDialog(null,ms.getTax(member));			
			break;
			}
		}
	}
}
