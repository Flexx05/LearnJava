package Practice.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PracticeQueue {
	public static void main(String[] args) {
		Queue<String> listStudent = new LinkedList<>();

		listStudent.offer("Mạnh Linh");
		listStudent.offer("Lê Mạnh Linh");
		listStudent.offer("Đz nhất hệ Mặt Trời");
		listStudent.offer("Flexx");

		while (true) {
			String ten = listStudent.poll();
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
