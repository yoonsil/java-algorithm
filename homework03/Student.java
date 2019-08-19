package homework03;

public class Student {
	//AC===========================================
	public String getAc(int fir, int sec, String symbol) {
		String result = "";
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
		String result ="";
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
		String result ="";
		int total = price * amount;
		int dc = total/ask;
		int finalprice = total-dc;
		return String.format("그럼 %d만 주세요.", finalprice);
	}
	
	//JOIN=============================================
	public String getJoin(String info[]) {
		String result ="";
		String[] join = {"아이디: ","비밀번호: ","이름: ","생년월일(예)1980-01-01:",
				"성인여부(성인true,미성년false): ","키(소수점첫째자리까지): ","몸무게(소수점 첫째 자리까지): ","헐액형(A): "};
		System.out.println("==============회원정보==============");
		String check = "";
		//성인여부체크
		if(info[4].equals("true")) {
			check = "성인";
		}else if(info[4].equals("false")){
			check ="미성년";
		}else {
			check = "잘못입력하셨습니다.";
		}
		//출력값설정
		info[4] = String.format("%s", check);
		info[5] = String.format("%s cm", info[5]);
		info[6] = String.format("%s kg", info[6]);
		info[7] = String.format("%s 형", info[7]);
		
		
		return join[0]+info[0]+"\n"+join[1]+info[1]
				+"\n"+join[2]+info[2]+"\n"+join[3]+info[3]
				+"\n"+join[4]+info[4]+"\n"+join[5]+info[5]
				+"\n"+join[6]+info[6]+"\n"+join[7]+info[7];
	}
		
		
		
	
	
}
