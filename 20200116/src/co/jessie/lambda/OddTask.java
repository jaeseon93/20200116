package co.jessie.lambda;

//홀수 출력

public class OddTask implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
