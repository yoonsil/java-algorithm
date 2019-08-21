package study06.oop;

public class Member {//{
	private String id, pw, name, ssn, blood; //instance 변수
	private double height, weight;//iv
	private int kor, eng, math, tax; //iv 
	public static int kor2, eng2, math2, tax2;//CV(클래스변수) 
	//}MV(멤버변수)
	//this ->field property
	
	public void setName(String name) { //인스탄스 메소드
		this.name = name; //instance method
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
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return this.eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return this.math;
	}
	
	//------------------------
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getTax() {
		return this.tax;
	}
	
	//------------------------------
	
	
	@Override
	public String toString() {
		return String.format("회원정보: \n"
				+ "아이디: %s\n"
				+ "비밀번호: %s\n"
				+ "이름: %s\n"
				+ "주민번호: %s\n"
				+ "키: %.1f cm\n"
		
				
				+ "몸무게: %.1f kg\n"
				+ "헐액형: %s 형\n"
				+ "국어점수: %d\n"
				+ "영어점수: %d\n"
				+ "수학점수: %d\n"
				+ "연봉: %d\n"
				,id, pw, name, ssn, 
				height, weight, blood,kor,eng,math,tax);
	}
}


