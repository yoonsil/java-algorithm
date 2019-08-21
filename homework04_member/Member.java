package homework04_member;

public class Member {
	private String id, pw, name, ssn, blood; //instance 변수
	private double height, weight;//iv
	private int salary;
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return String.format("아이디:%s\n비번:%s\n이름:%s\n주민번호:%s\n"
				+ "혈액형:%s형\n키:%.0fcm\n몸무게:%.0fkg\n연금:%d",
				id,pw,name,ssn,blood,height,weight,salary);
	}
}
