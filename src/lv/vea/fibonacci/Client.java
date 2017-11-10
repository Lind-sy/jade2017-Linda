package lv.vea.fibonacci;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		int[] myFib = FibonachiSeries.getFibonacciSeries(6);
		System.out.println(Arrays.toString(myFib));
	}
}
