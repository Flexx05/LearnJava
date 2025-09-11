package Practice.ManageStudentArrayList;

public class Student implements Comparable<Student> {
	private String studentId, fullName;
	private int yearOfBirth;
	private double avgPoint;

	public Student(String studentId, String fullName, int yearOfBirth, double avgPoint) {
		this.studentId = studentId;
		this.fullName = fullName;
		this.yearOfBirth = yearOfBirth;
		this.avgPoint = avgPoint;
	}

	public Student(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public double getAvgPoint() {
		return avgPoint;
	}

	public void setAvgPoint(double avgPoint) {
		this.avgPoint = avgPoint;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName + ", yearOfBirth=" + yearOfBirth
				+ ", avgPoint=" + avgPoint + "]";
	}

	@Override
	public int compareTo(Student student) {
		return this.studentId.compareTo(student.studentId);
	}

}
