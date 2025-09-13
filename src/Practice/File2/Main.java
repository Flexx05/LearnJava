package Practice.File2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Nhập tên file: ");
			String tenFile = scanner.nextLine();
			PracticeFile file = new PracticeFile(tenFile);
			int choose = 0;
			do {
				System.out.println("========== Menu ==========");
				System.out.println("1. Kiểm tra file có thể thực thi\n" + "2. Kiểm tra file có thể đọc\n"
						+ "3. Kiểm tra file có thể ghi\n" + "4. In đường dẫn\n" + "5. In tên file\n"
						+ "6. Kiểm tra file là tập tin hay thư mục\n" + "7. In danh sách file con\n"
						+ "8. In ra cây thư mục\n" + "0. Thoát");
				System.out.println("Chọn mục: ");
				choose = scanner.nextInt();
				scanner.nextLine();
				if (choose == 1) {
					System.out.println(file.CheckFileExecute());
				} else if (choose == 2) {
					System.out.println(file.CheckFileCanRead());
				} else if (choose == 3) {
					System.out.println(file.CheckFileCanWrite());
				} else if (choose == 4) {
					file.showPath();
				} else if (choose == 5) {
					file.getName();
				} else if (choose == 6) {
					file.CheckIsFileOrFolder();
				} else if (choose == 7) {
					file.getChildInFolder();
				} else if (choose == 8) {
					file.GetFolderTree();
				} else if (choose == 0) {
					System.err.println("Đã thoát");
					return;
				}
			} while (choose != 0);
		}
	}
}
