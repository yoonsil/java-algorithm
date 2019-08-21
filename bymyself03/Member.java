package bymyself03;

public class Member {
	private String name, age, id, pw, email;
	//---------------------
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAge() {
		return this.age;
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
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String toString() {
		return String.format("이름 %s\n"
				+ "나이 %s\n"
				+ "아이디 %s\n"
				+ "비밀번호 %s\n"
				+ "이메일 %s", name,age,id,pw,email);
	}
}
