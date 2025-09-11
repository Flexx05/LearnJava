package Practice.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class PracticeDeque {
	public static void main(String[] args) {
		Deque<String> listStudent = new LinkedList<String>();

		listStudent.offer("Lê Mạnh Linh");
		listStudent.offer("Dz nhất hệ Mặt Trời");
		listStudent.offerLast("Mạnh Linh");
		listStudent.offerFirst("Flexx");

		while (true) {
			String ten = listStudent.poll();
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}
}
