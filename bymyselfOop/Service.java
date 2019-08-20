package bymyselfOop;

public class Service {
	public String getAc(Member member) {
		String result ="";
		int fir = member.getFir();
		int sec = member.getSec();
		int cal = 0;
		String symbol = member.getSymbol();
		switch(symbol) {
		case "+": cal = fir+sec; break;
		case "-": cal = fir-sec; break;
		case "/": cal = fir/sec; break;
		case "x": cal = fir*sec; break;
		}
		return String.format("%d %s %d = %s", fir, symbol, sec, cal);
	}
	
	public String getTax(Member member) {
		String result ="";
		String name = member.getName();
		int income = member.getIncome();
		double decution =0.097;
		int multi = 10000;
		double tax = (income*multi)*decution;
		return String.format("연봉%d만원을 받으시는"
				+ "%s님께서 납부할 세금은 %.0f입니다.", income, name, tax);
	}
}
