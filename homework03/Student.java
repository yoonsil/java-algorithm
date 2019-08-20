package homework03;

public class Student {
	//AC===========================================
	public String getAc(int fir, int sec, String symbol) {
		int val = 0;
		switch(symbol) {
		case "+" :val =fir + sec; break;
		case "-" :val =fir - sec; break;
		case "x" :val =fir * sec; break;
		}
		
		return String.format("%d %s %d = %d" , fir,symbol,sec,val);
	}
	//--------------------------------------------------
	public String getDivided(int fir, int sec) {
		return String.format("%d / %d = %d[%d]",fir,sec,fir/sec,fir%sec);
	}
	
	//BMI==========================================
	public String getBmi(String name, float height, float weight) {
		String result ="";
		float bmi =weight/((height/100)*(height/100));
		
		if(bmi>=30) {
			result = "고도비만";
		}else if(bmi>=25) {
			result ="비만";
		}else if(bmi>=23) {
			result ="과체중";
		}else if(bmi>=18.5){
			result="정상";
		}else {
			result="저체중";
		}
		return String.format("%.1f (%s)",bmi,result);
	}
	
	//HOW MUCH============================================
	public String howMuch(int price, int amount) {
		int total = price * amount;
		return String.format("%d개 주세요.\n총금액은 %d 입니"
				+ "다.\n비싸요 __만 깍아주세요.\n",amount,total);
	}
	//--------------------------------------------
	public String notGetDc(int price, int amount, int ask) {
		
		return "죄송합니다. 10% 이상은 깍아드리기 힘들어요.";
	}
	//--------------------------------------------
	public String getDcFinal(int price, int amount, int ask) {
//		String result ="";
		int total = price * amount;
		int dc = total/ask;
		int finalprice = total-dc;
		return String.format("그럼 %d만 주세요.", finalprice);
	}
	
	//JOIN=============================================
	public String getJoin(String id, String pw, String name, String birth, String adult, float height, float weight, String blood) {
		String check = "";
		String result ="";
		//성인여부체크
		if(adult.equals("true")) {
			check = "성인";
		}else if(adult.equals("false")){
			check ="미성년";
		}else {
			check = "잘못입력하셨습니다.";
		}
		//출력값설정
		System.out.println("==============회원정보==============");
		
		return String.format("아이디:%s \n"
				+ "비번: %s\n"
				+ "이름: %s\n"
				+ "생년월일: %s\n"
				+ "성인여부(성인true,미성년false): %s\n"
				+ "키(소수점 포함): %.1f cm\n"
				+ "몸무게(소수점포함): %.1f kg\n"
				+ "혈액형: %s형\n",id,pw,name,birth,adult,height,weight,blood);
	}
	
	//LeapYear=======================================
	public String getFeb(int year) {
		String result="";
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
		return result;
	}
	//Month End Day=======================================
	public String getLastday(int month) {
		String day ="";
		if(month==2) {
			day ="29일";
		}else if(month<=7) {
			if(month%2==0) {
				day ="30일";
			}else {
				day ="31일";
			}
		}else if(month>=8 && month<=12) {
			if(month%2==0) {
				day="31일";
			}else {
				day="30일";
			}
		}else {
			day="다시입력하세요.";
		}
		return day;
	}
	//PassOrFail===============================================	
	public String getResult(String input[]) {
		String result ="";
		String sen2="";
		String sen3="";
		String acceptance="";
		int scores =0;
		for(int i = 1; i<=3; i++) {
		scores = scores += Integer.parseInt(input[i]);
		}
		//평균계산
		int avg = scores/3; 
		input[5] = String.valueOf(avg);
		//index값 지정
		input[4] = String.valueOf(scores);
		input[6] = String.valueOf(avg);
		//결과출력
			sen2 = "\n======================================================\n";
		for(int i=0; i<input.length; i++) {
			sen3 += " "+input[i]+"   ";
			}
		//합격여부출력
		if(70<=avg&&avg<90) {
			acceptance = "(합격)";
		}else if(90<=avg){
			acceptance ="(장학생)";
		}else {
			acceptance ="(불합격)";
		}
		
		result = sen2+sen3+acceptance;
		
		return result;
	}
	//Ranking=========================================
	public String getRanking(float A, float B, float C) {
		String result ="";
		String fir = "";
		String sec = "";
		String thi = "";
		if(A<B && B<C && A<C) {
			fir = String.format("1등 : A선수 (%.1f초)",A);
			sec = String.format("2등 : B선수 (%.1f초)",B);
			thi = String.format("3등 : C선수 (%.1f초)",C);
		}else if(B<A && C<B && A<B) {
			fir = String.format("1등 : C선수 (%.1f초)",C);
			sec = String.format("2등 : A선수 (%.1f초)",A);
			thi = String.format("3등 : B선수 (%.1f초)",B);
		}else if(B<A && C<B && A<B) {
			fir = String.format("1등 : C선수 (%.1f초)",C);
			sec = String.format("2등 : A선수 (%.1f초)",A);
			thi = String.format("3등 : B선수 (%.1f초)",B);
		}
		
		
		return result;
	}
	//ReportCard======================================
	public String getReportCard(String input[] ) {
		String result = "";
		String sen2="";
		String sen3="";
		String acceptance="";
		int scores =0;
		for(int i = 1; i<=3; i++) {
		scores = scores += Integer.parseInt(input[i]);
		}
		//평균계산
		int avg = scores/3; 
		input[5] = String.valueOf(avg);
		//index값 지정
		input[4] = String.valueOf(scores);
		input[6] = String.valueOf(avg);
		//결과출력
			sen2 = "======================================================\n";
		for(int i=0; i<input.length; i++) {
			sen3 += " "+input[i]+"   ";
			}
		//합격여부출력
		if(70<=avg&&avg<90) {
			acceptance = "(합격)";
		}else if(90<=avg){
			acceptance ="(장학생)";
		}else {
			acceptance ="(불합격)";
		}
		
		result = sen2+sen3+acceptance;
		
		return result;
	}
	
	//ScoreCalc=======================================
	
	//Tax=======================================
	public String getTax(String name, int annual) {
		int multi = 10000;
		float deduction = 0.097f;
		double tax = (annual*multi)*deduction;
		return String.format("연봉 %d만원을 받으시는 %s님께서 "
				+ "납부할 세금은 %.0f원 입니다.", annual,name,tax);
	}
	//TimeCalc========================================
	public String getTime(int time) {
		int min =(time%3600)/60;
		int sec =time%60;
		int hour =time/3600;
		return String.format("%d시 %d분 %d초 입니다.",hour,min,sec);
	}
}
