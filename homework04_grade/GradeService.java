package homework04_grade;

public class GradeService {
	public String getTotal(Grade grade) {
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		int total = kor+eng+math;
		return String.format("총점:%d", total);
	}
	public String getAgv(Grade grade) {
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		int total = kor+eng+math;
		int avg = total/3;
		return String.format("평균:%d", avg);
	}

}
