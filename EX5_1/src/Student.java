public class Student {
	private String name;
	private String department;
	private String id;
	private double grade;//이름  학과 학번 점수 선언
	
	public Student(String name, String department, String id, double grade) {
		this.name = name;
		this.department = department;
		this.id = id;
		this.grade = grade;
	}//this.에 4가지 저장하기
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public double getGrade() {
		return grade;
	}
}
//public으로 4가지 함수를 만든다.