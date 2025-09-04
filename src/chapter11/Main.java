package chapter11;

public class Main extends Thread {

	public void run() {
		System.out.println("Start a thread!");
		long sum = 0L;
		for (long i = 0L; i < 10000000000L; i++) {
			sum += i;
		}
		System.out.println("End a thread");
	}

	public static void main(String[] args) {
		int MAX = 1;
		for (int i = 0; i < MAX; i++) {
			(new Main()).start();
		}
		System.out.println("Finish");
	}
}
