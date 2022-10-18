package EX4;

import java.util.concurrent.Semaphore;

public class doThreadSharing {

	public static void main(String args[]) throws InterruptedException {
		SharedObj share = new SharedObj();
		Thread tarefa = new Thread(new Run(share), "Printer_thread");
		BinarySemaphore sm = new BinarySemaphore(1);

		tarefa.start();
		try {

			for (int i = 0; i < 10; i++) {
				System.out.println("I:" + i);
				Thread tarefa2 = new Thread(new Run2(share, i, sm));
				tarefa2.setName("Numbered_thread_" + i);
				tarefa2.start();

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			Thread.sleep(12000);
			tarefa.interrupt();
		} catch (InterruptedException e) {
		}
	}
}
