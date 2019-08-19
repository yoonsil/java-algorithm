package homework02;

/*to. 개발자님
	여기는 비트헬스 입니다.
	입력받을 정보는 아래와 같습니다.
	값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
	프로그램을 보여주세요
	
	=== 회원가입 ===
	아이디 : 
	비밀번호 : 
	이름 : 
	생년월일(예) 1980-01-01 : 
	성인여부(성인true,미성년false) : 
	키(소수점 첫째자리까지) :
	몸무게(소수점 첫째자리까지) : 
	혈액형(A) : 
	
	입력이 종료되면 ...아래처럼 보이게 해주세요
	
	=== 회원정보 ===
	0아이디 : hong 
	1비밀번호 : 1234
	2이름 : 홍길동
	3생년월일(예) 1990-05-05 : 
	4성인여부(성인true,미성년false) : 성인
	5키(소수점 첫째자리까지) : 178.5 cm
	6몸무게(소수점 첫째자리까지) : 75kg
	7혈액형(A) : B형
 * */
import java.util.Scanner;
public class Join {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] join = {"아이디: ","비밀번호: ","이름: ","생년월일(예)1980-01-01:",
				"성인여부(성인true,미성년false): ","키(소수점첫째자리까지): ","몸무게(소수점 첫째 자리까지): ","헐액형(A): "};
		String[] info = new String[8];
		System.out.println("==============회원가입==============");
		for(int i=0; i<join.length; i++) {
			System.out.printf("%s",join[i]);
			info[i] = scan.next();
		}
		
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
		
		//출력
		for(int i=0; i<info.length; i++) {
			System.out.println(join[i]+info[i]);		
		}
	}
}
