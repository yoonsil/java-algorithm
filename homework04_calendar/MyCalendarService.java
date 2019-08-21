package homework04_calendar;
public class MyCalendarService {
	//----------------------------------------
	public String getEndDay(MyCalendar mc) {
		String day="";
		int month= mc.getEndDay();
		if(month==2) {
			day ="29일";
		}else if(month<=7) {
			if(month%2==0) {
				day ="30일";
			}else {
				day ="31일";
			}
		}else if(month>=8 && month<=12) {
			if(month%2==0){
				day ="31일";
			}else {
			day ="30일";
			}
		}else{
			day ="다시입력하세요.";
		}
			
		return String.format("%s은 %s입니다.",month,day);
	}
	
	//-----------------------------------------
	public String isLeapYear(MyCalendar mc) {
		String result="";
		int year = Integer.parseInt(mc.getYear());
		if(year%4==0){
			result ="윤년";
			if(year%100==0) {
				result ="평년";
				if(year%400==0) {
					result ="윤년";
				}else {
					result ="평년";
				}
			}else {
				result ="윤년";
			}
		}else{
			result ="평년";
		}
		return String.format("%s년도는 %s입니다. ",year,result);
	}
	//-----------------------------------------
}
