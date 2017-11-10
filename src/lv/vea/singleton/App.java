package lv.vea.singleton;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AppTimer timer = AppTimer.getInstance();

		double sum = 0;
		for (int i = 0; i < 10000000; i++) {
			sum = sum + Math.sqrt(i);
			if (i == 1000000 / 2) {
				timer.printTimer();
			}
		}
		timer.printTimer();
	}

}
