package Practice.ManageStudentArrayList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			ListOfStudent listStu = new ListOfStudent();
			int luaChon = 0;

			do {
				System.out.println("MENU");
				System.out.println("" + "1. Thêm sinh viên vào danh sách \n" + "2. In danh sách sinh viên\n"
						+ "3. Kiểm tra danh sách có rỗng hay không.\n"
						+ "4. Lấy ra số lượng sinh viên có trong danh sách.\n" + "5. Làm rỗng danh sách sinh viên.\n"
						+ "6. Kiểm tra sinh viên có tồn tại trong danh sách sinh viên không. (dựa trên mã sinh viên)\n"
						+ "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên \n"
						+ "8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
						+ "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n" + "0. Thoát\n");
				System.out.println("Vui lòng chọn chức năng: ");
				luaChon = scanner.nextInt();
				scanner.nextLine();

				if (luaChon == 1) {
					System.out.println("Nhập mã sinh viên: ");
					String studentId = scanner.nextLine();
					System.out.println("Nhập tên sinh viên: ");
					String fullName = scanner.nextLine();
					System.out.println("Nhập năm sinh: ");
					int yearOfBirth = scanner.nextInt();
					System.out.println("Nhập điểm trung bình: ");
					double avgPoint = scanner.nextDouble();

					Student stu = new Student(studentId, fullName, yearOfBirth, avgPoint);
					listStu.addStudent(stu);
					System.out.println("Thêm sinh viên thành công");

				} else if (luaChon == 2) {
					System.out.println("Danh sách sinh viên:");
					listStu.getAllStudent();

				} else if (luaChon == 3) {
					System.out.println(listStu.checkEmptyListStudent());

				} else if (luaChon == 4) {
					System.out.println("Danh sách sinh viên có: " + listStu.getCountOfStudent() + " sinh viên");

				} else if (luaChon == 5) {
					listStu.makeEmptyListStudent();
					System.out.println("Đã xóa tất cả sinh viên có trong danh sách");

				} else if (luaChon == 6) {
					System.out.println("Nhập mã sinh viên: ");
					String studentId = scanner.nextLine();
					Student student = new Student(studentId);
					System.out.println(listStu.checkExistStudent(student));

				} else if (luaChon == 7) {
					System.out.println("Nhập mã sinh viên: ");
					String studentId = scanner.nextLine();
					Student student = new Student(studentId);
					listStu.deleteOneStudent(student);
					System.out.println("Xóa thành công");

				} else if (luaChon == 8) {
					System.out.println("Nhập tên sinh viên: ");
					String name = scanner.nextLine();
					listStu.searchStudent(name);

				} else if (luaChon == 9) {
					listStu.sortStudentByAvgPoint();
					listStu.getAllStudent();

				} else if (luaChon == 0) {
					System.err.println("Đã thoát");
				}
			} while (luaChon != 0);
		}
	}
}
