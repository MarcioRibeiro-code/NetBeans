package EX4;

public class Run extends Thread{
	public SharedObj share;	

	public Run (SharedObj s) {share=s;}

    public void run() {
		String myname=Thread.currentThread().getName();
		try{
			while(true){
				if (Thread.interrupted()) return;
				//if(share.getName()==null){continue;}
				Thread.sleep(1050);
				System.out.println("["+myname+"] Number:"+share.getNumber()+"("+share.getName()+")");
				
				} 	
			} catch (InterruptedException e) {} 
		}
		
    public void setShare(SharedObj s){share=s;}
}
