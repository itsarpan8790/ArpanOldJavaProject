package practise;

public class SumAndAvgArray {

	public int arraySum() {

		int ar[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		int length = ar.length;
		for (int i = 0; i < length; i++) {
			sum = sum + ar[i];
		}
		return sum;

	}

	public int arrayAvg() {
		int ar[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		int length = ar.length;
		for (int i = 0; i < length; i++) {
			sum = sum + ar[i];
		}
		int avg = sum / length;
		return avg;

	}
}
