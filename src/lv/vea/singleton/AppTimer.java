package lv.vea.singleton;

public class AppTimer {

	private static AppTimer timer;
	private static int seconds;
	static {
		timer = new AppTimer();
		seconds = 0;
	}

	private AppTimer() {

		Thread runTime = new Thread(new Runnable() {
			// @Override
			public void run() {
				while (seconds < 100000) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					seconds++;
				}
			}
		});

		runTime.start();
	};

	public static AppTimer getInstance() {
		return timer;

	}

	public int getSeconds() {
		return seconds;
	}

	public void printTimer() {
		System.out.println("Time has passed" + seconds);
	}
}
