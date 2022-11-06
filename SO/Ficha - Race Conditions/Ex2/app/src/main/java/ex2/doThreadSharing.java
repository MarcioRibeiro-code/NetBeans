package ex2;

public class doThreadSharing {

	public static void main(String args[]) throws InterruptedException {
		SharedObj share = new SharedObj();
		Thread tarefa = new Thread(new Run(share), "Printer_thread");

		long startTime = System.currentTimeMillis();

		tarefa.start();
		for (int i = 0; i < 10; i++) {
			Thread tarefa2 = new Thread(new Run2(share, i));
			tarefa2.setName("Numbered_thread_" + i);
			tarefa2.start();
			tarefa2.join();

		}

		tarefa.interrupt();

		long endTime = System.currentTimeMillis();

		System.out.println("That took " + (endTime - startTime) + " milliseconds");

	}
}
