package ex2;

public class Run extends Thread {
	public SharedObj share;

	public Run(SharedObj s) {
		share = s;
	}

	public void run() {
		String myname = Thread.currentThread().getName();

		while (true) {
			synchronized (share) {
				if (Thread.interrupted())
					return;

				System.out.println("[" + myname + "] Number:" + share.getNumber() + "(" + share.getName() + ")");
			}

		}

	}

	public void setShare(SharedObj s) {
		share = s;
	}
}
