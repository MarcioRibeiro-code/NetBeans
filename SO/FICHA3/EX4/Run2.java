package EX4;

public class Run2 extends Thread {
	public SharedObj share;
	public int n;	
	public BinarySemaphore bm;
	public Run2 (SharedObj s, int i,BinarySemaphore bm) {share=s;n=i;this.bm=bm;}
    public void run() {
		String myname=Thread.currentThread().getName();
		try{
		bm.waitForNotify();
			share.setNumber(n);
			Thread.sleep(1000);
		//share.setNumber(n);
		System.out.println("["+myname+"] Number:"+share.getNumber());
		share.setName("share.name definido por: "+myname);
		
		bm.notifyToWakeup();
		} catch (InterruptedException e) {}
    }
    public void setShare(SharedObj s){share=s;}
}
