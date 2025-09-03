package chapter9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static String NhapMaSV(Scanner scanner) {
		String result = null;
		while (true) {
			System.out.print("Nhập mã SV: ");
			try {
				result = scanner.nextLine();
				break;
			} catch (Exception e) {
				System.err.println("Mã SV không hợp lệ");
				scanner.next();
			}
		}
		return result;
	}

	public static String NhapHoTen(Scanner scanner) {
		String result = null;
		while (true) {
			System.out.print("Nhập tên: ");
			try {
				result = scanner.nextLine();
				break;
			} catch (Exception e) {
				System.err.println("Tên SV không hợp lệ");
				scanner.next();
			}
		}
		return result;
	}

	public static double NhapDiem(Scanner scanner) {
		double result;
		while (true) {
			System.out.print("Nhập điểm: ");
			try {
				result = scanner.nextDouble();
				if (result < 0) {
					System.err.println("Điểm không thể nhỏ hơn 0");
					continue;
				}
				if (result > 10) {
					System.err.println("Điểm không thể lớn hơn 10");
					continue;
				}
				break;
			} catch (Exception e) {
				System.err.println("Điểm không hợp lệ");
				scanner.next();
			}
		}
		return result;
	}

	public static int NhapTuoi(Scanner scanner) {
		int result;
		while (true) {
			System.out.print("Nhập tuổi: ");
			try {
				result = scanner.nextInt();
				if (result < 0) {
					System.err.println("Tuổi không thể nhỏ hơn 0");
					continue;
				}
				if (result > 100) {
					System.err.println("Tuổi không thể lớn hơn 100");
					continue;
				}
				break;
			} catch (Exception e) {
				System.err.println("Tuổi không hợp lệ");
				scanner.next();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<SinhVien> arrSV = new ArrayList<>();
			while (true) {
				String maSV = NhapMaSV(scanner);
				String hoTen = NhapHoTen(scanner);
				double diem = NhapDiem(scanner);
				int tuoi = NhapTuoi(scanner);

				scanner.nextLine();
				arrSV.add(new SinhVien(maSV, hoTen, diem, tuoi));
				System.out.print("Nhập thêm không? (V/N): ");
				String input = scanner.nextLine();
				if (input.equals("N") || input.equals("n")) {
					System.out.println(arrSV.toString());
					return;
				}

			}
		}
	}
}
