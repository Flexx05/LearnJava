package Practice.Student;

public class Main {
	public static void main(String[] args) {
		Class classInfo1 = new Class("WD19321", "LTW");
		Class classInfo2 = new Class("MD19302", "LTM");
		Class classInfo3 = new Class("MKT19321", "MKT");

		DateOfBirth date1 = new DateOfBirth(13, 8, 2005);
		DateOfBirth date2 = new DateOfBirth(13, 8, 2005);
		DateOfBirth date3 = new DateOfBirth(2, 12, 2005);

		Student stu1 = new Student("PH51397", "Mạnh Linh", date1, 10, classInfo1);
		Student stu2 = new Student("PH51398", "Mạnh", date2, 1, classInfo3);
		Student stu3 = new Student("PH51399", "Linh Linh", date3, 5, classInfo2);

		System.out.println("Tên khoa của Mạnh Linh:" + stu1.getClassInfo().getMajor());

		System.out.println("Sinh viên Mạnh: " + stu2.CheckAvgPoint());

		System.out.println("Sinh viên Linh Linh với sinh viên Mạnh Linh: " + stu3.CheckDateOfBirth(stu1));
	}
}
