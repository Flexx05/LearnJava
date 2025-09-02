package chapter7;

public class Main {
	public static void main(String[] args) {
		SinhVien it1 = new SinhVientIt("1308", "Mạnh Linh", 10, 9);
		SinhVien ck1 = new SinhVienCoKhi("1308", "Mạnh Linh", 10, 9);

		System.out.printf("Sinh viên %s có điểm: %.1f\n", it1.name, it1.getPoint());
		System.out.printf("Sinh viên %s có điểm: %.1f", ck1.name, ck1.getPoint());
	}
}
