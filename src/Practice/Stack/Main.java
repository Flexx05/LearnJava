package Practice.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

//			Stack<String> stack = new Stack<>();

//			stack.push(): đưa giá trị vào stack
//			stack.pop(): lấy giá trị ra và xóa khỏi stack
//			stack.peek(): lấy ra trị nhưng không xóa khỏi stack
//			stack.clear(): xóa tất cả phần tử trong stack
//			stack.contains("giá trị"): kiểm tra giá trị tồn tại trong stack

//			Đảo ngược chuỗi

//			System.out.println("Nhập vào chuỗi: ");
//			String string = scanner.nextLine();
//
//			for (int i = 0; i < string.length(); i++) {
//				stack.push(string.charAt(i) + "");
//			}
//
//			for (int i = 0; i < string.length(); i++) {
//
//				System.out.print(stack.pop());
//			}

//			Chuyển số thập phân sang hệ nhị phân
			Stack<Integer> stackInt = new Stack<>();
			System.out.println("Nhập vào 1 số: ");
			int num = scanner.nextInt();
			while (num > 0) {
				int sodu = num % 2;
				stackInt.push(sodu);
				num = num / 2;
			}
			int size = stackInt.size();
			for (int i = 0; i < size; i++) {
				System.out.print(stackInt.pop());
			}

		}

	}
}
