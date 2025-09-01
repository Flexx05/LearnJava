package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {

		ArrayList<Double> numberArr = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Nhập vào số thực bất kỳ: ");
			Double input = scanner.nextDouble();
			numberArr.add(input);
			scanner.nextLine();
			System.out.print("Nhập nữa không? (Y/N): ");
			String keyWord = scanner.nextLine();
			if (keyWord.equals("N") || keyWord.equals("n")) {
				break;
			}

		}
		System.out.println("check Array " + numberArr);
		double sum = 0;
		for (int i = 0; i < numberArr.size(); i++) {
			sum += numberArr.get(i);

		}
		System.out.println("Check sum: " + sum);
	}

}
