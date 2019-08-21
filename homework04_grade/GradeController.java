package homework04_grade;
import javax.swing.JOptionPane;
public class GradeController {
	public static void main(String[] args) {
		GradeService service = new GradeService();
		Grade grade = null;
		while(true) {
		switch(JOptionPane.showInputDialog("0.종료 1.점수입력 2.총합 3.평균")) {
		case "0": JOptionPane.showMessageDialog(null, "종료");
			return;
		case "1": 
			grade = new Grade();
			String kor = JOptionPane.showInputDialog("국어점수"); 
			grade.setKor(Integer.parseInt(kor));
			String eng = JOptionPane.showInputDialog("영어점수");
			grade.setEng(Integer.parseInt(eng));
			String math = JOptionPane.showInputDialog("수학점수");
			grade.setMath(Integer.parseInt(math));
			JOptionPane.showMessageDialog(null, grade.toString());
			break;
		case "2":
			JOptionPane.showMessageDialog(null, service.getTotal(grade));
			break;
		case "3": 
			JOptionPane.showMessageDialog(null, service.getAgv(grade));
			break;
			}	
		}
	}
}