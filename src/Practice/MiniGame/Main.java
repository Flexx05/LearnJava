package Practice.MiniGame;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		double playerAccount = 5000000;
		try (Scanner scanner = new Scanner(System.in)) {

			Locale local = new Locale("vi", "VN");
//			NumberFormat num = NumberFormat.getInstance(local);
			NumberFormat num = NumberFormat.getCurrencyInstance(local);
			int choose = 1;
			do {
				System.out.println("------------------------------------");
				System.out.println("Chọn (1) để tếp tục chơi");
				System.out.println("Chọn phím BẤT KỲ để thoát");
				choose = scanner.nextInt();

				if (choose == 1) {
					System.out.println("*** Bắt đầu chơi ***");
//					Đặt cược:
					System.out.println(
							"*** Tài khoản của bạn: " + num.format(playerAccount) + " Bạn muốn cược bao nhiêu?");
					double tienCuoc = 0;
					do {
						System.out.printf("*** Đặt cược (0 < số tiền cược < " + num.format(playerAccount) + ")");
						tienCuoc = scanner.nextDouble();
					} while (tienCuoc <= 0 || tienCuoc > playerAccount);

					int chooseOption = 0;
					do {
						System.out.println("*** Chọn (1) Tài hoặc chọn (2) Xỉu");
						chooseOption = scanner.nextInt();
					} while (chooseOption != 1 && chooseOption != 2);

//					Tung xúc xắc
					Random xx1 = new Random();
					Random xx2 = new Random();
					Random xx3 = new Random();

					int value1 = xx1.nextInt(6) + 1;
					int value2 = xx2.nextInt(6) + 1;
					int value3 = xx3.nextInt(6) + 1;

//					Trả kết quả
					int result = value1 + value2 + value3;
					System.err.println("*** Giá trị 1: " + value1 + " Giá trị 2: " + value2 + " Giá trị 3: " + value3);
					System.err.println("*** Kết quả: " + result);
					if (result == 3 || result == 18) {
						playerAccount -= tienCuoc;
						System.out.println("Nhà cái xin nhé");
						System.out.println("Tài khoản còn: " + playerAccount);
					} else if (result <= 4 && result >= 10) {
						System.out.println("Xỉu");
						if (chooseOption == 2) {
							playerAccount += tienCuoc;
							System.out.println("Bạn đã thắng");
							System.out.println("Tài khoản còn: " + playerAccount);
						} else {
							playerAccount -= tienCuoc;
							System.out.println("Thua nhé");
							System.out.println("Tài khoản còn: " + playerAccount);
						}
					} else {
						System.out.println("Tài");
						if (chooseOption == 1) {
							playerAccount += tienCuoc;
							System.out.println("Bạn đã thắng");
							System.out.println("Tài khoản còn: " + playerAccount);
						} else {
							playerAccount -= tienCuoc;
							System.out.println("Thua nhé");
							System.out.println("Tài khoản còn: " + playerAccount);
						}
					}

				}
			} while (choose == 1);
		}
	}
}
