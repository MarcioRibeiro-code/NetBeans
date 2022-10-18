package EX4_example;

import java.util.concurrent.Semaphore;

public class doThreadSharing {

	public static void main(String args[]) {
		SharedObj share = new SharedObj();
		Thread tarefa = new Thread(new Run(share), "Printer_thread");
		Semaphore sm = new Semaphore(1);
		tarefa.start();
		try {
	
			for (int i = 0; i < 10; i++) {
				sm.acquire();
				Thread tarefa2 = new Thread(new Run2(share, i));
				tarefa2.setName("Numbered_thread_" + i);
				tarefa2.start();
				sm.release();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			Thread.sleep(10000);
			tarefa.interrupt();
		} catch (InterruptedException e) {
		}
	}
}
