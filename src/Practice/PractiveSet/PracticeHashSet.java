package Practice.PractiveSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PracticeHashSet {
	Set<String> thungPhieuThuong = new HashSet<>();

	public String ThemMaDuThuong(String string) {
		return this.thungPhieuThuong.add(string) ? "Thêm thành công" : "Thêm thất bại";
	}

	public String XoaPhieu(String string) {
		return this.thungPhieuThuong.remove(string) ? "Xóa thành công" : "Xóa thất bại";
	}

	public String KiemTraPhieu(String string) {
		return this.thungPhieuThuong.contains(string) ? "Tồn tại" : "Không tồn tại";
	}

	public void XoaTatCaPhieu() {
		this.thungPhieuThuong.clear();
	}

	public int LaySoLuong() {
		return this.thungPhieuThuong.size();
	}

	@Override
	public String toString() {
		return "PracticeHashSet [thungPhieuThuong=" + thungPhieuThuong + "]";
	}

	public String rutPhieu() {
		String ketQua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.thungPhieuThuong.size());
		ketQua = (String) this.thungPhieuThuong.toArray()[viTri];
		return ketQua;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			PracticeHashSet rt = new PracticeHashSet();
			int luaChon = 0;
			do {
				System.out.println("============================");
				System.out.println("*** MENU ***");
				System.out.println("1. Thêm mã số dự thưởng.\n" + "2. Xóa mã số dự thưởng.\n"
						+ "3. Kiểm tra tồn tại mã số dự thưởng.\n" + "4. Xóa tất cả các phiếu dự thưởng.\n"
						+ "5. Số lượng phiếu dự thưởng.\n" + "6. Rút thăm trúng thường.\n"
						+ "7. Danh sách mã số dự thưởng\n" + "0. Thoát");
				System.out.println("Nhập mục muốn chọn: ");
				luaChon = scanner.nextInt();
				scanner.nextLine();

				if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
					System.out.println("Nhập phiếu: ");
					String value = scanner.nextLine();

					if (luaChon == 1) {
						System.out.println(rt.ThemMaDuThuong(value));
					} else if (luaChon == 2) {
						System.out.println(rt.XoaPhieu(value));
					} else if (luaChon == 3) {
						System.out.println(rt.KiemTraPhieu(value));
					}
				} else if (luaChon == 4) {
					rt.XoaTatCaPhieu();
					System.out.println("Xóa tất cả thành công");
				} else if (luaChon == 5) {
					System.out.println(rt.LaySoLuong());
				} else if (luaChon == 6) {
					System.out.println(rt.rutPhieu());
				} else if (luaChon == 7) {
					System.out.println(rt.toString());
				} else if (luaChon == 0) {
					System.err.println("Đã thoát");
					return;
				}

			} while (luaChon != 0);
		}

	}
}
