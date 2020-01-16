package co.jessie.lambda;

public class ThreadTest {
	public static void main(String[] args) {
		// 1~100까지 출력하는 홀수 //객체선언과 생성을 한꺼번에 같이함. ->익명클래스
		Thread t1 = new Thread(() -> {      //new Runnable() {  run() {} }
			for (int i = 1; i <= 100; i += 2) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();

		// 1~100까지 출력하는 짝수 
		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 100; i += 2) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// 익명클래스
		class InnerOddTask implements Runnable {
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
	}
}
