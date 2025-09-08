package Practice.Student;

import java.util.Objects;

public class Student {
	private String studentID, fullName;
	private DateOfBirth dateOfBirth;
	private double avgPoint;
	private Class classInfo;

	public Student(String studentID, String fullName, DateOfBirth dateOfBirth, double avgPoint, Class classInfo) {
		if (avgPoint < 0) {
			System.err.println("Điểm không thể âm");
			return;
		}
		this.studentID = studentID;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.avgPoint = avgPoint;
		this.classInfo = classInfo;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public DateOfBirth getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(DateOfBirth dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getAvgPoint() {
		return avgPoint;
	}

	public void setAvgPoint(double avgPoint) {
		if (avgPoint < 0) {
			System.err.println("Điểm không thể âm");
			return;
		}
		this.avgPoint = avgPoint;
	}

	public Class getClassInfo() {
		return classInfo;
	}

	public void setClassInfo(Class classInfo) {
		this.classInfo = classInfo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(avgPoint, classInfo, dateOfBirth, fullName, studentID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(avgPoint) == Double.doubleToLongBits(other.avgPoint)
				&& Objects.equals(classInfo, other.classInfo) && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(fullName, other.fullName) && Objects.equals(studentID, other.studentID);
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", fullName=" + fullName + ", dateOfBirth=" + dateOfBirth
				+ ", avgPoint=" + avgPoint + ", classInfo=" + classInfo + "]";
	}

	public String CheckAvgPoint() {
		return this.avgPoint < 5 ? "Trượt" : "Đỗ";
	}

	public String CheckDateOfBirth(Student student) {
		return this.dateOfBirth.equals(student) ? "Cùng ngày sinh" : "Khác ngày sinh";
	}
}
