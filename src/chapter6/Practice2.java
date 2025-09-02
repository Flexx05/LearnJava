package chapter6;

import java.util.ArrayList;

public class Practice2 {
	public static void main(String[] args) {
		Student st1 = new Student("Mạnh Linh", 1);
		Student st2 = new Student("Nguyễn An", 2);
		Student st3 = new Student("Nguyễn Ngọc", 3);
		Student st4 = new Student("Thúy", 4);
		Student st5 = new Student(" Linh", 5);

		ArrayList<Student> stuArr = new ArrayList<>();
		stuArr.add(st1);
		stuArr.add(st2);
		stuArr.add(st3);
		stuArr.add(st4);
		stuArr.add(st5);

		for (int i = 0; i < stuArr.size(); i++) {
			if (stuArr.get(i).getName().startsWith("Nguyễn")) {
				System.out.println(stuArr.get(i));
			}
		}

	}
}
