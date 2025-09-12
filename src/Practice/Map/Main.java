package Practice.Map;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();

		try (Scanner scanner = new Scanner(System.in)) {
			int choose = 0;
			do {
				System.out.println("===========================");
				System.out.println("========== Menu ===========");
				System.out.println("Tra từ điển Anh - Việt\n" + "1. Thêm từ.\n" + "2. Xóa từ.\n"
						+ "3. Tìm nghĩa của từ.\n" + "4. In ra danh sách của từ.\n" + "5. In ra số lượng từ.\n"
						+ "6. Xóa tất cả từ.\n" + "0. Thoát");
				System.out.println("Chọn mục: ");
				choose = scanner.nextInt();
				scanner.nextLine();
				if (choose == 1) {
					System.out.println("Nhập từ tiếng Anh: ");
					String key = scanner.nextLine();
					System.out.println("Nhập nghĩa tiếng Việt của từ " + key + ": ");
					String value = scanner.nextLine();
					dictionary.addWord(key, value);
					System.out.println("Thêm thành công!" + dictionary.addWord(key, value));
				} else if (choose == 2 || choose == 3) {
					System.out.println("Nhập từ tiếng Anh: ");
					String key = scanner.nextLine();
					if (choose == 2) {
						dictionary.deleteWord(key);
						System.out.println("Xóa thành công!");
					} else {
						System.out.println("Nghĩa của từ " + key + " :" + dictionary.searchWord(key));
					}
				} else if (choose == 4) {
					dictionary.getAllWord();
				} else if (choose == 5) {
					System.out.println("Số lượng từ trong từ điển: " + dictionary.getCount());
				} else if (choose == 6) {
					dictionary.DeleteAllWord();
					System.out.println("Xóa thành công!");
				} else if (choose == 0) {
					System.err.println("Đã thoát");
					return;
				} else {
					System.err.println("Không có mục tương ứng. Vui lòng chọn lại!!");
				}

			} while (choose != 0);
		}
	}
}
