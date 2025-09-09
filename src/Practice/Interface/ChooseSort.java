package Practice.Interface;

public class ChooseSort implements ISort {

	@Override
	public void SortIncrease(double[] arr) {
		int i, j, min;
		for (i = 0; i < arr.length; i++) {
			min = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			double temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	@Override
	public void SortDecrease(double[] arr) {
		int i, j, min;
		for (i = 0; i < arr.length; i++) {
			min = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			double temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}
	}
}
