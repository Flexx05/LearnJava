package Practice;

import java.util.Scanner;

public class ChuyenDoi {
	public static void main(String[] args) {
		int num;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập số: ");
			num = scanner.nextInt();

			String nhiPhan = "";

			while (num > 0) {
				nhiPhan = (num % 2) + nhiPhan;
				num = num / 2;
			}
			System.out.println("chuyển sang nhị phân: " + nhiPhan);
		}
	}
}
