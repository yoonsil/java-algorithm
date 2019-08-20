package bymyselfOop;

public class Member {
	private String id, pw, name, email, symbol;
	private int fir,sec, income;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getIncome() {
		return this.income;
	}
	//-----------------------------
	public void setFir(int fir) {
		this.fir = fir;
	}
	public int getFir() {
		return this.fir;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public int getSec() {
		return this.sec;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getSymbol() {
		return this.symbol;
	}
	//------------------------------
	
	
	public String toString() {
		return String.format("ID:%s\n"
				+ "NAME:%s\n"
				+ "PASSWORD: %s\n"
				+ "EMAIL: %s\n"
				+ "SALARY: %d\n"
				, id,name,pw,email,income);
	}
	
	//---------------------
	
	
	
}
