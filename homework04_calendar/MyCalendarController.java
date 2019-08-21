package homework04_calendar;
import javax.swing.JOptionPane;
public class MyCalendarController {
	public static void main(String[] args) {
		MyCalendar mc = null;
		MyCalendarService ms = new MyCalendarService();
	while(true) {
		switch(JOptionPane.showInputDialog("0.종료 1.입력 2.월  3.윤년/평년")) {
		case "0": JOptionPane.showMessageDialog(null, "종료"); 
			return;
		case "1": 
			mc = new MyCalendar();
			String input = JOptionPane.showInputDialog("월를 입력하세요."); 
			mc.setEndDay(Integer.parseInt(input));
			
			mc.setYear(JOptionPane.showInputDialog("년도을 입력하세요."));
			break;
		case "2":			
			JOptionPane.showMessageDialog(null, ms.getEndDay(mc));
			break;
		case "3":			
			JOptionPane.showMessageDialog(null, ms.isLeapYear(mc));
			break;
			}
		}
	}
}
