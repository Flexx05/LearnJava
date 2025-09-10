package Practice.Array;

import java.util.Arrays;

public class Main {
	public static int[] Reverse(int[] x) {

		int[] result = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			result[index] = x[i];
			index++;

		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 1, 9, 7, 3, 134, 4, 8, 11 };
		int[] b = new int[15];

//		Sắp xếp tăng dần

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

//		Sắp xếp giảm dần

//		Arrays.sort(a);
//		a = Main.Reverse(a);
//		System.out.println(Arrays.toString(a));

//		Tìm kiếm trong mảng

		int result = Arrays.binarySearch(a, 4);
		int result2 = Arrays.binarySearch(a, -1);
		System.out.println(result);
		System.out.println(result2);

//		Điền giá trị

		Arrays.fill(b, 5);
		System.out.println(Arrays.toString(b));
	}
}
