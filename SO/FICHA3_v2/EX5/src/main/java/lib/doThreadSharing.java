package lib;

public class doThreadSharing {

  public static void main(String args[]) {
    SharedObj share = new SharedObj();
    Thread tarefa = new Thread(new Run(share), "Printer_thread");
    tarefa.start();
    int priority = 10;
    for (int i = 0; i < 10; i++) {
      final int index = i;
      Thread tarefa2 = new Thread(new Run2(share, index));
      tarefa2.setName("Numbered_thread_" + i);
      tarefa2.start();
      tarefa2.setPriority(priority--);
      try {
        tarefa2.join();

      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }

    try {
      Thread.sleep(1000);
      tarefa.interrupt();
    } catch (InterruptedException e) {
    }
  }
}
