package Practice.Interface;

public class Main {
	public static void main(String[] args) {
		CasioFX500 fx500 = new CasioFX500();
		CasioVinacal500 vnc500 = new CasioVinacal500();

		System.out.println("5 + 3 = " + fx500.Add(5, 3));

		double[] arr2 = new double[] { 5, 4, 3, 8, 6, 10 };

		SortInsert sort1 = new SortInsert();
		ChooseSort sort2 = new ChooseSort();

		sort1.SortDecrease(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		sort2.SortIncrease(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
