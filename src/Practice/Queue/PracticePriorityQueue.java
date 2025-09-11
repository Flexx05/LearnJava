package Practice.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PracticePriorityQueue {
	public static void main(String[] args) {
		Queue<String> listStudent = new PriorityQueue<String>();

		listStudent.offer("Mạnh Linh");
		listStudent.offer("Lê Mạnh Linh");
		listStudent.offer("Dz nhất hệ Mặt Trời");
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
