package study05.oop;

public class Member {
	private String id, pw, name, ssn, blood;
	private double height, weight;
	private int kor, tax;
	
	//this ->field property
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
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
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	public void setHeight(double height) {
		this.height = height; 
	}
	public double getHeight() {
		return this.height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
	//---------------------------------
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return this.kor;
	}
	//------------------------
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getTax() {
		return this.tax;
	}
	
	@Override
	public String toString() {
		return String.format("회원정보: \n"
				+ "아이디: %s\n"
				+ "비밀번호: %s\n"
				+ "이름: %s\n"
				+ "주민번호: %s\n"
				+ "키: %s\n"
				+ "몸무게: %s\n"
				+ "헐액형: %s\n"
				,id, pw, name, ssn, 
				height, weight, blood);
	}
}


