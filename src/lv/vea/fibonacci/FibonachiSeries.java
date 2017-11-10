package lv.vea.fibonacci;

import java.util.Arrays;

public class FibonachiSeries {

	private static int FibonacciSeries[];

	public static void main(String[] args) {
		int[] myFib = getFibonacciSeries(6);
		System.out.println(Arrays.toString(myFib));
	}

	public static int[] getFibonacciSeries(int N) {

		if (FibonacciSeries == null) {
			FibonacciSeries = new int[N];
		}
		if (N == 1) {
			FibonacciSeries[0] = 0;
		} else if (N >= 2) {
			FibonacciSeries[0] = 0;
			FibonacciSeries[1] = 1;
		} else {
			throw new RuntimeException("Input is not correct!");
		}

		for (int i = 2; i < N; i++) {
			FibonacciSeries[i] = FibonacciSeries[i - 1]
					+ FibonacciSeries[i - 2];
		}

		return FibonacciSeries;
	}
}
