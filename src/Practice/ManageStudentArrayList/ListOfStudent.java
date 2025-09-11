package Practice.ManageStudentArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListOfStudent {
	private ArrayList<Student> studentArr;

	public ListOfStudent(ArrayList<Student> studentArr) {
		this.studentArr = studentArr;
	}

	public ListOfStudent() {
		this.studentArr = new ArrayList<Student>();
	}

	public void addStudent(Student stu) {
		this.studentArr.add(stu);
	}

	public void getAllStudent() {
		for (Student student : studentArr) {
			System.out.println(student);
		}
	}

	public String checkEmptyListStudent() {
		return this.studentArr.isEmpty() ? "Danh sách rỗng" : "Danh sách không rỗng";
	}

	public int getCountOfStudent() {
		return this.studentArr.size();
	}

	public void makeEmptyListStudent() {
		this.studentArr.removeAll(studentArr);
	}

	public String checkExistStudent(Student student) {
		return this.studentArr.contains(student) ? "Có tồn tại" : "Không tồn tại";
	}

	public void deleteOneStudent(Student student) {
		this.studentArr.remove(student);
	}

	public void searchStudent(String name) {
		for (Student student : studentArr) {
			if (student.getFullName().indexOf(name) >= 0) {
				System.out.println(student);
			}
		}
	}

	public void sortStudentByAvgPoint() {
		Collections.sort(this.studentArr, new Comparator<Student>() {

			@Override
			public int compare(Student st1, Student st2) {
				if (st1.getAvgPoint() < st2.getAvgPoint()) {
					return 1;
				} else if (st1.getAvgPoint() > st2.getAvgPoint()) {
					return -1;
				}
				return 0;
			}

		});
	}
}
