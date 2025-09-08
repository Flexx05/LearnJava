package Practice;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
//Giải phương trình bậc 2
	public static void main(String[] args) {
		double a, b, c, x1, x2, delta;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập a = ");
			a = scanner.nextDouble();
			if (a == 0) {
				System.err.println("a phải lớn hơn 0");
				return;
			}
			System.out.print("Nhập b = ");
			b = scanner.nextDouble();
			System.out.print("Nhập c = ");
			c = scanner.nextDouble();

			delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				x1 = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x = " + x1);
			} else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}
